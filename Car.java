package Assignments;

public class Car {
    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean rent;

    public static String companyName = "JUST RENTALS";
    public static int totalCars = 0;

    public Car() {
        this.plateNumber = "ABC23";
        this.carModel = "TOYOTA";
        this.dailyRate = 40.2;
        this.rent = false;
        totalCars++;
    }

    public Car(String plateNumber, String carModel, double dailyRate) {
        this.plateNumber = plateNumber;
        this.carModel = carModel;
        setDailyRate(dailyRate);
        this.rent = false;
        totalCars++;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return carModel;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRented() {
        return rent;
    }

    public void setDailyRate(double rate) {
        if (rate >= 0) {
            this.dailyRate = rate;
        } else {
            System.out.println("Error: Daily rental rate cannot be negative.");
        }
    }

    public void rent() {
        if (!rent) {
            rent = true;
            System.out.println("Car (" + plateNumber + " - " + carModel + ") successfully rented.");
        } else {
            System.out.println("Car (" + plateNumber + ") is already rented!");
        }
    }

    public void returnCar() {
        if (rent) {
            rent = false;
            System.out.println("Car (" + plateNumber + ") successfully returned.");
        } else {
            System.out.println("Car (" + plateNumber + ") was not rented.");
        }
    }

    public void displayInfo() {
        System.out.println("--- Car Details ---");
        System.out.println("Plate Number  " + plateNumber);
        System.out.println("Model         " + carModel);
        System.out.println("Daily Rate    $" + dailyRate);
        System.out.println("Status        " + (rent ? "Rented" : "Avaliable"));

    }

    public static void displayCompanyName() {
        System.out.println("Rental Company Name: " + companyName);
    }

    public static void displayTotalCars() {
        System.out.println("Total Cars in System: " + totalCars);
    }
}
class TestCar {
    public static void main(String[] args) {
        Car.displayCompanyName();
        System.out.println();


        Car car1 = new Car("ABC-1234", "Toyota Corolla", 50.0);


        Car car2 = new Car();

        System.out.println();

        System.out.println("Initial Car Information:");
        car1.displayInfo();
        car2.displayInfo();

        System.out.println("Attempting to rent car1...");
        car1.rent();

        System.out.println("\nAttempting to rent car1 again...");
        car1.rent();

        System.out.println();

        System.out.println("Returning car1...");
        car1.returnCar();

        System.out.println();

        System.out.println("Updating daily rate for car1 to $60.0...");
        car1.setDailyRate(60.0);

        System.out.println("Attempting to set a negative daily rate (-10.0) for car1...");
        car1.setDailyRate(-10.0);

        System.out.println();

        System.out.println("Updated Car 1 Information:");
        car1.displayInfo();

        Car.displayTotalCars();
    }
}

