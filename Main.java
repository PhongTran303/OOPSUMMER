package bai1;

public class Main {
    public static void main(String[] args) {
        ToaDo toado1 = new ToaDo();
        toado1.setX(3);
        toado1.setY(6);
        toado1.setName("A");

        ToaDo toado2 = new ToaDo(8, 10, "B");

        System.out.println(toado1.getX()); 
        System.out.println(toado1.getY()); 
        System.out.println(toado1.getName()); 
        System.out.println(toado1.toString()); 

        System.out.println(toado2.toString());
    }
}