package FromUser2;
import java.util.Scanner;

public class FromUser {
    public static void main(String[] args) {
//        System.out.println("Taking Input from the user: ");
        Scanner forInp = new Scanner(System.in);
//        boolean b1= forInp.hasNextInt();
//        System.out.println(b1);
        System.out.print("Enter Your Name: ");
        String str = forInp.nextLine();
        System.out.println(str);
    }
}
