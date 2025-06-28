//18) Create class Product (pid, price, quantity) with parameterized constructor.
// Create a main function in different class (say XYZ) and perform following task:
//Accept five product information from user and store in an array
//Find Pid of product with highest price.
//Create method (with array of product’s object as argument) in XYZ class to calculate and
// return total amount spent on all products.
// (amount spent on single product=price of product * quantity of product).

package OOPSIAsignment;
import java.util.Scanner;
class Product{
    private  int pid;
    private double price;
    private int quantity;

    public Product(int pid,double price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }
    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
public class UseProduct {

    public static void main(String[] args){
//        System.out.println("Student Grade-A :"+Student.getCountGrade());

        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept five product information from user and store in an array
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for product " + (i + 1));
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }


        // Find Pid of product with highest price
        int highestPricePid = findProductWithHighestPrice(products);
        System.out.println("Product ID with highest price: " + highestPricePid);

        // Calculate and display the total amount spent on all products
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);
    }

    // Method to find the product with the highest price
    public static int findProductWithHighestPrice(Product[] products) {
        int highestPricePid = products[0].getPid();
        double highestPrice = products[0].getPrice();

        for (Product product : products) {
            if (product.getPrice() > highestPrice) {
                highestPrice = product.getPrice();
                highestPricePid = product.getPid();
            }
        }

        return highestPricePid;
    }

    // Method to calculate and return total amount spent on all products
    public static double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0.0;

        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }

        return totalAmount;
    }
}

