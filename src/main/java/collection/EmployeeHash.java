package collection;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHash {
    private HashMap<String,String> empNames = new HashMap<>() ;



    String rollno;
    String name;

    public void setNames(String rollno, String name){
        empNames.put(rollno,name);
    }
    public void printNames(){
        System.out.println(empNames.values());
    }
    public void getNames(String key){
        System.out.println(empNames.get(key));
    }
    public void printNamesKeySet(){
        System.out.println(empNames.keySet());
    }
    public void printSize(){
        System.out.println(empNames.size());
    }
    public void remove(){
        System.out.println("remove " +empNames.remove("1"));
        System.out.println("After removing key : "+empNames.keySet());

    }
}

class TestHashMap{
    public static void main(String[] args) {
        EmployeeHash employeeHash = new EmployeeHash();
        employeeHash.setNames("1","sow");
        employeeHash.setNames("2","chan");
        employeeHash.setNames("3","san");
        employeeHash.setNames("4","bun");

        employeeHash.printNames();
        employeeHash.getNames("2");
        employeeHash.printNamesKeySet();
        employeeHash.printSize();
     //   employeeHash.remove();
    }
}
