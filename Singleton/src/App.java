import database.Database;

public class App {
    public static void main(String[] args) throws Exception {
        Database d1 = Database.getInstance();
        d1.query("Select * from users");

        Database d2 = Database.getInstance();
        d2.query("Select * from books");
    }
}
