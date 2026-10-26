/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson;

/**
 *
 * @author chris
 */
import java.util.Scanner;
public class Week4 {
   
    public static void main(String[] args) {
        
        System.out.println("===Basic===");
        System.out.println(" ");
        for (int i = 1; i <= 20; i++) {
        System.out.println("Number: " + i + ", Square: " + (i * i));
        }
        System.out.println(" ");
        System.out.println("===Intermediate===");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter an integer (-1 to stop): ");
        int number = scanner.nextInt();
        while (number != -1) {
        sum += number;
        System.out.print("Enter an integer (-1 to stop): ");
        number = scanner.nextInt();
    }
        System.out.println("Final Total: " + sum);
        
        
        System.out.println("");
        System.out.println("===Advance===");
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
        if (i == 3) {
            continue;
        }
        for (int j = 1; j <= 5; j++) {
            if (j > 3) {
                break;
            }
            System.out.print(j + " ");
        }
        System.out.println();
        }
        
        System.out.println("");
        System.out.println("Expert");
        System.out.println("");
       
        int[][] warehouse = {
            {15, -1, 40},
            {5, 20, 35},
            {50, 10, -1}
        };
        int choice;
        do {
            System.out.println("\n=== Warehouse Menu ===");
            System.out.println("1. Total Inventory (Skip Damaged)");
            System.out.println("2. Find First Low Shelf (< 10)");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                int total = 0;
                for (int i = 0; i < warehouse.length; i++) {
                    for (int j = 0; j < warehouse[i].length; j++) {
                        if (warehouse[i][j] == -1) {
                            continue;
                        }
                        total += warehouse[i][j];
                    }
                }
                System.out.println("Total Inventory Count: " + total);
            } else if (choice == 2) {
                boolean found = false;
                for (int i = 0; i < warehouse.length; i++) {
                    for (int j = 0; j < warehouse[i].length; j++) {
                        if (warehouse[i][j] != -1 && warehouse[i][j] < 10) {
                            System.out.println("Low shelf found at Row " + i + ", Col " + j + " with count " + warehouse[i][j]);
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        break;
                    }
                }
            }
        } while (choice != 3);
        scanner.close();
        }

    }
   

