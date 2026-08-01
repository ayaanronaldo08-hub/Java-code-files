import java.util.ArrayList;
import java.util.Scanner;

public class L18A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        Book obj1 = new Book(1, "Dictionary", "Dec 17th", "Ayaan", 100);
        DVD obj2 = new DVD(2, "Iron Man", "August 3rd", "Ayaan", 2);
        CD obj3 = new CD(3, "Travis", "Dec 4th", "Travis Scott", 10);

        Patron p1 = new Patron("Ayaan", 10);
        System.out.println("Name: " + p1.getName());
        System.out.println("ID: " + p1.getID());
        System.out.println("Num of items: " + p1.numItems());

        while(running){

        System.out.println("Checkout, Return, Items, Exit?");
        String action = sc.nextLine();
        action = action.toLowerCase();

        if ((action.equals("checkout") || (action.equals("return")))){
            System.out.println("Enter choice(Book, DVD, CD):");
            String choice = sc.nextLine();
            choice = choice.toLowerCase();
            if (action.equals("checkout")){
                if (choice.equals("book")){
                    p1.checkoutBook(obj1);
                    System.out.println("Num of items: " + p1.numItems());
                } else if (choice.equals("dvd")){
                    p1.checkoutDVD(obj2);
                    System.out.println("Num of items: " + p1.numItems());
                } else {
                    p1.checkoutCD(obj3);
                    System.out.println("Num of items: " + p1.numItems());
                }
            } else if (action.equals("return")){
                if (choice.equals("book")){
                    p1.returnBook(obj1);
                    System.out.println("Num of items: " + p1.numItems());
                } else if (choice.equals("dvd")){
                    p1.returnDVD(obj2);
                    System.out.println("Num of items: " + p1.numItems());
                } else {
                    p1.returnCD(obj3);
                    System.out.println("Num of items: " + p1.numItems());
                }
            }
        } else if (action.equals("items")){
            System.out.println("Items: " + p1.getList());
        } else if (action.equals("exit")){
            running = false;
        }
        }
    }
        
}

class Patron{
    private String name;
    private int id;
    private ArrayList<String> list;

    public Patron(String name, int id){
        this.name = name;
        this.id = id;
        list = new ArrayList<>();
    }

    public void checkoutBook(Book item){
        if (list.size() < 10){
            list.add(item.getTitle());
        } else {
            System.out.println("Cannot check out more");
        }
    }

    public void checkoutDVD(DVD item){
        if (list.size() < 10){
            list.add(item.getTitle());
        } else {
            System.out.println("Cannot check out more");
        }
    }

    public void checkoutCD(CD item){
        if (list.size() < 10){
            list.add(item.getTitle());
        } else {
            System.out.println("Cannot check out more");
        }
    }

    public void returnBook(Book item){
        if (list.contains(item.getTitle())){
            list.remove(item.getTitle());
        } else {
            System.out.println("You do not have that item");
        }
    }

    public void returnDVD(DVD item){
        if (list.contains(item.getTitle())){
            list.remove(item.getTitle());
        } else {
            System.out.println("You do not have that item");
        }
    }

    public void returnCD(CD item){
        if (list.contains(item.getTitle())){
            list.remove(item.getTitle());
        } else {
            System.out.println("You do not have that item");
        }
    }

    public int numItems(){
        return list.size();
    }

    public ArrayList<String> getList(){
        if (list.size() == 0){
            System.out.println("No items");
            return list;
        } else {
            return list;
        }
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }
}

class Book{
    private int id;
    private String title;
    private String publish_date;
    private String Author;
    private int numP;

    public Book(int id, String title, String publish_date, String Author, int numP){
        this.id = id;
        this.title = title;
        this.publish_date = publish_date;
        this.Author = Author;
        this.numP = numP;
    }

    public int getID(){
        return id;
    }

    public String getTitle(){
        return title;
    }
}

class DVD{
    private int id;
    private String title;
    private String publish_date;
    private String director;
    private double time;

    public DVD(int id, String title, String publish_date, String director, double time){
        this.id = id;
        this.title = title;
        this.publish_date = publish_date;
        this.director = director;
        this.time = time;
    }

    public int getID(){
        return id;
    }

    public String getTitle(){
        return title;
    }
}

class CD{
    private int id;
    private String title;
    private String publish_date;
    private String artist;
    private int numT;

    public CD(int id, String title, String publish_date, String artist, int numT){
        this.id = id;
        this.title = title;
        this.publish_date = publish_date;
        this.artist = artist;
        this.numT = numT;
    }

    public int getID(){
        return id;
    }

    public String getTitle(){
        return title;
    }
}
