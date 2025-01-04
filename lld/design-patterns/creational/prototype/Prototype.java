/**
 * 
 * Prototype pattern is used when we need the object that has same properties.
 * Removes the overhead of initilization by the client, hides the intricacies of the object creation.
 * used when creating the new object is costly or complex than copying from the existing object.
 */

// prototype interface
interface Prototype{
    Prototype clone();
    void draw();
}
 class Student implements Prototype {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll  = roll;
    }

    @Override
    public Student clone() {
        return new Student(this.name, this.roll);
    }

    public void draw(){
        System.out.println("Draw");
    }
}

class Main{
    public static void maint(String[] args){
        Prototype std = new Student("name", 0);
        Prototype copy = std.clone();
    }
}
