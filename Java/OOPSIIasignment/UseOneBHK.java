package OOPSIIasignment;

class OneBHK{
    private double roomArea;
    private double hallArea;
    private int price;

    public OneBHK()
    {
    }
    public OneBHK(double roomArea, double hallArea, int price)
    {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price    = price;
    }

    public void show()
    {
        System.out.println("the area of room is "+this.roomArea+" squaremeter\nthe area of hall is "+hallArea+" squaremeter\nthe price of room is "+price+" Rs");
    }

    public double getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    public double getHallArea() {
        return hallArea;
    }

    public void setHallArea(double hallArea) {
        this.hallArea = hallArea;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class UseOneBHK{
    public static void main(String [] Args){

        OneBHK FirstC = new OneBHK(5000,2000,250000);
        FirstC.show();
    }
}

