package lesson3;

import java.util.Arrays;
import java.util.Objects;

public class Boss extends Employee{
    Boss(String name,int salary) {
        super(name,salary);
    }
    public static void increaseSalary(Employee employee, int amountToAdd) {
        Objects.requireNonNull(employee);
        if (amountToAdd < 0) {
            throw new IllegalArgumentException("amountToAdd");
        }
        Integer salary = employee.getSalary();
        if (salary == null) {
            return;
        }
        employee.setSalary(salary + amountToAdd);
    }

    public static void increaseOrdinaryEployeesSalary(Employee[] employees, int amountToAdd) {
        Objects.requireNonNull(employees);
        if (amountToAdd < 0) {
            throw new IllegalArgumentException("amountToAdd");
        }
        Arrays.stream(employees)
                // .filter(e -> e != null && !(e instanceof Chief))
                .filter(e -> e != null && e.getClass().isAssignableFrom(Employee.class))
                .forEach(e -> Boss.increaseSalary(e, amountToAdd));
    }
}
