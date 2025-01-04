

/* 
     This is called eager loading of singleton pattern
    This may lead to resource waastage: Since the connection 
    object created may be used at all. So it is not recommended
*/
class DbConnection{
    private static DbConnection connection = new DbConnection();

    private DbConnection(){
        System.out.println("Connection created");
    }

    public static DbConnection getInstance(){
        return connection;
    }
}

