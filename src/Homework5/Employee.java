package Homework5;

import java.text.MessageFormat;

public class Employee {

    private String firstName;
    private String secondName;
    private String lastName;
    private String businessPosition;
    private String email;
    private String phoneNumber;
    private float salary;
    private int age;

    public Employee(String firstName,
                    String secondName,
                    String lastName,
                    String businessPosition,
                    String email,
                    String phoneNumber,
                    float salary,
                    int age)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.businessPosition = businessPosition;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getEmployeeData() {
        return MessageFormat.format("Имя: {0};\nОтчество: {1};\nФамилия: {2};\nДолжность: {3};\nПочта: {4};\nНомер телефона: {5};\nЗ/п: {6};\nВозраст: {7}\n",
                firstName, secondName, lastName, businessPosition, email, phoneNumber, salary, age);
    }

    public int getAge() {
        return age;
    }
}
