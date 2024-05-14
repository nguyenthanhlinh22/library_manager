public class Circle {
    private double radius = 1.0 ;
    private String color = "red" ;

    Circle(){

    };
    Circle(double r , String c){
        radius = r ;
        color = c ;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

}
