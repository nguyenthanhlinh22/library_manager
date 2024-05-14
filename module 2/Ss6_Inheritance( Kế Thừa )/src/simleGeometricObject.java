package src;

import java.util.Date;

public class simleGeometricObject {
    protected String color = "red" ;
    protected boolean filled ;
    protected Date datecreated ;

    public simleGeometricObject() {
        datecreated = new java.util.Date() ;

    }
    public simleGeometricObject(String color, boolean filled){
        datecreated = new java.util.Date() ;
        this.color = color ;
        this.filled = filled;
        this.datecreated = new Date();
    };
    public String getColor(){
        return this.color ;

    };
    public void setColor(String color ){
        this.color = color ;

    };
    public boolean isFilled(){
        return this.filled;
    };
    public void setFilled(boolean filled){
        this.filled = filled;
    };
    public java.util.Date getDateCreated(){
        return this.datecreated ;
    }
    public String toString(){
        return "created on " + this.datecreated + "\ncolor:" + this.color + "án filled:" + this.filled ;
    }

}