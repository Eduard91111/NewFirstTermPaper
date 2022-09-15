public class Employee {
    private String fIO;
    private int department;
    private float salary;
    private static int id;
    private static int counter;

    public Employee(String fio, int department, float salary) {
        this.fIO = fio;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public int getId() { return id; }
    public String getFIO() { return fIO; }
    public int getDepartment() { return department; }
    public float getSalary() { return salary; }


    public void SetFIO(String fio) { this.fIO = fio; }
    public void SetDepartment(int department) { this.department = department; }
    public void SetSalary(float sal) { this.salary = salary; }

    @Override
    public String toString() {
        return id++ + " Ф.И.О.: " + fIO + " Отдел: " + department + " Зарплата: " + salary;
    }
}
