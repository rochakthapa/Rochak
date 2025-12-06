import java.util.Scanner;


/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);  

        System.out.print("Enter a number: ");
        double number1=input.nextDouble();          
        System.out.println(number1);
        
        System.out.print("Enter another number: ");
        double number2=input.nextDouble();          
        System.out.println(number2);
        
        double sum=number1+number2;
        System.out.println("sum:"+sum);
        
        double subtract=number1-number2;
        System.out.println("subtraction:"+subtract);
        
        double multiply=number1*number2;
        System.out.println("multiplication:"+multiply);
        
        double divide=number1/number2;
        System.out.println("division"+divide);
        
        
    }
}