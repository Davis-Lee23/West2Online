import java.time.LocalDate;

public class Juice extends  Drinks {

    public Juice(String name, double cost, LocalDate Produceday, int Shelife) {
        super(name, cost, Produceday, Shelife);
    }

    public Juice(){
    }

    public String toString() {
        return "Juice{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", Produceday=" + Produceday +
                ", Shelflife=" + Shelflife +
                '}';
    }

}



