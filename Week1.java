
package Lesson;

/**
 *
 * @author chris
 */
import java.util.Arrays;

public class Week1 {
    public static void main(String[] args) {
        
            byte age = 20;
            int height = 167;
            boolean stat = true;
            char in = 'P';
            String name = "Christian P. Teston";

            System.out.println("=Week 1 Basic=");
            System.out.println("Age: " + age );
            System.out.println("Height(cm): " + height);
            System.out.println("Initial: " + in);        
            System.out.println("Enrolled: " + stat);
            System.out.println(name);
        
        System.out.println("================================================");
            System.out.println("=Week 2 Intermediate=");
            int qty = 20;
            double uP = 4.80, tcost;
            String sname = "Chris Store :D";
            tcost = uP * qty;
            
            System.out.println(sname);
            System.out.println("Quantity: " + qty);
            System.out.println("Unit Price: " + uP);
            System.out.println("Total Cost: " + tcost);
            // total cost should not be int because the unit prices contains a decimal usually so we use double to be more accurate.
            
        System.out.println("================================================");
            System.out.println("=Week 3 Advanced=");    
       
            double totalCentimeters = 354.75;

            int meters = (int) (totalCentimeters / 100);
            double remainingCentimeters = totalCentimeters % 100;

            System.out.println("\nConversion Result");
            System.out.println("\nTotal Centimeters: " + totalCentimeters + " cm");
            System.out.println("Whole Meters: " + meters + " m");
            System.out.println("Remaining Centimeters: " + remainingCentimeters + " cm");

      
            int wholeValue = 42;
            double widenedValue = wholeValue; 

            System.out.println("\nType Casting Examples ");
            System.out.println("\nImplicit Widening (int " + wholeValue + " to double): " + widenedValue);

            double doubleValue = 99.85;

            int narrowedValue = (int) doubleValue; 

            System.out.println("Explicit Narrowing (double " + doubleValue + " to int): " + narrowedValue);
            
        System.out.println("================================================"); 
            
            System.out.println("=Week 4 Expert="); 
             
            System.out.println("--- 1. OVERFLOW DEMONSTRATION ---");
            byte maxByte = 127; 
            System.out.println("Original byte value: " + maxByte);
            maxByte++; 
            System.out.println("Value after increment (++): " + maxByte);


            
        System.out.println("\n--- 2. STRING COMPARISON DEMONSTRATION ---");
              
            String a = new String("Java");
            String b = new String("Java");
            String c = "Java";
            
            System.out.println("a==b: " + (a==b));
            System.out.println("a equals b: " + a.equals(b)); //it becames true because it uses a ".equals"
                
            System.out.println("================================================");
            
            System.out.println("This is a number: " + (int)(Math.random()*100) + 1);
                
                
                
                
                
        System.out.println("\n--- 3. SHARED ARRAY REFERENCE DEMONSTRATION ---");
            int[] first = {10, 20, 30};
            int[] second = first; 

            System.out.println("Before modification:");
            System.out.println("originalArray: " + Arrays.toString(first));
            System.out.println("sharedArray:   " + Arrays.toString(second));

            
            second[0] = 99;

            System.out.println("\nAfter modifying");
            System.out.println("originalArray: " + Arrays.toString(first));
            System.out.println("sharedArray:   " + Arrays.toString(second));
 
            
                
            System.out.println("================================================");
            System.out.print("This is a number: ");
            System.out.println((int)(Math.random()*100) + 1);
    }
}
             
            
            
            
            
            
            
            
            
            
            
            
            
            
            
   
