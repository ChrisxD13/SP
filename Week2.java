
package Lesson;

/**
 *
 * @author chris
 */
import java.util.Scanner;
public class Week2 {
    public static void main(String[] args) {
        System.out.println("===Basic===");
        System.out.println("                               ");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Addition (+): " + (num1 + num2));
        System.out.println("Subtraction (-): " + (num1 - num2));
        System.out.println("Multiplication (*): " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division (/): " + ((double) num1 / num2));
            System.out.println("Modulo (%): " + (num1 % num2));
        } else {
            System.out.println("Division (/): Error (Division by zero)");
            System.out.println("Modulo (%): Error (Modulo by zero)");
        }

        scanner.close();
        
        System.out.println("                                   ");   
        
        System.out.println("===Intermediate===");
        int abs = 5, grade = 93;
        System.out.println("                                   "); 
        
        System.out.println("Grade: " + grade);
        System.out.println("Absences: " + abs);
        if (grade >= 90){
            System.out.println("PASS because average grade is greater than 90 regardless of absence");
        }
        else if (grade >=75 && abs <= 3){
            System.out.println("PASS because grade is Greater or equal than 75 and have less or equal than 3 absences");
        }
        else if (grade < 75 && abs > 3){
            System.out.println("FAIL because both requirements didnt meet");
        }
        System.out.println("                                   "); 
        
        System.out.println("===Advanced===");
        System.out.println("                                   "); 
        
        double balance = 1000.0;
        System.out.println("Initial Balance: " + balance);

        balance += 250.0; 
        System.out.println("After first step (+= 250.0): " + balance);

        balance *= 1.08; 
        System.out.println("After second step (*= 1.08): " + balance);

        balance += 500.0; 
        System.out.println("After third step (+= 500.0): " + balance);

        System.out.println();

       

     
        int count = 10;
        System.out.println("=== Postfix Increment Test ===");
        System.out.print("Result of printing count++ inside println(): ");
        System.out.println(count++); 
        System.out.print("Value of count immediately after: ");
        System.out.println(count);   

        System.out.println();

        System.out.println("=== Prefix Increment Test ===");
        System.out.print("Result of printing ++count inside println(): ");
        System.out.println(++count);
        System.out.print("Value of count immediately after: ");
        System.out.println(count);
        
        //count++ and count++ is different. count++ increments after but the other increments first.
        
        System.out.println("                          ");
        System.out.println("Expert");
        System.out.println("                          ");
        
        System.out.println("=== Precedence Puzzle Solver ===");
        //Prediction = True
        int a = 5, b = 10;
        boolean result1 = ++a * 2 > b - 3 && b++ < 15;
        System.out.println("Expression 1 Actual Result: " + result1);
        System.out.println("Final value of a: " + a + ", b: " + b);

        System.out.println();
        //Prediction = False
        int x = 4, y = 3;
        boolean result2 = x++ + ++y * 2 >= 11 || --x == 3;
        System.out.println("Expression 2 Actual Result: " + result2);
        System.out.println("Final value of x: " + x + ", y: " + y);

        System.out.println();
        //Prediction = False
        int p = 2, q = 5;
        boolean result3 = !(p * 3 > q) && q++ - p == 2;
        System.out.println("Expression 3 Actual Result: " + result3);
        System.out.println("Final value of p: " + p + ", q: " + q);
    }
    
}
