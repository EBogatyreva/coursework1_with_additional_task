package pro.sky.java.course1;

public class EmployeeService {

    public static float sumSalary(Employee[] employee) {
        int sum =0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }

    public static float sumSalary(int office, Employee[] employee) {
        int sum1 = 0;
        for (int i = 0; i < employee.length; i++) {
            if ((employee[i] != null) && (employee[i].getOffice() == office))
                sum1 += employee[i].getSalary();
        }
        return sum1;
    }

    public static float minSalary(Employee[] employee) {
        float min = employee[0].getSalary();

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() < min) {
                    min = employee[i].getSalary();
                }
            }
        }
        return min;
    }

    public static float minSalary(int office, Employee[] employee) {
        float min = employee[0].getSalary();

        for (int i = 0; i < employee.length; i++) {
            if ((employee[i] != null) && (employee[i].getOffice() == office)) {
                if (employee[i].getSalary() < min)
                    return employee[i].getSalary();
            }
        }
        return min;
    }

    public static float maxSalary(int office, Employee[] employee) {
        float max = employee[0].getSalary();

        for (int i = 0; i < employee.length; i++) {
            if ((employee[i] != null) && (employee[i].getOffice() == office)) {
                if (employee[i].getSalary() > max) {
                    max = employee[i].getSalary();
                }
            }
        }
        return max;
    }

    public static float maxSalary(Employee[] employee) {
        float max = employee[0].getSalary();

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() > max) {
                    max = employee[i].getSalary();
                }
            }
        }
        return max;
    }

    public static float averageSalary(Employee[] employee) {
        float sum = sumSalary(employee);
        float average = 0;
        for (int i = 0; i < employee.length; i++) {
            average = sum / Employee.counter;
        }
        return average;
    }

    public static float averageSalary(int office, Employee[] employee) {
        float sum3 = 0, x = 0;
        for (int i = 0; i < employee.length; i++) {
            if ((employee[i] != null) && (employee[i].getOffice() == office)) {
                sum3 += employee[i].getSalary();
                x += 1;
            }
        }
        return sum3 / x;
    }

    public static void allNamesOfEmployee(Employee[] employee) {

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null)
                System.out.print(employee[i].getNameOfEmployee() + " ");
        }
        System.out.println(" ");
    }

    public static void namesEmployeesOfOffice(int office, Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if ((employee[i] != null) && (employee[i].getOffice() == office)) {
                System.out.print(employee[i].getNameOfEmployee() + " " + employee[i].getSalary() + " ");
            }
        }
        System.out.println(" ");
    }

    public static float indexation(Employee[] employees) {
        float cpi = Employee.cpi;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                float v = employees[i].getSalary() * (cpi / 100);
                employees[i].setSalary(v);
            }
        }
        return cpi;
    }

    public static void indexationByOfficeOnly(int office, Employee[] employee) {
        float cpi = Employee.cpi;

        for (int i = 0; i < employee.length; i++) {
            if ((employee[i] != null) && (employee[i].getOffice() == office)) {
                float v = employee[i].getSalary() * (cpi / 100);
                employee[i].setSalary(v);
            }
        }
    }

    public static void findSalaryLessNumber(float s, Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() < s)
                    System.out.println("Все сотрудники с зарплатой меньше заданного числа: " + s +
                            " {ФИО ='" + employee[i].getNameOfEmployee() + '\'' +
                            ", заработная плата=" + employee[i].getSalary() +
                            '}');
            }
        }
    }

    public static void findSalaryOverNumber(float s, Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if ((employee[i].getSalary() > s) || (employee[i].getSalary() == s))
                    System.out.println("Все сотрудники с зарплатой больше заданного числа: " + s +
                            " {ФИО ='" + employee[i].getNameOfEmployee() + '\'' +
                            ", заработная плата = " + employee[i].getSalary() +
                            '}');
            }
        }
    }

    public static void printAllEmployeeOfOffice(int office, Employee[] employees) {
        for (Employee employee : employees) {
            if ((employee != null) && (employee.getOffice() == office))
                System.out.println("Все сотрудники отдела: {" + "ID сотрудника = " + employee.getId() +
                        ", ФИО ='" + employee.getNameOfEmployee() + '\'' +
                        ", заработная плата = " + employee.getSalary() +
                        '}');
        }
    }
}


