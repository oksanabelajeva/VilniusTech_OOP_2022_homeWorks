package homeworkBonus2022_10_10;

import java.text.DecimalFormat;

public class Car {

    private final int INITIAL_FUEL_LEVEL = 0;
    private double fuelEfficiency; //km/litre

    private double fuelInFuelTank; //litre

    public Car(double fuelEfficiency) {
        this.fuelEfficiency = (fuelEfficiency < 0) ? 0 : fuelEfficiency;
        fuelInFuelTank = INITIAL_FUEL_LEVEL;
    }

    public static void main(String[] args) {

        Car myCar = new Car(30); // 30 km per litre

        System.out.println("Car's fuel efficiency is " + myCar.getFuelEfficiency() + " kilometers per litre.");
        myCar.addFuel(20);
        myCar.drive(100);
        String formattedFuelLevelInTankTwoNumbersAfterComa = new DecimalFormat("#0.00").format(myCar.getFuelLevel());
        System.out.println("There are " + formattedFuelLevelInTankTwoNumbersAfterComa + " litres in the tank.");
        myCar.addFuel(35);
        String formattedFuelLevelInTankAfterAddedFuelTwoNumbersAfterComa = new DecimalFormat("#0.00").format(myCar.getFuelLevel());
        System.out.println("There are " + formattedFuelLevelInTankAfterAddedFuelTwoNumbersAfterComa + " litres in the tank.");
        myCar.drive(2000);
        String formattedFuelLevelInTankAfterDriveTwoNumbersAfterComa = new DecimalFormat("#0.00").format(myCar.getFuelLevel());
        System.out.println("There are " + formattedFuelLevelInTankAfterDriveTwoNumbersAfterComa + " litres in the tank.");
    }

    /**
     * Method to simulate driving the car for a certain distance, reducing the fuel level in the tank.
     *
     * @param distance - kilometers
     */
    public void drive(double distance) {
        if (distance > 0 && fuelEfficiency > 0) {
            System.out.println("The car drove " + distance + " km.");
            fuelInFuelTank -= distance / fuelEfficiency;
        } else {
            System.out.println("Please enter distance bigger than 0 or check fuel efficiency.");
        }
    }

    /**
     * Method to return the current fuel level in litres.
     *
     * @return fuel amount in the fuel tank.
     */
    public double getFuelLevel() {
        if (fuelInFuelTank > 0) {
            return fuelInFuelTank;
        } else {
            return 0;
        }
    }

    /**
     * Method to tank up in litres.
     *
     * @param additionalFuel - litres
     */
    public void addFuel(double additionalFuel) {
        if (additionalFuel > 0) {
            System.out.println(additionalFuel + " litres are added in the tank.");
            fuelInFuelTank += additionalFuel;
        } else {
            System.out.println("Please enter distance bigger than 0.");
        }
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getFuelInFuelTank() {
        return fuelInFuelTank;
    }

    public void setFuelInFuelTank(double fuelInFuelTank) {
        this.fuelInFuelTank = fuelInFuelTank;
    }
}
