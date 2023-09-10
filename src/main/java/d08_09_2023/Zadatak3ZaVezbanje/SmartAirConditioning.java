package d08_09_2023.Zadatak3ZaVezbanje;

public class SmartAirConditioning {
    public String brand;
    public int coolingElectricityConsumption;
    public int heatingElectricityConsumption;
    public int temperature;
    public String mode;


    public void printInfo() {
        System.out.println(this.brand + " - " + this.mode + " - " + this.temperature + "°C.");
    }

    public double monthlyElectricityConsumption () {
        if (this.mode.equals("cooling")) {
           return  30 * 15 * this.coolingElectricityConsumption;
        } else if (this.mode.equals("heating")){
            return  30 * 15 * this.heatingElectricityConsumption;
        }
        return 0;
    }

    public double calculateMonthlyCost () {
        double monthlyCost = 0;
        double monthlyEConsumption = this.monthlyElectricityConsumption();
        if (monthlyEConsumption <= 350) {
            monthlyCost = monthlyEConsumption * 6;
        } else {
            monthlyCost = 350 * 6 + (monthlyEConsumption - 350) * 9;
        }
        return monthlyCost;
    }

}
