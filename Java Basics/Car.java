class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    
    public void displayCarInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    
    public static void main(String[] args) {
        
        Car myCar = new Car("Toyota", "Corolla", 2025);
        myCar.displayCarInfo();
    }
}
