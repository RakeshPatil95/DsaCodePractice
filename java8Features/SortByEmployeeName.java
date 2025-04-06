package java8Features;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    int Id;
    String name;

    Employee(int Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class SortByEmployeeName {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Rakesh");
        Employee e2 = new Employee(1, "Sagar");
        Employee e3 = new Employee(1, "Jagruti");
        Employee e4 = new Employee(1, "Dhaturi");
        Employee e5 = new Employee(1, "King");
        Employee e6 = new Employee(1, "Zebra");

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);

        list.stream()
                .sorted(Comparator
                        .comparing(Employee::getName, Comparator.reverseOrder()))
                .forEach((e) -> System.out.println(e.getName()));
    }
}
