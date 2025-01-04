
/**
 * 
 * This is lazy loading implementation with thread safety.
 * Thread safety is employed here by using the synchronized keyword 
 * on the getInstance() class. So that only one thread is able to enter into
 * the function. 
 * 
 * Not optimal because we only need to maintian the synchronization during
 * the creation of the instance.
 */
class DbConnection{
    private static DbConnection instance = null;

    private DbConnection(){
        System.out.println("Connection created");
    }

    public static synchronized DbConnection getInstance(){
        if(instance == null){
            instance = new DbConnection();
        }
        return instance;
    }

}