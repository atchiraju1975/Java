class Vehicle {



    private String make;
    private String model;
    private int year;

    Vehicle(String make, String model, int year)
    {


        this.make = make;
        this.model = model;
        this.year = year;

    }

    String getMake()
    {


        return make;

    }


    String getModel()
    {


        return model;

    }

    int getYear()
    {

        return year;

    }

    void describe()
    {

        System.out.println(make + " " + model + " " + year);
    }

}



public class Car extends Vehicle
{

    private int numWheels;

    Car (String make, String model, int year, int numWheels)
    {

        super(make, model, year);
        this.numWheels = numWheels;
    }
        void describe(String owner)
    {
            System.out.print("This car, which is owned by " + owner + " ,is a ");
            super.describe ();
    }




    public static void main (String[] args)
    {

        Car car = new Car("Ford", "Fiesta", 2019, 4);
       // System.out.println("Make = " + car.getMake());
       // System.out.println("Model =" + car.getModel());
       // System.out.println("Year = " + car.getYear());
       // System.out.println("Number of Wheels = " + car.numWheels);
        car.describe ("SriniChakka");


    }


}
