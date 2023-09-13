package excep;

import java.io.Serializable;

public class Employee implements Serializable {
    int id;
    String name;
    String address;
    long phone;

    public Employee(int id, String name, String address, long phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}
