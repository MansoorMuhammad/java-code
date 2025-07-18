import java.util.Scanner;

public class CH03_InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Data From the user***");
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number :");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is: "+sum);
        int average;
        average = sum / 2;
        System.out.println("Average is: "+ average);
        int diff = a-b;
        System.out.println("diff is: "+ diff);

    }
}