package pro.sky.java.course1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Сотрудник1", 1, 1000);
        System.out.println(employee1.getNameOfEmployee() + " " + employee1.getOffice() + " " + employee1.getSalary() + " " + employee1.getId());

        Employee employee2 = new Employee("Сотрудник2", 3, 5_000);
        System.out.println(employee2.getNameOfEmployee() + " " + employee2.getOffice() + " " + employee2.getSalary() + " " + employee2.getId());

        Employee employee3 = new Employee("Сотрудник3", 2, 500);
        System.out.println(employee3.getNameOfEmployee() + " " + employee3.getOffice() + " " + employee3.getSalary() + " " + employee3.getId());

        Employee employee4 = new Employee("Сотрудник4", 4, 3_000);
        System.out.println(employee4.getNameOfEmployee() + " " + employee4.getOffice() + " " + employee4.getSalary() + " " + employee4.getId());

        employee1.setSalary(6_000);
        employee1.setOffice(3);

        Employee[] employee;
        employee = new Employee[]{employee1, employee2, null, employee3, null, null, null, null, null, employee4};
        String s = Arrays.toString(employee);
        System.out.println(s);

        System.out.println("Сумма затрат в месяц, на всех сотрудников: " + EmployeeService.sumSalary(employee) + " рублей");
        System.out.println("Минимальная заработная плата: " + EmployeeService.minSalary(employee) + " рублей");
        System.out.println("Максимальная заработная плата: " + EmployeeService.maxSalary(employee) + " рублей");
        System.out.println("Средняя заработная плата: " + EmployeeService.averageSalary(employee) + " рублей");

        EmployeeService.allNamesOfEmployee(employee);

        System.out.println(" ");
        System.out.println("Задачи повышенной сложности: ");
        String s1 = Arrays.toString(employee);
        System.out.println("Все сотрудники: " + s1);
        EmployeeService.indexationByOfficeOnly(4, employee);
        String s2 = Arrays.toString(employee);
        System.out.println("Индексация только по номеру отдела: " + s2);

        EmployeeService.indexation(employee);
        String s3 = Arrays.toString(employee);
        System.out.println("Индексация по всем отделам: " + s3);

        EmployeeService.namesEmployeesOfOffice(3, employee);

        System.out.println("Минимальная заработная плата по отделу: " + EmployeeService.minSalary(3, employee) + " рублей");
        System.out.println("Максимальная заработная плата по отделу: " + EmployeeService.maxSalary(3, employee) + " рублей");
        System.out.println("Сумма затрат в месяц на сотрудников отдела: " + EmployeeService.sumSalary(3, employee) + " рублей");
        System.out.println("Средняя заработная плата по отделу: " + EmployeeService.averageSalary(3, employee) + " рублей");

        EmployeeService.printAllEmployeeOfOffice(3, employee);

        //найти по значению
        EmployeeService.findSalaryLessNumber(2000, employee);
        EmployeeService.findSalaryOverNumber(5000, employee);


    }
}

