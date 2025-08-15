package com.company;

public class CH04_BitWiseOperatorsInJava {
    public static void main(String[] args) {
        int a = 5;   // 0101 in binary
        int b = 3;   // 0011 in binary

        System.out.println("a = " + a + ", b = " + b);

        // Bitwise AND
        System.out.println("a & b: " + (a & b)); // 0101 & 0011 = 0001 (1)

        // Bitwise OR
        System.out.println("a | b: " + (a | b)); // 0101 | 0011 = 0111 (7)

        // Bitwise XOR
        System.out.println("a ^ b: " + (a ^ b)); // 0101 ^ 0011 = 0110 (6)

        // Bitwise Complement
        System.out.println("~a: " + (~a));       // Inverts bits

        // Left shift
        System.out.println("a << 1: " + (a << 1)); // 0101 << 1 = 1010 (10)

        // Right shift
        System.out.println("a >> 1: " + (a >> 1)); // 0101 >> 1 = 0010 (2)

        // Unsigned right shift
        int c = -8; // In binary: 11111111111111111111111111111000
        System.out.println("c >>> 2: " + (c >>> 2)); // Shifts with 0-fill
    }
}
