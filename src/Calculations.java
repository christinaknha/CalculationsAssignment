import java.util.Scanner;
public class Calculations {
    public static void main(String[] args){
//      Set up scanner to look for user input
        Scanner scanner = new Scanner(System.in);

//      Ask user for first number input
        System.out.println("Enter a number: ");

//      Store user input in a variable
        int num1 = Integer.valueOf(scanner.nextLine());

//      Ask user for second number input
        System.out.println("Enter another number: ");

//      Store user input in a variable
        int num2 = Integer.valueOf(scanner.nextLine());

//      Perform mathematical operations using the two numbers
        int numsAdded = num1 + num2;
        int numsSubtracted = num1 - num2;
        int numsMultiplied = num1 * num2;
        double numsDivided = Double.valueOf(num1) / Double.valueOf(num2);
        int numsModulus = num1 % num2;

//      Print mathematical operation results
        System.out.println(num1 + " + " + num2 + " = " + numsAdded);
        System.out.println(num1 + " - " + num2 + " = " + numsSubtracted);
        System.out.println(num1 + " * " + num2 + " = " + numsMultiplied);
        System.out.println(num1 + " / " + num2 + " = " + numsDivided);
        System.out.println(num1 + " % " + num2 + " = " + numsModulus);

    }
}
