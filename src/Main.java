/**
 * Created by Maxim on 11.05.2022.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника: ");
        double num1 = in.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double num2 = in.nextDouble();

        rec.perimeterCalculator(num1, num2);
        rec.areaCalculator(num1, num2);

        rec.viewResult();

        /**
         * SQUARE
         */
        Square recS = new Square();
        Scanner n = new Scanner(System.in);

        System.out.println("Введите длину квадрата: ");
        double x = in.nextDouble();


        recS.perimeterSquare(x);
        recS.areaSquare(x);

        recS.viewResultSquare();
    }
}
