package com.company;

public class CH04_AssignmentOperatorsInJava {
    public static void main(String[] args) {
        int a = 10;  // simple assignment
        System.out.println("Initial value of a: " + a);

        // Addition assignment
        a += 5; // a = a + 5
        System.out.println("After a += 5: " + a);

        // Subtraction assignment
        a -= 3; // a = a - 3
        System.out.println("After a -= 3: " + a);

        // Multiplication assignment
        a *= 2; // a = a * 2
        System.out.println("After a *= 2: " + a);

        // Division assignment
        a /= 4; // a = a / 4
        System.out.println("After a /= 4: " + a);

        // Modulus assignment
        a %= 3; // a = a % 3
        System.out.println("After a %= 3: " + a);

        // Bitwise AND assignment
        a &= 1; // a = a & 1
        System.out.println("After a &= 1: " + a);

        // Bitwise OR assignment
        a |= 2; // a = a | 2
        System.out.println("After a |= 2: " + a);

        // Bitwise XOR assignment
        a ^= 3; // a = a ^ 3
        System.out.println("After a ^= 3: " + a);

        // Left shift assignment
        a <<= 1; // a = a << 1
        System.out.println("After a <<= 1: " + a);

        // Right shift assignment
        a >>= 1; // a = a >> 1
        System.out.println("After a >>= 1: " + a);

        // Unsigned right shift assignment
        a >>>= 1; // a = a >>> 1
        System.out.println("After a >>>= 1: " + a);
    }
}
