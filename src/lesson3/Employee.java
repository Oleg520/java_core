package lesson3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    private String name;
    private int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    Employee(String name){
        this(name, 0);
    }

    public boolean compareData(String data1, String data2){
        String strFormatter = "yyyy.MM.dd";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(strFormatter);
        LocalDate date1 = LocalDate.parse(data1, dateTimeFormatter);
        LocalDate date2 = LocalDate.parse(data2, dateTimeFormatter);

        return date1.equals(date2);
    }

    public String getName() {
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
