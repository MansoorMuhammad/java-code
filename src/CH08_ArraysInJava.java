public class CH08_ArraysInJava {
    public static void main(String[] args) {


//     1. declaration and then memory allocation
//     int [] marks = new int[5];
//     2. declaration and then memory allocation in next line
//     int [] marks;
//        marks = new int[5];
//      3. declaration and then initialization and memory allocation
        float [] marks = {49.5f,78.98f,56.56f,78.01f,88.6f,89.56f };
//        marks[0] = 96;
//        marks[1] = 84;
//        marks[2] = 67;
//        marks[3] = 78;
//        marks[4] = 89;
//        System.out.println("Index of 0 :  " + marks[0] +" / 100");
//        System.out.println("Index of 3 :  " + marks[3] +" / 100");
//        System.out.println("Index of 1 :  " + marks[1] +" / 100");
//        System.out.println("Index of 2 :  " + marks[2] +" / 100");
//        System.out.println("Index of 4 :  " + marks[4] +" / 100");
        System.out.print("length: "+marks.length);
        for (int i=0; i< marks.length; i++){
            System.out.println("Value of index "+ i + " is: "+ marks[i]);
        }

    }
}
