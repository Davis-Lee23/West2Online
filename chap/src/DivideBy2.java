public class DivideBy2 {
    public static void main(String[] args) {
        int num1 =40;
        int receive = 0;
        while(num1 >= 2){
            num1 = num1/2;
            receive +=1;
        }
        System.out.println(receive);
    }
}
