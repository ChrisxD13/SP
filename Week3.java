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
public class Week3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===Basic===");
        System.out.println("             ");
        char ans;
        do{
        System.out.print("Enter your Score:");
        int score = scanner.nextInt();
        
        if (score >= 60){
            System.out.println("You Passed!");
        }
        else System.out.println("Failed");
            
        System.out.print("Another?(Y/N): ");
        ans = scanner.next().charAt(0);
        
        }
        
        while (ans =='Y' || ans == 'y');
        
        
        System.out.println("          ");
        System.out.println("===Intermediate");
        System.out.println("           ");
        double purchaseAmount = 200.00; 
        double discountPercentage = 0.0;
        double fin = 0.0;

        if (purchaseAmount >= 500.0) {
        fin = purchaseAmount + (purchaseAmount * 0.15); 
        } else if (purchaseAmount >= 300.0) {
        fin = purchaseAmount + (purchaseAmount * 0.10); 
        } else if (purchaseAmount >= 100.0) {
        fin = purchaseAmount + (purchaseAmount * 0.05); 
        } else {
         discountPercentage = 0.0;  
        }

        System.out.println("Purchase Amount: $" + purchaseAmount);
        System.out.println("Discount: " + (discountPercentage * 100) + "%");
        System.out.println("Total: " + fin);
        
        System.out.println("             ");
        System.out.println("===Advance===");
        System.out.println("             ");
        String inputUser, inputPass;
        
        String correctUser = "Chris";
        String correctPass = "Tian";
        boolean isAccountLocked = false;

        
        System.out.println("Enter user: ");
        inputUser = scanner.next();
        System.out.println("Enter pass: ");
        inputPass = scanner.next();
        
        
        if (inputUser.equals(correctUser)) {
            
            
            if (inputPass.equals(correctPass)) {
                
                
                if (!isAccountLocked) {
                    System.out.println("Success: Login successful! Welcome.");
                } else {
                    
                    System.out.println("Failure: Account is locked. Please contact support.");
                }
                
            } else {
                
                System.out.println("Failure: Incorrect password.");
            }
            
        }
        else  {
            System.out.println("Failure: Incorrect username.");
        }    
            
        
            
            
            
            
        System.out.println("           ");
        System.out.println("===Expert===");
        System.out.println("           ");
            
        String correctUsername = "Chris";
        int correctPin = 1234;

        System.out.println("=== ATM Transaction Authorizer ===");
        
       
        System.out.print("Enter Username: ");
        String inputUsername = scanner.next();
        
        System.out.print("Enter 4-digit PIN: ");
        int inputPin = scanner.nextInt();

 
        if (inputUsername.equals(correctUsername)) {
            if (inputPin == correctPin) {
                
                
                System.out.print("Enter account balance : ");
                double balance = scanner.nextDouble();
                
                System.out.print("Enter withdrawal amount : ");
                double withdrawalAmount = scanner.nextDouble();
                
             
                String tier = "";
                if (balance >= 10000.0) {
                    tier = "Platinum";
                } else if (balance >= 5000.0) {
                    tier = "Gold";
                } else if (balance >= 2000.0) {
                    tier = "Silver";
                } else {
                    tier = "Bronze";
                }
                
              
                boolean isBalanceSufficient = false;
                boolean isWithinDailyLimit = false;
                
              
                double dailyLimit = 0.0;
                switch (tier) {
                    case "Platinum":
                        dailyLimit = 5000.0;
                        break;
                    case "Gold":
                        dailyLimit = 3000.0;
                        break;
                    case "Silver":
                        dailyLimit = 1500.0;
                        break;
                    case "Bronze":
                    default:
                        dailyLimit = 500.0;
                        break;
                }

                if (withdrawalAmount <= balance) {
                    isBalanceSufficient = true;
                    if (withdrawalAmount <= dailyLimit) {
                        isWithinDailyLimit = true;
                    }
                }

              
                double feePercentage = 0.0;
                switch (tier) {
                    case "Platinum":
                        feePercentage = 0.00; 
                        break;
                    case "Gold":
                        feePercentage = 0.01;
                        break;
                    case "Silver":
                        feePercentage = 0.02; 
                        break;
                    case "Bronze":
                    default:
                        feePercentage = 0.03; 
                        break;
                }

              
                System.out.println("\n--- Transaction Results ---");
                if (!isBalanceSufficient) {
                    System.out.println("DENIED: Insufficient account balance.");
                } else if (!isWithinDailyLimit) {
                    System.out.println("DENIED: Withdrawal exceeds the daily limit for " + tier + " tier (" + dailyLimit + ").");
                } else {
                    double fee = withdrawalAmount * feePercentage;
                    double totalDeduction = withdrawalAmount + fee;
                    System.out.println("APPROVE: Transaction successful!");
                    System.out.println("Account Tier: " + tier);
                    System.out.println("Withdrawal Amount: " + withdrawalAmount);
                    System.out.println("Transaction Fee (" + (feePercentage * 100) + "%): " + fee);
                    System.out.println("Total Deducted: " + totalDeduction);
                }

            } else {
                System.out.println("DENIED: Incorrect 4-digit PIN].");
            }
        } else {
            System.out.println("DENIED: Incorrect username.");
        }
        
        scanner.close();
    
                }
    
    
            }
    
 
    