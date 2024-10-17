package lesson3;


import java.util.Arrays;

/*
1. Написать прототип компаратора - метод внутри класса сотрудника,
сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
2. Опишите класс руководителя, наследник от сотрудника.
Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
чтобы он мог поднять заработную плату всем, кроме руководителей.
В основной программе создайте руководителя и поместите его в общий массив сотрудников.
Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */
public class Main {

    static final Employee[] employeesRepo = {
            new Employee("Анна", 50000),
            new Employee("София", 45000),
            new Boss("Фёдор", 100000),
            new Employee("Александр", 55000),
            new Boss("Виктория", 75000),
            new Employee("Игорь"),
            new Employee("Амина", 60000),
            new Employee("Полина", 60000),
            new Employee("Давид", 60000),
            new Boss("Елизавета", 75000)
    };
    public static void main(String[] args) {
        Employee e = new Employee("Igor");
        System.out.println(e.compareData("1234.12.22", "1234.12.22"));
        System.out.println(e.compareData("1234.12.22", "1234.12.23"));

        Boss.increaseOrdinaryEployeesSalary(employeesRepo, 5000);
        for (Employee employee : employeesRepo) {
            System.out.printf("%s %d%n", employee.getName(), employee.getSalary());
        }
    }
}
