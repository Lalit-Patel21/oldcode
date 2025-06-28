import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap<>();
        tm.put(101,"nikhil");
        tm.put(103, "vishal");
        tm.put(105, "yash");
        System.out.println(tm);
        System.out.println(tm.ceilingKey(101));
        System.out.println(tm.ceilingKey(104));
        System.out.println(tm.ceilingEntry(101));
        System.out.println(tm.ceilingEntry(102));
        System.out.println(tm.ceilingEntry(104));
        System.out.println(tm.floorKey(101));
        System.out.println(tm.floorKey(104));
        System.out.println(tm.pollFirstEntry());
        System.out.println(tm.pollLastEntry());
    }
}
