/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.examples.assignment2;

/**
 *
 * @author dell
 */
public class Book implements Comparable<Book> {
    private String bookName;
    private String authorName;
    private Double price;
    public Book(String bookName, String authorName, double price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", authorName=" + authorName + ", price=" + price + '}';
    }

    @Override
    public int compareTo(Book t) {
       int result=this.price.compareTo(t.price);
       if(result!=0)
           return result;
       result=this.bookName.compareTo(t.bookName);
       return result;
    }
    
    
    
}
