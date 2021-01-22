/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_jan;

import java.util.Scanner;

/**
 *
 * @author TG_lopy
 */
public class Day18 {

    public static double distance2Point(double x1, double x2, double y1, double y2) {
        double d = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5); //Math.pow(a,0.5) = squre root a
        return d;
    }

    public static void areaHexagon() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side : ");
        double s = input.nextDouble();
        double areaHexa = ((3 * Math.pow(3, 0.5) / 2) * (s * s));
        System.out.printf("The distance between the two points is %.4f", areaHexa);
    }

    public static double areaTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side1 = distance2Point(x1, x2, y1, y2);
        double side2 = distance2Point(x2, x3, y2, y3);
        double side3 = distance2Point(x1, x3, y1, y3);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;
    }
    
    public static void drivingCost() {
        Scanner input = new Scanner(System.in);    
        
        System.out.print("Enter driving distance : ");
        float distance=input.nextFloat();
        System.out.print("Enter miles per gallon : ");
        float mile_gallon=input.nextFloat();                     
        System.out.print("Enter price per gallon : ");
        float price_gallon=input.nextFloat();
        
        float gallon =distance/mile_gallon;
        float cost=price_gallon*gallon;
        
        System.out.printf("The cost of Driving is %.2f",cost);     
        System.out.print(" baht");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        
        System.out.println("\n#1 Distance between 2 point");

        System.out.print("Enter x1 and y1 : ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        System.out.print("Enter x2 and y2 : ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.println("The distance between the two points is " + distance2Point(x0, x, y0, y));
        System.out.println("");
        

        System.out.println("\n#2 Area of Hexagon");//Ask TA
        areaHexagon();
        System.out.println("");
        
        System.out.println("\n#3 Area of Triangle");
        System.out.printf("The area of the triangle is %.2f",areaTriangle());
        System.out.println("");
        
        System.out.println("\n#4 Cost of Driving");
        drivingCost();
        System.out.println("");

    }

}
