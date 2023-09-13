package excep;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C://file//abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Employee emp = new Employee(1,"mm", "kk",1230456);
        oos.writeObject(emp);
        System.out.println("Object saved into the file");
    }
}

class DeserialDemo{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C://file//abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj =  ois.readObject();
        Employee emp = (Employee) obj;
        System.out.println("Got the object "+emp.name);
    }
}