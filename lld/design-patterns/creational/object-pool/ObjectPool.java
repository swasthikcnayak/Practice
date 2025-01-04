import java.util.ArrayList;
import java.util.List;

class DbConnection{

}

/**
 * Used to prenitiliaze the objects beforehand, enables to reuse the objects.
 * enables to decrese the intialization latency
 * 
 * Problems : Possible memory leak
 * client may not return the object back to the pool
 * need to manage thread safety
 */

public class ObjectPool {
    List<DbConnection> availablePool;
    List<DbConnection> inUsePool;
    int totalPoolSize;
    // constructor is made private becuse we do not want mulitple instances of the object pool, 
    // use only one instance: throught : singleton : get instance
    // prepare the pool
    private ObjectPool(int totalPoolSize){
        this.totalPoolSize = totalPoolSize;
        this.inUsePool = new ArrayList<>();
        this.availablePool = new ArrayList<>();
        for(int i=0;i<availablePool.size();i++){
            availablePool.add(new DbConnection());
        }
    }

    private static ObjectPool objectPool = null;
    private static synchronized ObjectPool getInstance(int totalPoolSize){
        if(objectPool == null){
            objectPool = new ObjectPool(totalPoolSize);
        }
        return objectPool;
    }

    public synchronized DbConnection getDbConnection(){
        if(availablePool.isEmpty()){
            return null;
        }
        int avialableIndex = availablePool.size()-1;
        DbConnection dbConnection = availablePool.get(avialableIndex);
        availablePool.remove(avialableIndex);
        inUsePool.add(dbConnection);
        return dbConnection;
    }

    public synchronized void returnDbConnection(DbConnection dbConnection){
        inUsePool.remove(dbConnection);
        availablePool.add(dbConnection);
    }
}
