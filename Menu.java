public class Menu extends Order{
    private char code;
    private double price;

    public Menu(){
        code = '0';
    }
    public Menu(int oID, int qty, double tP, char code){
        super(oID,qty,tP);
        this.code = code;
        this.price = price;
    }
    public char getCode(){
        return code;
    }
    public double getPrice(){
        return price;
    }

    public void display(){

        System.out.println(" +-------------------------------------------------------------+ ");
        System.out.println(" |    CODE    |\t\t\tMEAL MENU\t\t\t |\t\tPRICE\t   |");
        System.out.println(" +-------------------------------------------------------------+ ");
        System.out.println(" |     A      |   Spaghetti Chicken Meatball |\t  RM 10.00\t   |");
        System.out.println(" |     B      |   Mac & Cheese\t\t\t\t |\t  RM 8.50\t   |");
        System.out.println(" |     C      |   Chicken Chop\t\t\t\t |\t  RM 14.00\t   |");
        System.out.println(" |     D      |   Fries\t\t\t\t\t\t |\t  RM 6.00\t   |");
        System.out.println(" |     E      |   Fish Burger\t\t\t\t |\t  RM 9.00\t   |");
        System.out.println(" +-------------------------------------------------------------+ ");


        System.out.println(" +-------------------------------------------------------------+ ");
        System.out.println(" |  CODE\t  |\t\t\tBEVERAGES MENU\t\t |\t\tPRICE\t   |");
        System.out.println(" +-------------------------------------------------------------+ ");
        System.out.println(" |    F\t\t  |\t\t\tEspresso\t\t\t |\t  RM 5.00\t   |");
        System.out.println(" |    G\t\t  |\t\t\tHot Chocolate\t\t |\t  RM 4.00\t   |");
        System.out.println(" |    H\t\t  |\t\t\tAmericano\t\t\t |\t  RM 4.50\t   |");
        System.out.println(" +-------------------------------------------------------------+ ");
    }
    public double deCode(char code){

        if (code == 'A') {
            price = 10.00;
        }
        else if (code == 'B')
        {
            price = 8.50;
        }
        else if (code == 'C')
        {
            price = 14.00;
        }
        else if (code == 'D')
        {
            price = 6.00;
        }
        else if (code == 'E')
        {
            price = 9.00;
        }
        else if (code == 'F')
        {
            price = 5.00;
        }
        else if (code == 'G')
        {
            price = 4.00;
        }
        else if (code == 'H')
        {
            price = 4.50;
        }
        return price;
    }
    public String toString(){
        return "Code: "+code+"\nOrder ID: "+super.OrderID;
    }
}

