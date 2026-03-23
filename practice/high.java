 class Employee {
    String name;
    double amount;
Employee(String name, double amount){
    this.name=name;
    this.amount=amount;
}

    
}
public class high {
    public static void main(String[] args) {
        Employee[] staff=new Employee[4];
        staff[0]=new Employee("alice",50000);
        staff[1] = new Employee("Bob", 7500.0);
        staff[2] = new Employee("Charlie", 3000.0);
        staff[3] = new Employee("Diana", 9000.0);
        Employee top = findTopSeller(staff);
        if (top != null) {
            System.out.println("Top Seller: " + top.name + " with $" + top.amount);
        }
    }
        
    
public static Employee findTopSeller(Employee[] staff){
    Employee topSeller = staff[0];
    for (int i = 1; i < staff.length; i++) {
            if (staff[i].amount > topSeller.amount) {
                // We found a new champion!
                topSeller = staff[i];
            }
        }

        return topSeller;
}}

