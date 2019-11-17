public class Suv extends Vehicle{

    private int numWheels;

    Suv (String make, String model, int year, int numWheels){

        super(make, model, year);
        this.numWheels = numWheels;

    }

    public static void main (String[] args){

        Suv suv = new Suv("Ford", "Explorer", 2019, 6);
        System.out.println("Make = " + suv.getMake());
        System.out.println("Model =" + suv.getModel());
        System.out.println("Year = " + suv.getYear());
        System.out.println("Number of Wheels = " + suv.numWheels);



    }


}