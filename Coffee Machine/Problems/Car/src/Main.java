class Car {

    int yearModel;
    String make;
    int speed;

    public void Car(int yearModel, String make, int speed) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = speed;
    }

    public void accelerate() {
        speed = speed + 5;
    }
    public void brake() {
        if( speed != 0) {
            speed = speed - 5;
        }
    }
}