
/*
 * 
 * This is called lazy loading because the object is created only if 
 * is used. If not used the object is not created at all hence results in
 * better utilization of the reosuce.
 * Problem : This implementation is not thread safe : at getInstance() method.
 * If two threads getLs into the getInstance() method and passes the null check.
 */

class DbConnection {
    private static DbConnection instance = null;

    private DbConnection() {
        System.out.println("Lazy loading");
    }

    public DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }
}
