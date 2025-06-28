package collectionex;

import java.util.Set;
import java.util.TreeSet;
class Book implements Comparable{
    private String bname;
    private String author;
    private int price;

    public Book(String bname, String author, int price) {
        this.bname = bname;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
       Book p=(Book)o;
       if(this.price>p.price)
           return 1;
       else if(this.price<p.price)
           return -1;
       else
           return this.bname.compareTo(p.bname);
    }
}
public class TreeSetEx2 {
    public static void main(String[] args) {
        Set<Book> bookSet=new TreeSet<>();
        Book b1=new Book("Mastering Java","Leymann",500);
        Book b2=new Book("Mastering C++","Kumar",460);
        Book b3=new Book("Mastering C","Schieldt",600);
        Book b4=new Book("Programming In C","Sachin",600);
        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        bookSet.add(b4);
        System.out.println("===============");
        for(Book b:bookSet)
            System.out.println(b);
    }
}
