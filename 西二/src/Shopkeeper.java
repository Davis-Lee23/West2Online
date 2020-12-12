import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Shopkeeper {
    public static void main(String[] args) {
        double balance = 1000;
        ArrayList<Beer> BeerList = new ArrayList<>();
        ArrayList<Juice> JuiceList = new ArrayList<>();
        West2FriedChickenRestauran shopkeeper = new West2FriedChickenRestauran(BeerList, JuiceList, 1000);
        for (int i = 0; i < 20; i++) {
            BeerList.add(new Beer("喜力", 4.5, LocalDate.of(2020, 12, 9), 30, 4.7));
            BeerList.add(new Beer("乌苏", 9, LocalDate.of(2020, 11, 8), 30, 4.3));
            JuiceList.add(new Juice("柠檬汁", 10, LocalDate.of(2020, 12, 9), 2));
            JuiceList.add(new Juice("雪梨汁", 10, LocalDate.now(), 2));
        }
        System.out.println("欢迎来到西二炸鸡店，请阅读以下说明");
        System.out.println("功能对应编号:[1]售卖炸鸡套餐 [2]购买原材料 [3]退出系统");
        Scanner s = new Scanner(System.in);
        System.out.println("请输入功能编号");
        int a = s.nextInt();
        if (a == 1) {//购买套餐
            System.out.println("请输入你要的套餐1-4");
            int b = s.nextInt();
            shopkeeper.sold(West2FriedChickenRestauran.MealsList.get(b - 1));
            System.out.println("剩余资金:"+shopkeeper.balance);
        }
        else if (a == 2) {//购买材料代码
            System.out.println("输入1可查看异常抛出，输入2可查看正常购买");
            int buy = s.nextInt();
            Beer Usu = new Beer("乌苏", 9, LocalDate.of(2020, 11, 8), 30, 4.3);
            if (buy == 1) {
                shopkeeper.buyingredient(Usu, 1000);//抛出异常测试
            }else{
                shopkeeper.buyingredient(Usu,11);
                System.out.println("余额还剩下"+shopkeeper.balance);//正常运行测试
            }
        }else if(a==3){//退出系统
            System.exit(0);
        }
    }
}
