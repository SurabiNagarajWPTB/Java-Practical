package Act_2;

public class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }

    public void printDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: $" + this.price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Apple", "iPhone 13", 999.99);
        System.out.println("Phone Details:");
        phone.printDetails();
        phone.setBrand("Samsung");
        phone.setModel("Galaxy S21");
        phone.setPrice(899.99);
        System.out.println("\nUpdated Phone Details:");
        phone.printDetails();
    }
}

