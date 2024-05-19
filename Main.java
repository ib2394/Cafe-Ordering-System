import java.io.IOException;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException, InterruptedException {

        // variable declarations
        char code = '0',option = '0',opt = '0',choose='0';
        int qty = 0, o=0, Q=0,ID=0;
        double OrderID = 9999999,c=0.0,eW=0.0,d=0.0;

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        do{
            double totalPrice = 0.0;
            ///-----clear screen----////
            System.out.println("\n*********** Welcome to I's Cafe ***********");

            //customer page
            List<Customer> customerList = new ArrayList<>();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name        : ");
            String name = scanner.nextLine();
            System.out.print("Enter your password    : ");
            String password = scanner.nextLine();
            System.out.print("Enter your phone number: ");
            String noPhone = scanner.nextLine();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            Customer cust = new Customer(name, password, noPhone);
            cust.viewCustomer(name, noPhone);

            menu.display();

            // call Order class
            Order order = new Order();

            //Start the program
            do {
                do {
                    do {
                        System.out.print("\nPlease Enter the Code of the Order: ");
                        code = input.next().charAt(0);

                        if ((code == 'A') || (code == 'B') || (code == 'C') || (code == 'D') || (code == 'E') || (code == 'F') || (code == 'G') || (code == 'H')) {
                            System.out.print("Enter the quantity: ");
                            qty = input.nextInt();
                            totalPrice += order.calcOrder(qty, menu.deCode(code));
                            break;
                        }
                    } while ((code != 'A') || (code != 'B') || (code != 'C') || (code != 'D') || (code != 'E') || (code != 'F') || (code != 'G') || (code != 'H'));
                    // Order again ?
                    System.out.print("Do you wish to order our menu again? (Y/N):");
                    option = input.next().charAt(0);

                } while (option != 'N');

                //Display total price
                System.out.println("\n----------------------------");
                System.out.print("The total price is: RM " + totalPrice);
                System.out.println("\n----------------------------");
                //Order ID
                for(int num=1; num<1000; num++) {
                    ID += num;
                }
                System.out.println("Order ID: "+ID);
                System.out.print("Do you want to proceed with payment? (Y/N):");
                opt = input.next().charAt(0);

            } while (opt != 'Y');

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            //go to payment class
            System.out.println("\n---------------------------");
            System.out.println("\t1. Cash");
            System.out.println("\t2. E-wallet");
            System.out.println("\t3. Debit");
            System.out.println("---------------------------");
            System.out.print("Choose your payment method: ");
            opt = input.next().charAt(0);

            //receipt
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\n*************************");
            System.out.println("   Cafe Ordering System");
            System.out.println("*************************\n");
            Payment payment = new Payment(o, Q, totalPrice, c, eW, d);
            payment.display(opt, totalPrice);

            System.out.print("\n\n+--------------------------------------+");
            System.out.println("\n - Thank you for using our system - ");
            System.out.println("+--------------------------------------+");
            /////------clear screen------/////
            System.out.print("Do you want to order again? : ");
            choose=input.next().charAt(0);

        }while(choose=='Y');
    }
}