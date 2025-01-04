
/*
 *   Student is the one that is being built.
 *  Currently in the student, all the parameters are rqeuired to built.
 *  B8ut phone, address is optional, in that case, I have to build many constructors
 */
class Student {
    private int roll;
    private String name;
    private int age;
    private String address;
    private String phone;
    private String email;

    public Student(int roll, String name, int age, String address, String phone, String email) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Student(StudentBuilder builder) {
        // currently using the access, have to use getters instead:=
        new Student(builder.roll, builder.name, builder.age, builder.address, builder.phone, builder.email);
    }
}

// Usually the builder is written within the class itself as staic inner class
// for ease of access & tight coupling.

class StudentBuilder {
    int roll;
    String name;
    int age;
    String address;
    String phone = "MA"; // these will be used as default values
    String email = "NA";

    // only roll number is comulsary, rest all are optional
    public StudentBuilder StudentBuilder(int roll) {
        this.roll = roll;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
