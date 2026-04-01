package streamApi;
import java.util.*;
import java.util.stream.Collectors;

class Employee1 {
    int id;
    String name;
    double salary;
    int age;
    String department;

    public Employee1(int id, String name, double salary, int age, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Salary: " + salary + " | Dept: " + department;
    }
}

public class Ques1pra {
    public static void main(String[] args) {

        ArrayList<Employee1> empList = new ArrayList<>(Arrays.asList(
                new Employee1(101, "Amit", 50000, 25, "IT"),
                new Employee1(102, "Neha", 60000, 28, "HR"),
                new Employee1(103, "Ravi", 45000, 24, "IT"),
                new Employee1(104, "Karan", 70000, 30, "Finance"),
                new Employee1(105, "Pooja", 55000, 27, "HR"),
                new Employee1(106, "Rohit", 80000, 32, "IT"),
                new Employee1(107, "Simran", 65000, 29, "Finance"),
                new Employee1(108, "Amit", 50000, 25, "IT")
        ));

        // Min salary
        empList.stream()
                .min(Comparator.comparing(Employee1::getSalary))
                .ifPresent(e -> System.out.println("Min Salary: " + e.getName() + " " + e.getSalary()));

        // Max Salary
        empList.stream()
                .max(Comparator.comparing(Employee1::getSalary))
                .ifPresent(e -> System.out.println("Max Salary: " + e.getName() + " " + e.getSalary()));
        

        // remove duplicate
        empList.stream()
        		.collect(Collectors.toMap(Employee1::getName,e->e,(e1,e2)->e1)).values()
        		.forEach(e->System.out.println(e.getName()));
        
        //3 highest salary
        empList.stream()
        .sorted(Comparator.comparing(Employee1::getSalary).reversed())
        .limit(3)
        .forEach(e-> System.out.println(e.getName()+" "+e.getSalary()));
        
        
        //skip 2 and next 3
        empList.stream()
        .sorted(Comparator.comparing(Employee1::getSalary).reversed())
        .skip(2).limit(3)
        .forEach(e->System.out.println(e.getName()+" "+e.getSalary()));

        
        // youngest employee
        empList.stream()
        .min(Comparator.comparing(Employee1::getAge))
        .ifPresent(e->System.out.println(e.getName()+" "+e.getAge()));

        
        //oldest employee
        empList.stream()
        .max(Comparator.comparing(Employee1::getAge))
        .ifPresent(e->System.out.println(e.getName()+" "+e.getAge()));

        
        //minimum salary in IT
        empList.stream().filter(e->e.getDepartment().equals("IT"))
        .min(Comparator.comparing(Employee1::getSalary))
        .ifPresent(e->System.out.println(e.getName()+" IT "+e.getSalary()));
        
        
        empList.stream().filter(e->e.getDepartment().equals("HR"))
        .max(Comparator.comparing(Employee1::getSalary))
        .ifPresent(e->System.out.println(e.getName()+" HR "+e.getSalary()));
        // Min salary age > 25
        Employee1 result = empList.stream()
                .filter(e -> e.getAge() > 25)
                .min(Comparator.comparing(Employee1::getSalary))
                .get();

        System.out.println("Max Salary Age > 25: " + result);
        
        
        //Max salary age<30
        Employee1 result1 = empList.stream()
                .filter(e -> e.getAge() <30)
                .max(Comparator.comparing(Employee1::getSalary))
                .get();

        System.out.println("Max Salary Age < 30: " + result1);
        
        
       // remove duplicate names and print first 5
        empList.stream()
        .collect(Collectors.toMap(Employee1::getName,e->e,(e1,e2)->e1))
        .values()
        .stream()
        .limit(5)
        .forEach(e->System.out.println(e.getName()));
        
        //3 highest from IT 
        empList.stream().filter(e->e.getDepartment().equals("IT"))
        .sorted(Comparator.comparing(Employee1::getSalary).reversed())
        .limit(3)
        .forEach(e->System.out.println(e.getName()+e.getSalary()));
    }
}