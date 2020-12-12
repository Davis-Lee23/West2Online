import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);
        while (true) {
            String number = new String("");
            String number1 = new String("");
            String digits = new String("0123456789ABCDEF");
            int position = 0, sum = 0, position1 = 0, flag = 0;
            System.out.println("Please input a valid Octal Number: ");
            String num0 = in0.nextLine();
            if(num0.equals("exit")){
                break;
            }
            for(int i=0;i<num0.length();i++){
                if (num0.charAt(i) != '0' && num0.charAt(i) != '1' && num0.charAt(i) != '2' && num0.charAt(i) != '3' && num0.charAt(i) != '4' && num0.charAt(i) != '5' && num0.charAt(i) != '6' && num0.charAt(i) != '7') {
                    break;
                }else if(i==num0.length()-1){
                    Double num = Double.valueOf(num0);
                    while (num > 0) {
                        int k = (int) (num % 10);
                        if (k == 1 || k == 2 || k == 3 || k == 4 || k == 5 || k == 6 || k == 7) {
                            sum = sum + k * (int) (Math.pow(8, position));
                        }
                        position++;
                        num = num / 10;
                    }
                    System.out.println("Decimal:" + sum);
                    int num1 = Integer.valueOf(sum);
                    while (num1 > 0) {
                        position1 = num1 % 16;
                        number1 = digits.charAt(position1) + number1;
                        num1 = num1 / 16;
                    }
                    System.out.println("Hexadeciamal number: " + number1);
                    break;
                }
            }
        }
    }
}



