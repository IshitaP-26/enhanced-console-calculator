import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {

            System.out.println("\n===== Enhanced Console Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 8) {
                System.out.println("Thank you for using Calculator!");
                break;
            }

            try {

                if (choice == 7) {

                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();

                    double result = calculator.squareRoot(num);

                    System.out.println("Result = " + result);

                } else {

                    System.out.print("Enter first number: ");
                    double a = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    double b = sc.nextDouble();

                    double result = 0;

                    switch (choice) {

                        case 1:
                            result = calculator.add(a, b);
                            break;

                        case 2:
                            result = calculator.subtract(a, b);
                            break;

                        case 3:
                            result = calculator.multiply(a, b);
                            break;

                        case 4:
                            result = calculator.divide(a, b);
                            break;

                        case 5:
                            result = calculator.modulus(a, b);
                            break;

                        case 6:
                            result = calculator.power(a, b);
                            break;

                        default:
                            System.out.println("Invalid Choice!");
                            continue;
                    }

                    System.out.println("Result = " + result);
                }

            } catch (CalculatorException e) {
                System.out.println("Error: " + e.getMessage());
            }

        }

        sc.close();
    }
}
