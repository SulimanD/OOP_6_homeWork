package InterfaceSegregationPrinciple;

// Создание класса Cube и подключение к интерфейсам Shape, VolumetricShape
public class Cube implements Shape, VolumetricShape {
    private int edge;
// Конструктор класса Cube 
    public Cube(int edge) {
        this.edge = edge;
    }
// Метод area(), который считает площадь фигуры
    @Override
    public double area() {
        return 6 * edge * edge;
    }
// Метод volume(), который считает объём фигуры
    @Override
    public double volume() {
        return edge * edge * edge;
    }
    }
