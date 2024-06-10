package at.ac.fhcampuswien.fhmdb.SingletonPattern;

import at.ac.fhcampuswien.fhmdb.database.DataBaseException;
import at.ac.fhcampuswien.fhmdb.database.DatabaseManager;

public class Singleton {
    private static volatile DatabaseManager instance;



    public static DatabaseManager getInstance(DatabaseManager databaseManager) throws DataBaseException {
        DatabaseManager result = instance;
        if (instance == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = databaseManager;
                }
            }
        }
        return instance;
    }
}
