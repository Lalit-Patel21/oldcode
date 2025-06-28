//20)Create class Tile to store the edge length of a square tile , and create another
// class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class
// with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
package OOPSIAsignment;
class Tile {
    private double length;

    public Tile() {

    }
    public Tile(double length) {
        this.length = length;
    }

    public void setLength(double length) {

        this.length = length;
    }

    public double getLength() {

        return this.length;
    }

    public double showAreaOfSquareTile() {
        return this.getLength() * getLength();
    }

}
class RectangularFloor{
private double rLength;
private double width;

public RectangularFloor(double rLength,double width)
{
 this.rLength=rLength;
 this.width=width;

}
public void setRLength(double rLength){
    this.rLength = rLength;
}
public double getRLength(){
    return this.rLength;
}
public void setWidth(double width){
        this.width = width;
}
public double getWidth(){
        return this.width;
}
public double showRectangularFloorArea(){
   return this.getRLength()*getWidth();
}
    public int totalTiles(Tile t) {
        // Calculate the area of the floor
//        double floorArea = rLength * width;
        double floorArea = showRectangularFloorArea();
        // Calculate the area of one tile
        double tileArea = t.showAreaOfSquareTile();
        // Calculate the number of tiles needed to cover the floor
        return (int) Math.ceil(floorArea / tileArea);
    }
}
class UseRectangularFloor{
public static void main(String[] args) {

    Tile tile = new Tile(20);
    RectangularFloor rf = new RectangularFloor(50.0,60.0);
    int totalTiles = rf.totalTiles(tile);
    System.out.println("Total tiles  "+totalTiles);

}
}

