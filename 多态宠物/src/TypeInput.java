import java.util.Scanner;

public class TypeInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Please input:");
            String receive = in.nextLine();
            for (int i = 0; i < receive.length(); i++) {
                if (Character.isDigit(receive.charAt(i))) {
                    if (i == receive.length()-1) {
                        Long l = Long.valueOf(receive);
                        if (l <= Byte.MAX_VALUE && l >= Byte.MIN_VALUE) {
                            System.out.println(receive + " can be converted into a type byte!");
                        } else {
                            System.out.println(receive + " cannot be converted into a type byte!");
                        }
                        if (l <= Short.MAX_VALUE && l >= Short.MIN_VALUE) {
                            System.out.println(receive + " can be converted into a type short!");
                        } else {
                            System.out.println(receive + " cannot be converted into a type short!");
                        }
                        if (l <= Integer.MAX_VALUE && l >= Integer.MIN_VALUE) {
                            System.out.println(receive + " can be converted into a type int!");
                            System.out.println(receive + " can be converted into a type float!");
                        } else {
                            System.out.println(receive + " cannot be converted into a type int!");
                            System.out.println(receive + " cannot be converted into a type float!");
                        }
                        if (l <= Long.MAX_VALUE && l >= Long.MIN_VALUE) {
                            System.out.println(receive + " can be converted into a type long!");
                            System.out.println(receive + " can be converted into a type double!");
                            return;
                        } else {
                            System.out.println(receive + " cannot be converted into a type long!");
                            System.out.println(receive + " cannot be converted into a type double!");
                            return;
                        }
                    }

                }  else {
                    if (receive.charAt(i) == '.') {
                        Double d = Double.valueOf(receive);
                        System.out.println(receive + " cannot be converted into a type byte!");
                        System.out.println(receive + " cannot be converted into a type int!");
                        System.out.println(receive + " cannot be converted into a type short!");
                        System.out.println(receive + " cannot be converted into a type long!");
                        if (d > Double.MAX_VALUE || d < Double.MIN_VALUE) {
                            System.out.println(receive + " cannot be converted into a type float!");
                            System.out.println(receive + " cannot be converted into a type double!");
                            return;
                        } else if (d >= Float.MAX_VALUE && d <= Float.MIN_EXPONENT) {
                            System.out.println(receive + " cannot be converted into a type float!");
                            System.out.println(receive + " can be converted into a type double!");
                            return;
                        } else {
                            System.out.println(receive + " can be converted into a type float!");
                            System.out.println(receive + " can be converted into a type double!");
                            return;
                        }
                    }
                    System.out.println(receive + " cannot be converted into a type byte!");
                    System.out.println(receive + " cannot be converted into a type short!");
                    System.out.println(receive + " cannot be converted into a type int!");
                    System.out.println(receive + " cannot be converted into a type float!");
                    System.out.println(receive + " cannot be converted into a type double!");
                    break;
                }
            }
        }
    }
}
