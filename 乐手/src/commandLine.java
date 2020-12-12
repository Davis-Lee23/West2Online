import java.io.EOFException;

public class commandLine {
    public static void main(String args[]) throws EOFException {
        String fname = new String(args[0]);
        String lname = new String(args[1]);
        System.out.println("First name: " + fname);
        System.out.println("Last name: " + lname);
    }
}