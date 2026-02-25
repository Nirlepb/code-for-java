class product{
    String name; 
    double price; 
    int id;
    product(String name,double price,int id){
        this.name=name;
        this.price=price;
        this.id=id;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void display() {
        System.out.printf("[%d] %s - $%.2f\n", id, name, price);

    }

}
public class Driver {
    public static void main(String[] args) {
        
    }

}
