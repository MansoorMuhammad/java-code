package com.company;

public class CH09_MethodOverLoadinginJava {
    public static void main(String[] args) {


        // creating the object of the class
//        CH09_MethodOverLoadinginJava forObj = new CH09_MethodOverLoadinginJava();
//        System.out.println();
//        System.out.println("Calling the Method");
//        forObj.myJoke();
//        System.out.println("Some famous jokes in Java:");
//        // Calling the overloaded methods
//        CH09_MethodOverLoadinginJava obj = new CH09_MethodOverLoadinginJava();
//        System.out.println();
//        obj.myJoke();


//        CH09_MethodOverLoadinginJava obj = new CH09_MethodOverLoadinginJava();

//        int c;
//        c= obj.sumOf(5, 7);
//        System.out.println("Sum is: " + c);

//            // case:1 changing the integer
//            int [] marks = {10, 20, 30, 40, 50};
//            int a = 45;
//            change(a);
//            System.out.println("Value of a after change method: " + a);

        //case:2 chaning the array index
//            int [] marks = {10, 20, 30, 40, 50};
//            change2(marks);
//            System.out.println("Value of marks[0] after change2 method: " + marks[0]);

        CH09_MethodOverLoadinginJava obj = new CH09_MethodOverLoadinginJava();
        int sum1 = obj.Add(5, 10); //x:5 & y;10 are known as arguments
        int sum2 = obj.Add(5, 10, 15);
        System.out.println("Sum of two numbers: " + sum1);
        System.out.println("Sum of three numbers: " + sum2);


    }

//             void myJoke(){
//        System.out.println("This is a joke method with no parameters.");
//        System.out.println("Why don't scientists trust atoms? Because they make up everything!");
//    }
//
//    void myJoke(){
//        System.out.println();
//        System.out.println("This is a joke method with no parameters in java.");
//        System.out.println();
//        System.out.println("Why the whole class needs to bunk? bcz it is a university class!");
//        return "You know, I once told a chemistry joke... but there was no reaction!";


//    int sumOf(int x, int y){
//        int z = x + y;
//        return z;
//    }


    //    static void  change(int x){
//            x=98;
//    }
//
//    static void change2(int[] arr){
//            arr[0]=109;
//    }
    int Add(int x, int y) {// x & y are known as parameters
        // method overloading of two numbers
        return x + y;
    }
    int Add(int x, int y, int z) {
        // method overloading of three numbers
        return x + y + z;
    }

}
