package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxDriveSpeed;

    public Transport(String brand,
               String model,
               int year,
               String country,
               String color,
               int maxDriveSpeed) {
        this.brand = (brand == null || brand.isBlank())? "default": brand;
        this.model = (model == null || model.isBlank())? "default": model;
        this.year = (year <= 0)? 2000: year;
        this.country = (country == null || country.isBlank())? "default": country;
        this.color = (color == null || color.isBlank())? "белый": color;
        this.maxDriveSpeed = (maxDriveSpeed <=0)? 150: maxDriveSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxDriveSpeed=" + maxDriveSpeed +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color == null || color.isBlank())? "белый": color;
    }
    public int getMaxDriveSpeed() {
        return maxDriveSpeed;
    }
    public void setMaxDriveSpeed(int maxDriveSpeed) {
        this.maxDriveSpeed = (maxDriveSpeed <=0)? 150: maxDriveSpeed;
    }
}
