import java.util.Scanner;

public class Main {

    public static void main(String [] args) throws Exception {

        int a, b, result;
        int trials = 1;

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while(trials !=0) {

            System.out.println("Enter the first number: ");
            a = scanner.nextInt();

            System.out.println("Enter the second number: ");
            b = scanner.nextInt();

            System.out.println("Which operation do you want to perform ? Choose one from +. -, *, / : ");
            char operator = scanner.next().charAt(0);

            switch (operator)
            {
                case '+':
                    result = calculator.add(a,b);
                    System.out.println(a + " " + operator + " " + b + " = " + result);
                    break;
                case '-':
                    result = calculator.subtract(a,b);
                    System.out.println(a + " " + operator + " " + b + " = " + result);
                    break;
                case '*':
                    result = calculator.multiply(a,b);
                    System.out.println(a + " " + operator + " " + b + " = " + result);
                    break;
                case '/':
                    result = calculator.divide(a,b);
                    System.out.println(a + " " + operator + " " + b + " = " + result);
                    break;
                default:
                    System.out.println("Wrong operation choosen. Please try again.");
                    return;
            }

            System.out.println("Want to try again ? Type y if yes and n if not");
            int option = scanner.next().charAt(0);

            if (option == 'n') {
                trials = 0;
                scanner.close();
            }
            else
            {
                if(option == 'y') {
                    trials = 1;
                }
                else
                {
                    System.out.println("Unknown command.");
                    break;
                }

            }

            }
    }
}
