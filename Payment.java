import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Payment extends Order{
    private double cash;
    private double eWallet;
    private double debit;

    public Payment(int oID, int qty, double tP, double c, double eW, double d){
        super(oID,qty,tP);
        cash=c;
        eWallet=eW;
        debit=d;
    }
    public void setPayment(double c, double eW, double d){
        cash=c;
        eWallet=eW;
        debit=d;
    }
    public double getCash() {
        return cash;
    }
    public double getEWallet() {
        return eWallet;
    }
    public double getDebit() {
        return debit;
    }
    public double calcTotal(double price){
        double total=0;
        total += price;
        System.out.print("Total : RM "+total);
        return total;
    }
    public void display(char opt, double price) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        double rm=0.0;
        System.out.println("\nPayment Method  : "+opt);
        if (opt=='1'){
            System.out.println("\n---------------------------");
            System.out.println("Your total bill: RM"+super.totalPrice);
            System.out.println("---------------------------");
            System.out.print("Your cash: RM");
            rm=input.nextDouble();
            System.out.println("Balance: RM"+(rm-super.totalPrice));
        }
        else if(opt=='2'){
            System.out.println("---------------------------");
            System.out.println("Please scan here");
            System.out.println("invisible QR CODE");
            System.out.println("---------------------------");
            System.out.print("Loading");
            for(int l=0;l<3;l++){
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
            }
        }
        else if(opt=='3'){
            System.out.println("---------------------------");
            System.out.println("Touch your card here");
            System.out.println("---------------------------");
            System.out.print("Loading");
            for(int l=0;l<3;l++){
                System.out.print(".");
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
    public String toString(){
        return "Order ID"+super.OrderID;
    }
}
