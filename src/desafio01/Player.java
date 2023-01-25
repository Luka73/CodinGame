package desafio01;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            int len = bombDir.length();
            int X = X0;
            int Y = Y0;

            System.err.println("bombDir: " + bombDir);
            System.err.println("bombDir length: " + len);
            System.err.println("X0 Inicial: " + X0);
            System.err.println("Y0 Inicial: " + Y0);
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            if(len == 1) {
                char c1 = bombDir.charAt(0);
                X = moveX(c1, X);
                Y = moveY(c1, Y);
            } else if(len == 2) {
                System.err.println("Entrou no segundo if");
                char c1 = bombDir.charAt(0);
                System.err.println("C1: " + c1);
                char c2 = bombDir.charAt(1);
                System.err.println("C2: " + c2);
                X = moveX(c1, X);
                Y = moveY(c1, Y);
                X = moveX(c2, X);
                Y = moveY(c2, Y);
                System.err.println("X apos mover: " + X);
                System.err.println("Y apos mover: " + Y);
            }
            // the location of the next window Batman should jump to.
            System.out.printf("(%s, %s)", X, Y);
        }
    }


    public static int moveX(char direction, int X) {
        switch (direction) {
            case 'D':
                return X + 1;
            case 'U':
                return X - 1;
            default:
                return X;
        }
    }

    public static int moveY(char direction, int Y) {
        switch (direction) {
            case 'R':
                return Y + 1;
            case 'L':
                return Y - 1;
            default:
                return Y;
        }
    }
}