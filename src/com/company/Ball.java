package com.company;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ball(){
        //Стандартные значения х = 0.0 и y = 0.0
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    public String toString() {
        return "Ball's coordinates are ("+this.x+", "+this.y+")";
    }
}
