

/**
 * 
 * This is thread optimization over the synchronized implementation:
 * This is called double locking.
 * The threads needs to waited only during the initialization for the lock. 
 * Once initialized, no more need of the synchronization, since same instnace is hared.
 */
class DbConnection {
    private static DbConnection instance = null;

    private DbConnection(){
        System.out.println("Connection created");  
    }

    public static DbConnection getInstance(){
        if(instance == null){
            synchronized(DbConnection.class){
                if(instance == null){
                    instance = new DbConnection();
                }
            }
        }
        return instance;
    }
}
