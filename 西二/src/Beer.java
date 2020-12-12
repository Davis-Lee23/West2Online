import java.time.LocalDate;

public class Beer extends  Drinks{
    double Alcoholdegree;

    public Beer(String name,double cost,LocalDate Produceday,int Shelife,double Alcoholdegree){
       super(name, cost, Produceday, Shelife);
       this.Alcoholdegree = Alcoholdegree;
    }

    public Beer(){
    }

    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", Produceday=" + Produceday +
                ", Shelflife=" + Shelflife +
                '}';
    }

}


