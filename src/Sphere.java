/**
 * Created by Maxim on 11.05.2022.
 */
public class Sphere {
    public double sideSphere1, sideSphere2;
    public Sphere(){}
    //Формула для нахождения площади поверхности
    public double areaSphere(double xS){
        sideSphere1 = 4*Math.PI*xS*xS;
        return sideSphere1;
    }
    //Формула для нахождения объема сферы
    public double vSphere(double xS){
        sideSphere2 = (4*Math.PI*xS*xS)/3;
        return sideSphere2;
    }
    public void viewResultSphere(){
        System.out.println("Площадь сферы: "+sideSphere1);
        System.out.println("Объем сферы: "+sideSphere2);
    }
}
