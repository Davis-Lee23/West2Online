public class Factorial {
    public static void main(String[] args) {
        long num = 17;
        long receive = 1;
        while(num > 1){
            receive = num*receive;
            num = num -1;
        }System.out.println(receive);
    }
}
