import java.awt.*;

public class Zadanie_4 {
    public void task4() {
    Figure[]figures=new Figure[4];
    figures[0]=new Rectangle(5,10);
    figures[1]=new Circle(3);
    figures[2]=new RightTriangle(4,6);
    figures[3]=new Trapezoid(3,5);

    for(Figure figure:figures){
        System.out.println("Площадь фигуры: "+figures.calculaterArea);
    }
    }
}
abstract class Figure{
    abstract double calculaterArea();
}
class RightTriangle extends Figure{
    private  double base;
    private double height;
    RightTriangle(double base,double height){
        this.base=base;
        this.height=height;
    }
}
class Trapezoid extends  Figure{
    private  double top;
    private  double botton;
    private  double height;
    Trapezoid(double top,double botton,double height){
        this.height=height;
        this.botton=botton;
        this.top=top;
    }
    double calculaterArea(){return 0.5*(top+botton)*height;}
}
