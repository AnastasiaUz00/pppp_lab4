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


        /**
         * CUBE
         */
        Cube recC = new Cube();
        Scanner nc = new Scanner(System.in);

        System.out.println("Введите длину куба: ");
        double xC = in.nextDouble();
        recC.areaCube(xC);
        recC.vCube(xC);

        recC.viewResultCube();


        /**
         * SPHERE
         */
        Sphere recSp = new Sphere();
        Scanner ns = new Scanner(System.in);

        System.out.println("Введите длину радиуса: ");
        double xS = in.nextDouble();
        recSp.areaSphere(xS);
        recSp.vSphere(xS);

        recSp.viewResultSphere();

    }
}
