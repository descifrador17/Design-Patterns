/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 29-05-2021
 * Time: 07:01 AM
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Database database = new Database()
         * Gives an error as Database constructor is Private
         */

        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();

        System.out.println("db1 = "+db1);
        System.out.println("db2 = "+db2);
    }
}
