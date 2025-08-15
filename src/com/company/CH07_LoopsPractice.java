package com.company;
import java.util.Scanner;
public class CH07_LoopsPractice {
    public static void main(String[] args) {
        /* practice problem 1
         * * * * n-i = 4-0
         * * * 4-1
         * * 4-2
         * 4-3
         */
//        int n = 4;
//        for(int i=n; i>0; i=i-1){//reverse loop
//            for (int j =0; j<i; j++){
//            System.out.print(" * ");
//            }
//            System.out.print("\n");
//
//        }

        //problem no # 02
        Scanner forInp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=3;
        int sum =0;
        int i=0;
        while(i<n){
            sum += (2+i); //2*0=0 2*1=2 2*2=4
            i++;
        }
        System.out.println("Sum is: "+sum);
//        //problem no # 02
//        Scanner forInp = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = forInp.nextInt();
//
////        int n=3;
//        int sum =0;
//        int i=0;
//        while(i<n){
//            sum += i; //2*0=0 2*1=2 2*2=4
//            i++;
//        }
//        System.out.println("Sum is: "+sum)
    }
}
