package InterfaceSegregationPrinciple;
// Переписать код в соответствии с Interface Segregation Principle:
// Подсказка: круг не объемная фигура и этому классу не нужен метод volume().

// Создание класса Circle и подключение к интерфейсу Shape
public class Circle implements Shape {
    private double radius;
// Конструктор класса Circle
    public Circle(double radius) {
        this.radius = radius;
    }
// Метод area(), который считает площадь фигуры
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}


