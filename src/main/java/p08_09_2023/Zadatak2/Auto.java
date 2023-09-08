package p08_09_2023.Zadatak2;

public class Auto {
    public String driver;
    public String brand;
    public int doors;
    public double fuelConsumptionAt100Km;
    public int currentSpeed;
    public int year;
    public int registrationMonth;
    public int fuelVolume;
    public String registrationNo;
    public boolean isACOn;
    public int maxSpeed;


    public void printAutoInfo () {
        System.out.println(this.driver);
        System.out.println(this.brand + " - " + this.doors + " doors");
        System.out.println("Fuel consumption is " + this.fuelConsumptionAt100Km + "l at 100km");
        System.out.println(this.currentSpeed + "km/h is the current speed.");

    }

    public Boolean isOverSpeedLimit (int speedLimit) {
//        if (this.currentSpeed > speedLimit) {
//            return true;
//        }
//        return false;
        return this.currentSpeed > speedLimit;
    }

    public int speedingTicket  (int speedLimit) {
        int ticket = 0;
        if (this.isOverSpeedLimit(speedLimit)) {
            ticket = this.currentSpeed - speedLimit;
            return ticket * 1000;
        } else {
            return ticket;
        }
    }

    public boolean isOldTimer() {
        return this.year < 1950;
    }

    public boolean isRegistered (int currentMonth) {
        return this.registrationMonth < currentMonth;
    }

    public double registrationPrice (int fuelVolume) {
        if (this.fuelVolume <= 2000) {
            return this.fuelVolume * 100;
        } else {
            return (this.fuelVolume * 100) * 1.3;
        }
    }

    public void dodajGas () {
        this.currentSpeed = this.currentSpeed + 10;
        if (currentSpeed > this.maxSpeed) {
            currentSpeed = this.maxSpeed;
        }
    }

    public void koci () {
        this.currentSpeed = this.currentSpeed - 10;
        if (this.currentSpeed < 0) {
            this.currentSpeed = 0;
        }
    }

    public double calculateACFactor () {
        double factorAC = 1.0;
        if (this.isACOn) {
            factorAC = 1.2;
        }
        return factorAC;
    }
    public double carConsumption () {
        return (this.currentSpeed / 100.0 * this.fuelConsumptionAt100Km) * this.calculateACFactor();
    }

    public void stampajTablu () {
        int dashes = this.currentSpeed * 100 / this.maxSpeed;
        for (int i = 0; i < 100; i++) {
            if (i < dashes) {
                System.out.print("|");
            } else {
                System.out.print(".");
            }
        }
        System.out.println(this.currentSpeed + " / " + this.maxSpeed + " km/h");

    }


}
