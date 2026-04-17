import java.util.Scanner;

abstract class AbstractProduct {
    int id;
    String name, desc;

    public abstract void display();
}

class Product extends AbstractProduct {
    double price;

    @Override
    public void display() {
        System.out.println(id + " " + name + " " + desc + " " + price);
    }
}

class TravelGuide extends Product {
    String isbn, author, title, country;

    void input(Scanner sc) {
        id = sc.nextInt(); 
        sc.nextLine();

        name = sc.nextLine();
        desc = sc.nextLine();

        price = sc.nextDouble(); 
        sc.nextLine();

        isbn = sc.nextLine();
        author = sc.nextLine();
        title = sc.nextLine();
        country = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println(isbn + " " + author + " " + title + " " + country);
    }
}

class CompactDisc extends Product {
    String artist, title;

    void input(Scanner sc) {
        id = sc.nextInt(); 
        sc.nextLine();

        name = sc.nextLine();
        desc = sc.nextLine();

        price = sc.nextDouble(); 
        sc.nextLine();

        artist = sc.nextLine();
        title = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println(artist + " " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TravelGuide t = new TravelGuide();
        CompactDisc c = new CompactDisc();

        // Input
        t.input(sc);
        c.input(sc);

        // Output
        t.display();
        c.display();

        sc.close();
    }
}