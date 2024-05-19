public class Order{
    public int OrderID=0,qty;
    public double totalPrice;
    public Order (){
        OrderID = 0;
        qty = 0;
        totalPrice = 0.00;
    }
    public Order (int OrderID,int qty,double price){
        this.OrderID = OrderID;
        this.qty = qty;
        this.totalPrice = price;
    }
    public int getOrderID(){
        return OrderID;
    }
    public int getQty(){
        return qty;
    }
    public double getPrice(){
        return totalPrice;
    }
    public double calcOrder (int qty,double price){
        double totalPrice = 0.00;
        totalPrice += (qty*price);
        return totalPrice;
    }
}
