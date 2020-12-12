import java.time.LocalDate;

public abstract class Drinks {
    protected String name;
    protected double cost;
    protected LocalDate Produceday ;
    protected int Shelflife;

    public boolean isLate(int Shelflife){
        LocalDate compare = Produceday.plusDays(Shelflife);
        if(LocalDate.now().isBefore(compare)){
            return  true;
        }else{
            return false;
        }
    }

    public Drinks(String name,double cost,LocalDate Produceday,int Shelife){
        this.name = name;
        this.cost = cost;
        this.Produceday = Produceday;
        this.Shelflife = Shelife;
    }

    public Drinks(){
    }

    public abstract String toString();
    }

