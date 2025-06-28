package OOPSIIasignment;
class TwoBHK extends OneBHK{
    private double room2Area;
    private static int totalAmount;

    public TwoBHK(double roomArea,double room2Area,double hallArea,int price)
    {
        super(roomArea,hallArea,price);
        this.room2Area=room2Area;
        totalAmount=  totalAmount+ price;
    }
    public TwoBHK()
    {
        super(0,0,0);
    }
    public void show()
    {
        System.out.println("the area of room1 is "+this.getRoomArea()+" Squarmeters\nthe area of room2 is " +this.room2Area+" Squarmeters\nthe area of hall is "+this.getHallArea()+" Squarmeters\nthe price of room is "+this.getPrice()+" Rs.");
    }
    public static void showTotalAmount(){
        System.out.println("The total Price of all the flats are "+totalAmount+" Rs.");
    }

}
public class UseTwoBHK{
    public static void main(String [] args){

        TwoBHK Flat1C = new TwoBHK(1000.0,2000.0,25000.0,1000);
        Flat1C.show();
        TwoBHK Flat2C = new TwoBHK(1000.0,2000.0,25000.0,1000);
        Flat2C.show();
        TwoBHK Flat3C = new TwoBHK(1000.0,2000.0,25000.0,1000);
        Flat3C.show();
        TwoBHK.showTotalAmount();
    }
}