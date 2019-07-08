/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofprimernumbers;
import java.util.Scanner;

/**
 *
 * @author Abdi Mohammed
 */
public class SumOfPrimerNumbers {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int number, minimum, maximum, i, count, sum = 0; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the minimum value: ");
        minimum = input.nextInt();
        
        System.out.print("Please enter the maximum value: ");
        maximum = input.nextInt();
        
        for(number = minimum; number <= maximum; number++)
        {
            count = 0;
            for(i = 2; i <= number/2; i++)
            {
                if(number %i == 0)
                {
                    count++;
                    break;
                }                                
            }
            if(count == 0 && number !=1)
            {
                sum =sum + number;
            }
        }
        System.out.println("The sum of Prime Numbers from " +minimum+ " to " +maximum+ " = " +sum);
    }
    
}
