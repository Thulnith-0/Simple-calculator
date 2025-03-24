import java.util.Objects;
import java.util.Scanner;

public class Simple_calculator {
    public static void main(String[] args) {
        System.out.println("""
                ...Simple Calculator...
                Please select the Mathematical operator you want.
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                
                ● If you want to restart, press 0.
                ● If you want to exit, press 5.
                """);


        //Initialize the scanner object
        Scanner choice = new Scanner(System.in);
            try {
                System.out.print("Enter your choice: ");
                int operator = choice.nextInt();
                if (operator >= 0 && operator <= 5) {
                    flow(operator);
                } else {
                    System.out.println("Invalid choice. Please select a valid operator.");
                }

            } catch (Exception e) {
                System.out.println("Invalid choice. Please select a valid operator or press 0 to restart.");
                main(null);
            }
    }

    static void flow(int operator){
        Scanner input = new Scanner(System.in);
        if (operator == 0){
            System.out.println("""
                    
                    Restarting the calculator...
                    """);
            main(null);
        } else if (operator == 5) {
            System.out.println("Thank you for using the calculator.");
            System.out.println("Exiting...");
            System.exit(0);

        }
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        switch (operator){
            case 1: {
                System.out.printf("%s + %s = %s",num1,num2,addition(num1, num2));
                exit_func();
                break;
            }
            case 2: {
                System.out.printf("%s - %s = %s",num1,num2,subtraction(num1, num2));
                exit_func();
                break;
            }
            case 3: {
                System.out.printf("%s * %s = %s",num1,num2,multiplication(num1, num2));
                exit_func();
                break;
            }
            case 4: {
                System.out.printf("%s / %s = %s",num1,num2,division(num1, num2));
                exit_func();
                break;
            }

        }
    }

    public static int addition(int num1, int num2){
        return num1 + num2;
    }

    public static int subtraction (int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication (int num1, int num2) {
        return num1 * num2;
    }

    public static double division (int num1, int num2){
        return (double)num1 / num2;
    }

    public static void exit_func(){
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("""
           \s
            Are you want to restart the calculator? (Y/N) :\s
           \s""");
            String rs = input.next();
            rs = rs.toLowerCase();
            if (Objects.equals(rs, "y")) {
                main(null);
                break;
            } else if (Objects.equals(rs, "n")) {
                System.out.println("Thank you for using the calculator.");
                System.out.println("Exiting...");
                System.exit(0);
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}