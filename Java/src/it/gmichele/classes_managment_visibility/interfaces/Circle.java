package it.gmichele.classes_managment_visibility.interfaces;

public class Circle implements Shape, Interface{
    private double diameter;

    public Circle(double diameter) {
    this.diameter = diameter;
    }

    public void draw(){
        return;
    }
    public boolean isPermitted(){
        return false;
    }

    public boolean isFilled(boolean val){
        return val;
    }
}