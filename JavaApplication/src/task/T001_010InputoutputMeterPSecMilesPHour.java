/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class T001_010InputoutputMeterPSecMilesPHour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double MPh = 0,KmPh=0;
        System.out.println("==================================================");
        System.out.println("========Meter per Second to Miles Per Hour========");
        System.out.println("==================================================");
        System.out.print("Enter Meter per sec : ");
        double mps = sc.nextDouble();
        KmPh = mps*3600/1000;
        MPh = mps*3600*0.6213712/1000;
        System.out.println("==================================================");
        System.out.println("Meter per Second : "+mps+".");
        System.out.println("KiloMeter per Hour : "+KmPh+".");
        System.out.println("Miles per Hour : "+MPh+".");
        System.out.println("==================================================");
    }
}
