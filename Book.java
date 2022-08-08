package Week2.Day2;

import java.util.ArrayList;

public class Book {
    ArrayList<Author> a =new ArrayList<>();
    private String name;
    private double price;
    private int qty = 0;

    public Book (ArrayList<Author>a, String name ,double price){
        this.a=a;
        this.name=name;
        this.price=price;
    }

    public Book (ArrayList<Author>a, String name ,double price , int qty){
        this.a=a;
        this.name=name;
        this.price=price;
        this.qty=qty;
    }

    public ArrayList<Author> getA() {
        return a;
    }

    public void setA(ArrayList<Author> a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "a=" + a +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}//end
