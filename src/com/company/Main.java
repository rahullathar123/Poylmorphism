package com.company;
class Car{

    private int cylinders;
    private String carName;
    private boolean engine;
    private int wheels;
    public Car(int cylinders, String carName) {
        this.cylinders = cylinders;
        this.carName = carName;
        this.engine = true;
        this.wheels = 4;
    }

    public String getCarName() {
        return carName;
    }

    public String startEngine(){
        return "Automatic";
    }

    public String accelerate(){
        return "0 to 100 in 2 mins";
    }
    public String brake(){
        return "sticky brakes";
    }
}

class Porche extends Car{


    public Porche() {
        super(4,"Porche 2000");
    }

    @Override
    public String accelerate() {
        return "200 km in 3 mins";
    }

    @Override
    public String brake() {
        return "normal Brakes";
    }
}
class BMW extends Car{


    public BMW() {
        super(6,"BMW 2010");
    }

    @Override
    public String startEngine() {
        return "manual";
    }

    @Override
    public String accelerate() {
        return "0 to 40 km in 2 mins";
    }

    @Override
    public String brake() {
        return "Sticky Brakes";
    }
}

class Ferrari extends Car{


    public Ferrari(){
        super(8,"Ferrari 2015");
    }

    @Override
    public String startEngine() {
        return "Automatic and Manual";
    }

    @Override
    public String accelerate() {
        return "0 to 75 km in 2hrs";
    }

    @Override
    public String brake() {
        return "Hydrogen Brakes";
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here

        for(int i =1; i<11; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i +" : " + car.getCarName() + "\n" + "Brakes Type " + car.brake() + "\n");

        }

    }

    public static Car randomCar(){

        int randomNumber = (int) (Math.random()* 3) + 1;
        System.out.println("Random Number generated was: " + randomNumber);
        switch (randomNumber){

            case 1:
                return  new Porche();

            case 2:
                return new BMW();

            case 3:
                return new Ferrari();

        }
        return null;
    }
}
