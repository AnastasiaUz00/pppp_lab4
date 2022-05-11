/**
 * Created by Maxim on 11.05.2022.
 */
public class Cube {
        public double sideCube1, sideCube2;
        public Cube(){}
        //Формула для нахождения площади
        public double areaCube(double xC){
            sideCube1 = 6*xC*xC;
            return sideCube1;
        }
        //Формула для нахождения объема куба
        public double vCube(double xC){
            sideCube2 = xC*xC*xC;
            return sideCube2;
        }
        public void viewResultCube(){
            System.out.println("Площадь куба: "+sideCube1);
            System.out.println("Периметра куба: "+sideCube2);
        }
}
