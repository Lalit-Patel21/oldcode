//Develop Java Application
//
//A person enter in a D-Mart mall for the shopping. He is first
//time visiting the D-mart mall.
//He/She has to purchase 10 items.
//
//System should ask for the name of the customer and Gender.
//
//User will tell you the item name and quantity of each product
//purchased one by one.
//
//You have to calculate the total bill amount on the following
//Criteria basis
//
// on first product purchase if quantitiy greater then
// 4 then you have to offer 5% discount on total price of that product
//
// on 5th product purchase you have to offer 10% discount on total
// price.
//
// on 10th product purchase you have to offer 15% discount on total
// price of that product.
//
// let suppose the cost of 1st product is 10
// cost of 2nd product is 20
//    .
//    .
// cost of 10th product is 100;
//
// if Total Bill amount is greater then 10000 then you have
// to offer 15% of total bill amount
// if total Bill amount is between 5000 and 10000 then
// you have to offer 10% of total bill amount
//
// Also 10% GST of total Bill Amount
//
// Then you have to ask for carry bag to customer
// if he/she yes then add 10 rupees in total bill amount.
//
// if the customer is female then you have to gift a Cadeberry
// If the customer is male then you have to gift a Ladger Wallet
//
// Develop a Java Application to Generate the Bill in
// Following Format
//
//                         D-Mart
//   Name : Cheeku Sing			Date: 12/9/2022
//   -----------------------------------------------------------
//   Item Name	Quantity    Price	Total   After-Discount
//     Item-1	   5	      10        50 Rs       47.5 Rs
//     Item-2	   3	      20	60 RS       60.0 RS
//       .
//       .
//       .
//       .
//       .
//       .
//       .
//     Item-10	  20        100         2000       300.0 Rs
//   ----------------------------------------------------------
//                                        A.P	    D.P
//                                        45000	    43500
//     Gift :- Cadeberry                  0.00	    0.00
//
//     Carry Bag : yes                    10:00	    10:00
//     GST (10%)	                        450         450
//   ---------------------------------------------------------
//                                        45460       43960 RS
//
//                       Thank You
//                        To Vist
//                         D-Mart
//
package csassignment2;

import java.util.Scanner;

public class P45 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);


        System.out.print("Enter Your Name :");
        String name = kb.nextLine();

        System.out.print("Enter Your Gender :");
        String gender = kb.next();

        System.out.print("Enter Item Name of Product 1 :");
        String prod1N = kb.next();
        System.out.print("Enter price of Product 1 :");
        int prod1p = kb.nextInt();
        System.out.print("Enter quantity of Product 1 :");
        int prod1Q = kb.nextInt();

       double prod1NetAmount=prod1Q*prod1p;
       double discountPriceProd1;
        if(prod1Q>4)
            discountPriceProd1 = prod1NetAmount-(prod1NetAmount*5/100.0);
        else
            discountPriceProd1= prod1Q*prod1p;

        System.out.print("Enter Item Name of Product 2 :");
        String prod2N = kb.next();
        System.out.print("Enter price of Product 2 :");
        int prod2p = kb.nextInt();
        System.out.print("Enter quantity of Product 2 :");
        int prod2Q = kb.nextInt();

        double prod2NetAmount;
        prod2NetAmount = prod2Q*prod2p;

        System.out.print("Enter Item Name of Product 3 :");
        String prod3N = kb.next();
        System.out.print("Enter price of Product 3 :");
        int prod3p = kb.nextInt();
        System.out.print("Enter quantity of Product 3 :");
        int prod3Q = kb.nextInt();

        double prod3NetAmount;
        prod3NetAmount = prod3Q*prod3p;

        System.out.print("Enter Item Name of Product 4:");
        String prod4N = kb.next();
        System.out.print("Enter price of Product 4 :");
        int prod4p = kb.nextInt();
        System.out.print("Enter quantity of Product 4 :");
        int prod4Q = kb.nextInt();

        double prod4NetAmount;
        prod4NetAmount = prod4Q*prod4p;

        System.out.print("Enter Item Name of Product 5:");
        String prod5N = kb.next();
        System.out.print("Enter price of Product 5:");
        int prod5p = kb.nextInt();
        System.out.print("Enter quantity of Product 5:");
        int prod5Q = kb.nextInt();

        double prod5NetAmount=prod5Q*prod5p;
        double discountPriceProd5;
        discountPriceProd5 = prod5NetAmount-(prod5NetAmount*10/100.0);

        System.out.print("Enter Item Name of Product 6:");
        String prod6N = kb.next();
        System.out.print("Enter price of Product 6 :");
        int prod6p = kb.nextInt();
        System.out.print("Enter quantity of Product 6 :");
        int prod6Q = kb.nextInt();

        double prod6NetAmount;
        prod6NetAmount = prod6Q*prod6p;

        System.out.print("Enter Item Name of Product 7:");
        String prod7N = kb.next();
        System.out.print("Enter price of Product 7:");
        int prod7p = kb.nextInt();
        System.out.print("Enter quantity of Product 7:");
        int prod7Q = kb.nextInt();

        double prod7NetAmount;
        prod7NetAmount = prod7Q*prod7p;

        System.out.print("Enter Item Name of Product 8:");
        String prod8N = kb.next();
        System.out.print("Enter price of Product 8:");
        int prod8p = kb.nextInt();
        System.out.print("Enter quantity of Product 8:");
        int prod8Q = kb.nextInt();

        double prod8NetAmount;
        prod8NetAmount = prod8Q*prod8p;

        System.out.print("Enter Item Name of Product 9:");
        String prod9N = kb.next();
        System.out.print("Enter price of Product 9:");
        int prod9p = kb.nextInt();
        System.out.print("Enter quantity of Product 9:");
        int prod9Q = kb.nextInt();

        double prod9NetAmount;
        prod9NetAmount = prod9Q*prod9p;

        System.out.print("Enter Item Name of Product 10:");
        String prod10N = kb.next();
        System.out.print("Enter price of Product 10:");
        int prod10p = kb.nextInt();
        System.out.print("Enter quantity of Product 10:");
        int prod10Q = kb.nextInt();

        double prod10NetAmount;
        prod10NetAmount = (prod10Q*prod10p)-(prod10Q*prod10p*10/100.0);

        double totalBillAmount = prod1NetAmount+prod2NetAmount+prod3NetAmount+prod4NetAmount+prod5NetAmount+prod6NetAmount+prod7NetAmount+prod8NetAmount+prod9NetAmount+prod10NetAmount;

        double discountPriceTotalBillAmount;

        if(totalBillAmount>10000){
            discountPriceTotalBillAmount=totalBillAmount-(totalBillAmount*15/100.0);
        }
        else if (totalBillAmount>5000){
            discountPriceTotalBillAmount=totalBillAmount-(totalBillAmount*10/100.0);
        }
        else {
            discountPriceTotalBillAmount=totalBillAmount-(totalBillAmount*0/100.0);
        }
        double totalBillAmountWithGst;
        totalBillAmountWithGst=discountPriceTotalBillAmount+(discountPriceTotalBillAmount*10/100.0);

        System.out.println("you need to carry bag (yes/no)");
        String carryBeg = kb.next();
        if(carryBeg.equalsIgnoreCase("yes"))
        {
            totalBillAmountWithGst=totalBillAmountWithGst+10;
        }
        if(gender.equalsIgnoreCase("male"))
        {
            System.out.println("gift a Cadeberry");
        }
        else {
            System.out.println("gift a Ladder Wallet");
        }

        System.out.println("\t\t\t\t\t\t\t\t\t\tD-Mart");
        System.out.println("Name:\t\t\t\t Date: 12/9/2022");

        System.out.println("___________________________________________________________________________");

        System.out.println("Item Name\t\t Quantity\t\tPrice\t\tD-Mart\t\tTotal\t\t\tAfter-Discount");

        System.out.println(prod1N+"\t\t"+prod1Q+"\t\t"+prod1p+"\t\t"+prod1NetAmount+"\t\t"+ prod1NetAmount+"Rs.\t\t"+discountPriceProd1+"Rs.");

        System.out.println(prod2N+"\t\t"+prod2Q+"\t\t"+prod2p+"\t\t"+prod2NetAmount+"\t\t"+ prod2NetAmount+"\t\t"+prod2NetAmount);

        System.out.println(prod3N+"\t\t"+prod3Q+"\t\t"+prod3p+"\t\t"+prod3NetAmount+"\t\t"+ prod3NetAmount+"Rs.\t\t"+prod3NetAmount+"Rs.");


        System.out.println(prod4N+"\t\t"+prod4Q+"\t\t"+prod4p+"\t\t"+prod4NetAmount+"\t\t"+ prod4NetAmount+"Rs.\t\t"+prod4NetAmount+"Rs.");

        System.out.println(prod5N+"\t\t"+prod5Q+"\t\t"+prod5p+"\t\t"+prod5NetAmount+"\t\t"+ prod5NetAmount+"Rs.\t\t"+discountPriceProd5+"Rs.");

        System.out.println(prod6N+"\t\t"+prod6Q+"\t\t"+prod6p+"\t\t"+prod6NetAmount+"\t\t"+ prod6NetAmount+"Rs.\t\t"+prod6NetAmount+"Rs.");

        System.out.println(prod7N+"\t\t"+prod7Q+"\t\t"+prod7p+"\t\t"+prod7NetAmount+"\t\t"+ prod7NetAmount+"Rs.\t\t"+prod7NetAmount+"Rs.");

        System.out.println(prod8N+"\t\t"+prod8Q+"\t\t"+prod8p+"\t\t"+prod8NetAmount+"\t\t"+ prod8NetAmount+"Rs.\t\t"+prod8NetAmount+"Rs.");

        System.out.println(prod9N+"\t\t"+prod9Q+"\t\t"+prod9p+"\t\t"+prod9NetAmount+"\t\t"+ prod1NetAmount+"Rs.\t\t"+prod9NetAmount+"Rs.");

        System.out.println(prod10N+"\t\t"+prod10Q+"\t\t"+prod10p+"\t\t"+prod10NetAmount+"\t\t"+ prod10NetAmount+"Rs.\t\t"+prod10NetAmount+"Rs.");

        System.out.println("_____________________________________________________________________________");






        System.out.println("___________________________________________________________________________");


        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

}



//
//                         D-Mart
//   Name : Cheeku Sing			Date: 12/9/2022
//   -----------------------------------------------------------
//   Item Name	Quantity    Price	Total   After-Discount
//     Item-1	   5	      10        50 Rs       47.5 Rs
//     Item-2	   3	      20	60 RS       60.0 RS
//       .
//       .
//       .
//       .
//       .
//       .
//       .
//     Item-10	  20        100         2000       300.0 Rs
//   ----------------------------------------------------------
//                                        A.P	    D.P
//                                        45000	    43500
//     Gift :- Cadeberry                  0.00	    0.00
//
//     Carry Bag : yes                    10:00	    10:00
//     GST (10%)	                        450         450
//   ---------------------------------------------------------
//                                        45460       43960 RS
//
//                       Thank You
//                        To Vist
//                         D-Mart
//