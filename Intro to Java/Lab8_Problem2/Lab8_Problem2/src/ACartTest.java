import java.util.Scanner;
/*
Arash Vasheghani
CS\IS 112
Lab 8 Problem2
2/5/2024
*/
public class ACartTest
{
    public static void main(String[] arg)
    {
        Car car1 = new Car("2017", "Jeep");
        Car car2 = new Car();

        System.out.println("Please enter year model for car 2: ");
        Scanner keyboard = new Scanner(System.in);
        car2.setYearModel(keyboard.nextLine());

        System.out.println("Please enter make car 2: ");
        car2.setMake(keyboard.nextLine());

        System.out.println(car1.getYearModel()+" "+car1.getMake());
        System.out.println(car2.getYearModel()+" "+car2.getMake());

        accelerate(car1);
        accelerate(car1);
        accelerate(car1);
        accelerate(car1);
        accelerate(car1);
        brake(car1);
        brake(car1);
        brake(car1);
        brake(car1);
        brake(car1);
    }
    public static void accelerate(Car car)
    {
        car.addAccelerate();
        System.out.println(car.getMake()+" accelerating at "+car.getSpeed()+" mph");
    }
    public static void brake(Car car)
    {
        car.addBrake();
        System.out.println(car.getMake()+" braking at "+car.getSpeed()+ " mph");
    };
}
