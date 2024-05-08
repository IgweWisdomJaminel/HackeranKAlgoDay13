import java.util.Scanner;

public abstract class Book {
    String name;
    String author;
    int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public abstract void display();
}
class MyBook extends Book{

    public MyBook(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    public void display() {
        System.out.println("Name: "+name+"\n"+
                "Author: "+author+"\n"+"Price: "+price);
    }


}
class Solution extends Book{


    public Solution(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    public void display() {
        System.out.println("Name: "+name+"\n"+
                "Author: "+author+"\n"+"Price: "+price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        String author= sc.nextLine();
        int price = sc.nextInt();
        Book book = new MyBook(name,author,price);
        book.display();

    }


}