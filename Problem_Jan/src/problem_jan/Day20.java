/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_jan;

import java.util.Scanner;

public class Day20 {

    public static int randomIntRange(int max, int min) {
        int x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    public static void randomMonth() {
        int n = randomIntRange(12, 1);
        String month = "";
        System.out.println("Random number => " + n);
        switch (n) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }
        System.out.println("Month : " + month);
    }

    public static void pyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                
                    System.out.print("$ ");
               
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        System.out.println("\n#1 Month's name");
        randomMonth();
        System.out.println("");

        System.out.println("\n#2 pyramid");
        pyramid();
        System.out.println("");

    }
}
