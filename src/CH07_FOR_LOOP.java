public class CH07_FOR_LOOP {
    public static void main(String[] args) {
//        String name = "Mansoor Muhammad";
//        String name2 = " of Malakand ";
////        name+=name2;
//          name = name+name2;
//        System.out.println(name);
//        for(int i=1; i<5; i++){
//            System.out.println(name);
//        for(int i = 0; i<=5; i+=1){
//            System.out.println(" ");
//            for(int j =0; j<i; j++){
//                System.out.print(" * ");
//            }
//
//        }
//        int n=5;
//        for (int i=0; i<=10; i+=2){
//            System.out.println(2*n+1*i);
//        }

      for(int i = 5; i > 0; i=i-1){//5,4,3,2,1
          System.out.print(i+" ");
          for (int j=0; j<=i; ++j){//0,1,2,3,4,5
              System.out.print(j + " ");
          }
      }
    }
}
