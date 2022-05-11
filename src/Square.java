/**
 * Created by Maxim on 11.05.2022.
 */
public class Square {
        public double sideSquare1, sideSquare2;
        public Square(){}
        //Формула для нахождения площади
        public double areaSquare(double x){
            sideSquare1 = (x*x);
            return sideSquare1;
        }
        //Формула для нахождения периметра квадрата
        public double perimeterSquare(double x){
            sideSquare2 = (x+x)*2;
            return sideSquare2;
        }
        public void viewResultSquare(){
            System.out.println("Площадь квадрата: "+sideSquare1);
            System.out.println("Периметра квадрата: "+sideSquare2);
        }
}
