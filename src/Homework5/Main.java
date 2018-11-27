package Homework5;

public class Main {

    public static void main(String[] args) {
//        Employee employee = new Employee("Tom", "William", "Carter", "developer", "test@test.com", "+7-911-111-11-11", 5000f, 22);
//        System.out.println(employee.getEmployeeData());

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иван", "Иванович", "Иванов", "Директор", "iii@test.ru", "12345", 15000f, 45);
        employeesArray[1] = new Employee("Дмитрий", "Иванович", "Петров", "Разработчик", "dip@test.ru", "123456", 10000f, 25);
        employeesArray[2] = new Employee("Алексей", "Сергеевич", "Сергеев", "Разработчик", "ssr@test.ru", "1234567", 10000f, 41);
        employeesArray[3] = new Employee("Антон", "Михайлович", "Демидов", "Разработчик", "amd@test.ru", "12345678", 10000f, 22);
        employeesArray[4] = new Employee("Эдуард", "Сергеевич", "Суровый", "Разработчик", "ess@test.ru", "12345679", 10000f, 27);

        for (Employee emp: employeesArray) {
            if (emp.getAge() > 40) {
                System.out.println(emp.getEmployeeData());
            }
        }
    }
}
