import java.util.Scanner;
abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Подкласс для квадрата
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

// Подкласс для треугольника
class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        // Реализация расчета площади треугольника
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

class Trapezoid extends Shape {
    private double base1, base2, height, side1, side2;

    public Trapezoid(double base1, double base2, double height, double side1, double side2) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return (base1 + base2) * height / 2;
    }

    @Override
    public double calculatePerimeter() {
        return base1 + base2 + side1 + side2;
    }
}


public class Main4 {
    public static void main(String[] args) {
        // Пример использования классов
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите фигуру: 1 - Квадрат, 2 - Треугольник, 3 - Трапеция");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Введите длину стороны квадрата:");
            double side = scanner.nextDouble();
            Square square = new Square(side);
            System.out.println("Площадь квадрата: " + square.calculateArea());
            System.out.println("Периметр квадрата: " + square.calculatePerimeter());
        } else if (choice == 2) {
            System.out.println("Введите длины сторон треугольника:");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Площадь треугольника: " + triangle.calculateArea());
            System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
        } else if (choice == 3) {
            System.out.println("Введите длины оснований, высоту и длины боковых сторон трапеции:");
            double base1 = scanner.nextDouble();
            double base2 = scanner.nextDouble();
            double height = scanner.nextDouble();
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            Trapezoid trapezoid = new Trapezoid(base1, base2, height, side1, side2);
            System.out.println("Площадь трапеции: " + trapezoid.calculateArea());
            System.out.println("Периметр трапеции: " + trapezoid.calculatePerimeter());
        }else {
            System.out.println("Некорректный выбор фигуры");
        }
    }
}