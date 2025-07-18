public class CH02_PS_pr2 {
    public static void main(String[] args) {
        //write a program that encrypt a grade by adding 8 to it & decrypt it to show the correct grade

        //encrypting a grade
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println("Your Encrypted grade is: " + grade);

        //decrypting a grade
        grade = (char)(grade - 8);
        System.out.println("After Decrypting grsde: " + grade);
    }
}
