package it.gmichele.classes_managment_visibility.interfaces;

public interface Shape{
    // questa può contenere metodi vuoti
    // quando andremo però ad implementarla dovremo inserire tutti i metodi che
    // sono presenti nell interfaccia
    public static final int MAX_V = 50;
    public boolean isPermitted();
    public void draw();

}