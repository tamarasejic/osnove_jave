package d07_09_2023.Zadatak6ZaVezbanje;

public class DeliveryDetails {
    public int deliveryNo;
    public Driver driver;
    public Vehicle vehicle;
    public Route route;
    public String status;
    public boolean isCanceled;

    public void calculateCurrentStatus(int currentKm) {
        if (!this.isCanceled) {
            if (currentKm == 0) {
                status = "Pending";
            } else if (currentKm > 0 && currentKm < route.length) {
                status = "In progress";
            } else if (currentKm == route.length) {
                status = "Completed";
            }
        } else {
            status = "Canceled";
        }
    }
    public void printDeliveryInfo () {
        System.out.println("DeliveryID: " + this.deliveryNo);
        System.out.println("Driver: " + driver.firstName + " " + driver.lastName);
        System.out.println("Vehicle: " + vehicle.brand + " " + vehicle.model + " (made in " + vehicle.manufacturedYear + ")" + ", regNo: " + vehicle.registrationNo);
        System.out.println("Route No: " + route.routeNo + ", from " + route.startPoint + " to " + route.destination + ", " +  route.length + " km, ETA: " + route.deliveryHoursETA + "h.");
        System.out.println("Delivery status: " + this.status);
    }
}
