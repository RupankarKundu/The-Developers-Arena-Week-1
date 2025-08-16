import java.util.Scanner;

class First_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Check Prime Number");
        System.out.println("2. Enter a Decimal Number");
        System.out.println("3. Enter a Letter to get ASCII Value");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter a Natural number: ");
                int a = sc.nextInt();
                int k = 0;

                for (int i = 1; i <= a; i++) {
                    if (a % i == 0) {
                        k++;
                    }
                }

                if (k == 2) {
                    System.out.println(a + " is a Prime number.");
                } else {
                    System.out.println(a + " is NOT a Prime number.");
                }
                break;

            case 2:
                System.out.print("Enter a Decimal number: ");
                float b = sc.nextFloat();
                System.out.println("You entered decimal: " + b);
                break;

            case 3:
                System.out.print("Enter a Letter: ");
                char ch = sc.nextLine().charAt(0);
                System.out.println("ASCII value of '" + ch + "' is: " + (int) ch);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
