public class Customer {
    private String name;
    private String password;
    private String noPhone;

    public Customer()
    {
        name="unknown";
        password=" ";
        noPhone=" ";
    }

    public Customer(String name, String password, String noPhone){
        this.name = name;
        this.password = password;
        this.noPhone = noPhone;
    }

    public void setCustomer(String name,String password,String noPhone)
    {
        this.name=name;
        this.password=password;
        this.noPhone=noPhone;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public String getNoPhone(){
        return noPhone;
    }

    public void viewCustomer(String N, String NP){
        System.out.println("\nName         : " + name);
        System.out.println("Phone number : " + noPhone);
    }

}