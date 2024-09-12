package se.samer;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Car car1 = new Car(0, "gröna");
        Car car2 = new Car(50, "röda");


        System.out.println(car1.Status());
        System.out.println(car2.Status());

        System.out.println(car1.Accelarate(150));


    }
}