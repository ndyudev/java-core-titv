package JavaCore.OOP.Video38;

public class Computer {
    private Date dateProduction;
    private Double price;
    private Manufacturer manufacturer;
    private String timeGuarantee;

    public Computer() {}

    public Computer(Date dateProduction, Double price, Manufacturer manufacturer, String timeGuarantee) {
        this.dateProduction = dateProduction;
        this.price = price;
        this.manufacturer = manufacturer;
        this.timeGuarantee = timeGuarantee;
    }
}
