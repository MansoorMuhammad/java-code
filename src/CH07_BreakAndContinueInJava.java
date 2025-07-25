public class CH07_BreakAndContinueInJava {
    public static void main(String[] args){
        //break through for loop
//        for (int i =0; i<5; i+=1){// 0 1 2 3 4 5
//            System.out.print(i+1 + ". ");
//            System.out.println("Hello There ");
//            // 0 1 2
//            if(i == 2){
//                System.out.println();
//                System.out.println("ending.......");
//                break;
//                continue;
//            }
//        }

        // break through while loop
//        int j = 0;
//        while(j<5){ // 0 1 2 3 4
//            System.out.print(j+1 + ". ");
//            System.out.println("Welcome to java programming");
//            if(j == 1){ // 0 1
//                System.out.println();
//                System.out.println(" The loop is now Terminating........");
//                break;
//            }
//            j++;
//        }
        // break through do while
//        int i=0; // 0 1 2 3 4 5
//        do {
//            System.out.print(i + 1 + ". ");
//            System.out.println("Java is not difficult !");
//            if (i == 4){
//                System.out.println();
//                System.out.println(" Terminating.........");
//            break;
//        }
//            i++;
//        }while(i<6);

        //continue through for loop
//        for(int i=0; i<10; i++){// 0 1 2 3 4 5 6 7 8 9
//            if(i==1){
//                System.out.println("Skipping ....");
//                continue;
//            }
//            System.out.print(i+1 + ". ");
//            System.out.println("Today we all are doing java");
//        }

        //continue through while loop
        int i = 0;
        while(i<=9){
            i=i+1;//updation 0 1 2 3 4 5 6 7 8
            if(i==2){
                System.out.println("Skipping....");
                continue;
            }
            System.out.print(i + ". ");
            System.out.println("Here i am !");
        }

        //continue through do-while loop
//        int i=0;
//        do{
//            i++;
//            if(i==2){
//                System.out.println("skipping...");
//                continue;
//            }
//            System.out.print(i +". ");
//            System.out.println("Hello World! ");
//        }while(i<9);
    }
}
