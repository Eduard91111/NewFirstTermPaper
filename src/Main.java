public class Main {
    public static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("ФИО", 1, 31000f);
        employees[1] = new Employee("ФИО", 2, 32500f);
        employees[2] = new Employee("ФИО", 3, 25000f);
        employees[3] = new Employee("ФИО", 4, 29000f);
        employees[4] = new Employee("ФИО", 5, 50000f);
        employees[5] = new Employee("ФИО", 6, 80000f);
        employees[6] = new Employee("ФИО", 7, 120000f);
        employees[7] = new Employee("ФИО", 8, 20000f);
        employees[8] = new Employee("ФИО", 9, 48000f);
        employees[9] = new Employee("ФИО", 10, 52000f);
        printAllEmployee ();
        System.out.println("Сумма затрат на зарплаты в месяц = " + getAmountOfSalaries ());
        System.out.println("Сотрудник с минимальной зарплатой - " + getEmployeeMinSalaries ());
        System.out.println("Сотрудник с максимальной зарплатой - " + getEmployeeMaxSalaries ());
        System.out.println("Среднее значение зарплат = " + getEmployeeAverageSalaries ());
        printNameAllEmployee();
    }
    public static void printAllEmployee () {
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
    public static float getAmountOfSalaries () {
        float sum = 0f;
        for (Employee employee: employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }
    public static Employee getEmployeeMinSalaries () {
        float minSalaries = Float.MAX_VALUE;
        Employee employeeMinSalaries = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees [i].getSalary() < minSalaries) {
                minSalaries = employees [i].getSalary();
                employeeMinSalaries = employees [i];
            }
        }
        return employeeMinSalaries;
    }
    public static Employee getEmployeeMaxSalaries () {
        float maxSalaries = Float.MIN_VALUE;
        Employee employeeMaxSalaries = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees [i].getSalary() > maxSalaries) {
                maxSalaries = employees [i].getSalary();
                employeeMaxSalaries = employees [i];
            }
        }
        return employeeMaxSalaries;
    }
    public static float getEmployeeAverageSalaries () {
        float sum = 0f;
        int countEmployee = 0;
        for (Employee employee : employees) {
            countEmployee++;
            sum = sum + employee.getSalary();
        }
        return sum;
    }
    public static void printNameAllEmployee () {
        for (Employee employee : employees) {
            System.out.println(employee.getFIO());
        }
    }
}