package pro.sky.java.course1;

public class Employee {
    private final String nameOfEmployee;
    private int office;
    private float salary;
    private int id;
    public static int counter = 0;
    public static float cpi = 106.7f;//ИПЦ

    public Employee(String nameOfEmployee, int office, float salary) {
        this.nameOfEmployee = nameOfEmployee;
        this.office = office;
        this.salary = salary;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public int getOffice() {
        return office;
    }

    public float getSalary() {
        return salary;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" + "ID сотрудника = " + id +
                ", ФИО ='" + nameOfEmployee + '\'' +
                ", офис=" + office +
                ", заработная плата=" + salary +
                '}';
    }

}
