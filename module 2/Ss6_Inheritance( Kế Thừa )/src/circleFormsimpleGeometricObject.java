package src;

public class circleFormsimpleGeometricObject extends simleGeometricObject{
    private double radius;
    public circleFormsimpleGeometricObject(){};
    public circleFormsimpleGeometricObject(double radius){
        this.radius = radius;
    }
    public circleFormsimpleGeometricObject(double radius, String name, boolean filler){
        super(name, filler);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
    public double getDiameter(){
        return this.radius * 2;
    }
    public void printCircle(){

    }
    @overrive
    public String toString(){
        return "circleFormsimpleGeometricObject [radius=" + radius +  "]";
    }
}

