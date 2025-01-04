/**
 * Proxy design pattern is used whenever we want to add an extra layer of
 * protection or access control over the object
 * Used by the spring boot beans, Every bean created will have a proxy and all
 * the requests will go throwgh the proxy.
 * 
 * It is used in authentication, middlewares, access control (admin only) etc.
 * Can be used when for implementing the caching as well.
 * proxies can be chained.
 * 
 * Both the proxy and the real implementation must follow the same interface :
 * so that client can use the same interface
 * 
 * Protects the original object from the outside world
 */

/*
 * This shows the example of using the proxy as cache.
 * loading the image every time is expensive orperation: so it is cached.
 */
interface Image {
    void display();
}

class RealImage implements Image {
    String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    void loadImageFromDisk() {
        System.out.println("Loading image from disk: " + filename);
    }

    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}

// once cached it will return the same image. And will not laod the iamge from
// the disk again
class ImageProxy implements Image {
    private RealImage realImage;
    String filename;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

/*
 * 
 * The following is an example of using the proxy for access control
 * Only the employees with level > 5 can access the file.
 */

interface File {
    void print();
}

class EmployeeFile implements File {
    Employee employee;

    EmployeeFile(Employee employee) {
        this.employee = employee;
    }

    public void print() {
        System.out.println("Employee File Printed");
    }
}

class EmployeeFileProxy implements File {
    Employee employee;

    EmployeeFileProxy(Employee employee) {
        this.employee = new EmployeeFile(employee);
    }

    public void print() {
        if (employee.rank > 5) {
            new EmployeeFile(employee).print();
        } else {
            // no access
        }
    }
}
