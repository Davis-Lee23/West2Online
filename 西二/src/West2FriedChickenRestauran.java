import java.time.LocalDate;
import java.util.ArrayList;

public class West2FriedChickenRestauran implements  FriedChickenRestaurant{
    double balance =100;
    ArrayList<Beer> BeerList;
    ArrayList<Juice> JuiceList;
    static ArrayList<SetMeal> MealsList = new ArrayList<>();
    //选择原因:因为LinkedList还没看。。。。

    static {
        Beer Heineken = new Beer("喜力",4.5, LocalDate.of(2020,12,9),30,4.7);
        Beer Usu = new Beer("乌苏",9,LocalDate.of(2020,11,8),30,4.3);
        Juice lemon = new Juice("柠檬汁",10,LocalDate.of(2020,12,9),2);
        Juice peer = new Juice("雪梨汁",10,LocalDate.now(),2);
        SetMeal meals1 = new SetMeal("喜力鸡块套餐","炸鸡块",15,Heineken);
        SetMeal meals2 = new SetMeal("乌苏夺命鸡排套餐","炸鸡排",22,Usu);
        SetMeal meals3 = new SetMeal("柠檬炸鸡条套餐","炸鸡条",20,lemon);
        SetMeal meals4 = new SetMeal("雪梨鸡米花套餐","鸡米花",18,peer);
        MealsList.add(0,meals1);
        MealsList.add(1,meals2);
        MealsList.add(2,meals3);
        MealsList.add(3,meals4);
    }
    public West2FriedChickenRestauran(ArrayList<Beer> B,ArrayList<Juice> J,double balance){
        this.BeerList = B;
        this.JuiceList= J;
        this.balance = balance;
    }

    private String use(Beer beer) throws IngredientSortOutException{
        for (int k = 0; k <  BeerList.size(); k++) {//遍历BeerList
            if (BeerList.get(k).isLate(beer.Shelflife) == true) {

            } else {
                BeerList.remove(k);   //去掉过期啤酒
            }
        }
        try {
            for(int q = 0 ;q < BeerList.size();q++){
                if(BeerList.get(q).name.equals(beer.name)){
                    break;
                }else if(q == BeerList.size()-1){
                      throw new IngredientSortOutException("该啤酒已售光需补充:"+beer.name);//只差不会提示补充，其他功能大体实现了
                }
            }
        }
        catch (IngredientSortOutException a){
            a.getMessage();
        }
        for(int i =0;i<BeerList.size();i++){
            if(beer.name.equals(BeerList.get(i).name)){
                BeerList.remove(i);
                return "售卖成功";
            }
        }return "";
    }

    private void use(Juice juice)throws IngredientSortOutException{
        for (int k = 0; k < JuiceList.size(); k++) {
            if(JuiceList.get(k).isLate(juice.Shelflife) == true) {//判断是否过期
            } else {
                JuiceList.remove(k);   //去掉过期果汁
            }
        }
        try {
            for(int q = 0 ;q < JuiceList.size();q++){
                if(JuiceList.get(q).name.equals(juice.name)){
                    break;
                }else if(q == JuiceList.size()-1){
                    throw  new IngredientSortOutException("该饮料已售光需补充:"+juice.name);
                }
            }
        }
        catch (IngredientSortOutException a){
            a.getMessage();
        }
        for(int i =0;i<JuiceList.size();i++){
            if(juice.name.equals(JuiceList.get(i).name)){
                JuiceList.remove(i);
                System.out.println("售卖成功");
                break;
            }
        }
    }

    public void sold(SetMeal meal) {
        if(meal.drinks instanceof Beer){
            use((Beer) meal.drinks);
            String a = this.use((Beer) meal.drinks);
            if(a.equals("售卖成功")){
                balance += meal.cost;
            }else{
                System.out.println("售卖失败");
            }
        }
        else{
            use((Juice)meal.drinks);
            String b = this.use((Beer) meal.drinks);
            if(b.equals("售卖成功")){
                balance += meal.cost;
            }else{
                System.out.println("售卖失败");
            }
        }
    }
//购买材料代码块
    public void buyingredient(Drinks drinks, int num) throws  OverdraftBalanceException {
        try {
            if (balance < num * drinks.cost) {
                double abs = Math.abs(balance - num * drinks.cost);
                throw new OverdraftBalanceException("余额不足以购买材料还差" + abs + "元");
            }
        } catch (OverdraftBalanceException a) {
            System.out.println(a.getMessage());
        }
        if (balance < num * drinks.cost){
            return;
        }
        this.balance =balance- num * drinks.cost;  //若没抛出异常，余额开始扣除
        if (drinks instanceof Beer) {
            System.out.println("购买啤酒");
            if (drinks.name == "喜力") {
                System.out.println("买了喜力" + num + "瓶");
            } else if (drinks.name == "乌苏") {
                System.out.println("买了乌苏" + num + "瓶");
            }
            for(int i = num;i>0;i--){
                Beer beer = new Beer(drinks.name,drinks.cost,LocalDate.now(),drinks.Shelflife,((Beer) drinks).Alcoholdegree);
                BeerList.add(beer);
            }
        } else if (drinks instanceof Juice) {
            System.out.println("购买果汁");
            if (drinks.name == "柠檬汁") {
                System.out.println("买了柠檬汁" + num + "瓶");
            } else if (drinks.name == "雪梨汁") {
                System.out.println("买了雪梨汁" + num + "瓶");
            }
            for(int i = num;i>0;i--){
                Juice juice = new Juice(drinks.name,drinks.cost,LocalDate.now(),drinks.Shelflife);
                JuiceList.add(juice);
            }
        }return ;
    }
}
