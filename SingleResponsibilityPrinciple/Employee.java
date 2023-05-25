package SingleResponsibilityPrinciple;
import java.util.Date;
// Переписать код в соответствии с Single Responsibility Principle:
// Подсказка: вынесите метод calculateNetSalary() в отдельный класс

// Создание класса Employee
public class Employee {
    private String name;
    private Date dob;
// Конструктор класса Employee   
    public Employee(String name, Date dob) {
    this.name = name;
    this.dob = dob;
    }
// Метод для вызова имени и даты рождения экземпляра
    public String getEmpInfo() {
    return "name - " + name + " , dob - " + dob.toString();
    }
    }