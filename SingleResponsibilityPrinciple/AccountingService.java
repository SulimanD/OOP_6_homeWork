package SingleResponsibilityPrinciple;
// Создание класса AccountingService
public class AccountingService {
    private int baseSalary;
// Конструктор класса AccountingService
    public AccountingService(int baseSalary) {
        this.baseSalary = baseSalary;
        }
// Метод для расчёта зарплаты с вычитанием суммы налога
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
        }
}
