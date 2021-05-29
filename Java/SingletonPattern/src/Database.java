/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 29-05-2021
 * Time: 06:54 AM
 */
public class Database {

    private static Database databaseInstance;

    private Database(){

    }

    public static Database getInstance(){
        if(databaseInstance == null){
            /**
             *
             * For Example....if we have 2 Threads and both of them checks and passes the above
             * 'if' condition then there will be 2 executions and Singleton pattern strictly says
             * that there must be only one instance.
             *
             * As a solution 'synchronized' is used.
             *
             */
            synchronized (Database.class){
                databaseInstance = new Database();
            }
        }
        return databaseInstance;
    }

}
