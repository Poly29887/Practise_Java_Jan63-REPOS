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
public class Day24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("\n#1 Input how many n and + n rounds");
        int n=sc.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            int cost = sc.nextInt();
            sum+=cost;
        }     
        System.out.println(sum+" THB");
        System.out.println("");
        
        
        System.out.println("\n#2 Reverse Sentence");        
        String text;
        String[] sentence=new String[1000];
        String enter=null;
        int i=-1;
        do{
            i++;
            text=sc.next();
            sentence[i]=text;
        }while(sentence[i]!=null);//13 - Ascii enter key
        for (int j = 0; j <= i; j++) {
            System.out.println(sentence[j]+" ");
        }
        System.out.println("");
    }
}
