public class DatabaseConnectionTest {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        if (db1 == db2) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances were created!");
        }

        db1.connect();
        db2.disconnect();
    }
}
