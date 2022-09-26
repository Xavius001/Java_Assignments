import java.util.*;

class Book {
    private int bookNo;
    private char[] bookTitle = new char[20];
    private float price;
    private void totalCost(int N) {
        float total = N*price;
        System.out.println("Total Cost: $"+total);
    }
    public void input(int bookNo, String bookTitle, float price){
        this.bookNo = bookNo;
        this.bookTitle = bookTitle.toCharArray();
        this.price = price;
        System.out.println("Book Number: "+this.bookNo);
        System.out.print("Book Title: ");
        for(int i = 0; i<this.bookTitle.length; i++) {
            System.out.print(this.bookTitle[i]);
        }
        System.out.println();
        System.out.println("Book Price: $"+this.price);
    }
    public void purchase() {
        System.out.println("Number of copies to be purchased?");
        Scanner in = new Scanner(System.in);
        int copies = in.nextInt();
        totalCost(copies);
    }
}

public class BookQuestion {
    public static void main(String[] args) {
        Book b = new Book();
        b.input(1,"Sesame Yeet", 10);
        b.purchase();
    }
}
