/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_jan;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TG_lopy
 */
public class Day22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n#1 Num->Char");
        System.out.print("Input a numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.printf("%c%c%c",n1,n2,n3);
        System.out.println("");
        
        
        System.out.println("\n#2 save customer's data");
        String[] data = new String[5];
        String[] type = {"Name", "Address", "Gender", "Tel"};
        for (int i = 0; i < 5; i++) 
        {
            data[i] = sc.nextLine();
        }
        System.out.println("--- Customer Detail ---");
        System.out.println(type[0] + " : " + data[0] + " " + data[1]);
        System.out.println(type[1] + " : " + data[2]);
        System.out.println(type[2] + " : " + data[3]);
        System.out.println(type[3] + " : " + data[4]);
        System.out.println("");

        
        System.out.println("\n#3 Find Max");
        int[] num=new int[3];
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
        }
        Arrays.sort(num); //arange num[] min->max
        int max=num[num.length-1];
        System.out.println("MAX : "+max);
    }

}
