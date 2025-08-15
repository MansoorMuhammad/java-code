package com.company;

public class CH08_Multi_D_Arrays {
    public static void main(String[] args) {

//        method 1
//        int [][] arrayName = new int[2][3];
        // method 2
//        int[][] arrayName = {{100,101,102},{201,202,203}};
//        method 3
//        int [][] arrayName;
//        arrayName = new int[2][3];
//        arrayName[0][0]= 100;
//        arrayName[0][1]= 101;
//        arrayName[0][2]= 102;
//        arrayName[1][0]= 200;
//        arrayName[1][1]= 201;
//        arrayName[1][2]= 202;
//
//        for (int i = 0; i < arrayName.length; i++) {
//           for(int j = 0; j < arrayName[i].length; j++){
//                System.out.print(arrayName[i][j]);
//               System.out.print(" ");
////            continue;
//            }
//            System.out.print(" \n");
//        }
//        System.out.println(arrayName[1][2]);
        int[][][] floor = {{{100, 101, 102}}, {{200, 201, 202}}, {{300, 301, 302}}};
        for (int i = 0; i < floor.length; i++) {
            for (int j = 0; j < floor[i].length; j++) {
                for (int k = 0; k < floor[i][j].length; k++) {
                    System.out.print(floor[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}
