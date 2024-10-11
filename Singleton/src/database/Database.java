package database;

public class Database {

  private static Database instance;

  private Database() {
    System.out.println("Database is connected");
  }

  public static Database getInstance() {
    if (instance == null) {
      instance = new Database();
    }

    return instance;
  }

  public void query(String query) {
    System.out.println(query);
  }

}
