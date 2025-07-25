import java.util.Scanner;
public class CH07_DO_WHILE_LOOP {
    public static void main(String[] args) {
        Scanner forInp = new Scanner(System.in);
        char ch = 'A';
        do{
            System.out.print(ch+" ");
            ch++;
        }while(ch<='Z');

        System.out.println("Enter a Number: ");
        int a = forInp.nextInt();
        System.out.println("The result is: ");
        do{
            System.out.println(a);
            a++;
        }while(a<=10);



    }
}
