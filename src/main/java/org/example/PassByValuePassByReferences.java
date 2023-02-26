package org.example;

public class PassByValuePassByReferences {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        update(x,y);
        System.out.println("Wartość x jest równa: " + x);
        System.out.println("Wartość y jest równa: " + y);
        Rectangle rectangle = new Rectangle(x,y);
        System.out.println("Wartość x jest równa: " + rectangle.getX());
        System.out.println("Wartość x jest równa: " + rectangle.getY());
        update2(rectangle);
        System.out.println("Wartość x jest równa: " + rectangle.getX());
        System.out.println("Wartość x jest równa: " + rectangle.getY());
    }
    static void update(int a, int b){
        a = a+1;
        b++;
    }
    static void update2(Rectangle rectang){
        rectang.setX(rectang.getX()+1);
        rectang.setY(rectang.getY()+1);
    }


}
