import java.util.Scanner;

public class binToDec {
    public static void main(String[] args) {
        String target= "A Java program must have one or more classes. The name of the source file and the name of the class must be the same. If we want make a Java program executable, we must provide a main method The main method is an indicator and a signature for Java Virtual Machine to find the entry point of the program for execution.";
        String yuanyin ="aeiou";
        String reverse = new String();
        String sum = new String();
        int start = 0;
        int end = target.length()-1;
        for(int i = target.length()-1;i>=0;i--){
            if(target.charAt(i)=='.'||target.charAt(i)==','||target.charAt(i)==' ') {
                if(target.charAt(i-1)=='.'||target.charAt(i-1)==','||target.charAt(i-1)==' '){//消除逗号句号空白
                    start=i;
                    reverse=target.substring(start,end);
                    sum += reverse;
                    i--;
                    end=start-1;
                    continue;
                }else{
                    start=i;
                    reverse=target.substring(start,end);
                    for(int h =0;h<reverse.length();h++){
                        int out = 0;//助教教的
                        for(int k=0;k<yuanyin.length();k++){
                            if(yuanyin.charAt(k)==reverse.charAt(h)){
                                sum += reverse;
                                end = start;
                                out =1;
                                break;
                            }
                        }if(out ==1){break;}
                    }
                }
            }
        }
        System.out.println(sum+"A");
    }
}
