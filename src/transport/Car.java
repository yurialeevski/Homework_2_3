package transport;

public class Car {
    public static boolean summer = true;
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String gearBox;
    private final String carBodyType;
    private String vehicleRegistrationNumber;
    private final int numberOfCarSeats;
    private boolean tiresWinterFalseSummerTrue;
    private Key key;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String gearBox,
               String carBodyType,
               String vehicleRegistrationNumber,
               int numberOfCarSeats,
               boolean tiresWinterFalseSummerTrue,
               Key key) {
        this.brand = (brand == null || brand.isBlank())? "default": brand;
        this.model = (model == null || model.isBlank())? "default": model;
        this.engineVolume = (engineVolume <=0)? 1.5: engineVolume;
        this.color = (color == null || color.isBlank())? "белый": color;
        this.year = (year <= 0)? 2000: year;
        this.country = (country == null || country.isBlank())? "default": country;
        this.gearBox = (gearBox == null || gearBox.isBlank())? "default": gearBox;
        this.carBodyType = (carBodyType == null || carBodyType.isBlank())? "default": carBodyType;
        this.vehicleRegistrationNumber = (vehicleRegistrationNumber == null || vehicleRegistrationNumber.isBlank())? "default": vehicleRegistrationNumber;
        this.numberOfCarSeats = (numberOfCarSeats <= 0)? 5: numberOfCarSeats;
        this.tiresWinterFalseSummerTrue = tiresWinterFalseSummerTrue;
        this.key = (key == null)? new Key(false, false): key;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", gearBox='" + gearBox + '\'' +
                ", carBodyType='" + carBodyType + '\'' +
                ", vehicleRegistrationNumber='" + vehicleRegistrationNumber + '\'' +
                ", numberOfCarSeats=" + numberOfCarSeats +
                ", tiresWinterFalseSummerTrue=" + tiresWinterFalseSummerTrue +
                ", key=" + key +
                '}';
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <=0)? 1.5: engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color == null || color.isBlank())? "белый": color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = (gearBox == null || gearBox.isBlank())? "default": gearBox;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
        this.vehicleRegistrationNumber = (vehicleRegistrationNumber == null || vehicleRegistrationNumber.isBlank())? "default": vehicleRegistrationNumber;
    }

    public int getNumberOfCarSeats() {
        return numberOfCarSeats;
    }

    public boolean isTiresWinterFalseSummerTrue() {
        return tiresWinterFalseSummerTrue;
    }

    public void setTiresWinterFalseSummerTrue(boolean tiresWinterFalseSummerTrue) {
        this.tiresWinterFalseSummerTrue = tiresWinterFalseSummerTrue;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if(key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public void changeTireToSeason(int monthNumber) {
        if((monthNumber > 10 && monthNumber <= 12) || (monthNumber > 0 && monthNumber < 4)) {
            setTiresWinterFalseSummerTrue(!summer);
        }
    }

    public static class Key {
        private final boolean remoteStartOfEngine;
        private final boolean keyLessAccess;

        public Key(boolean remoteStartOfEngine, boolean keyLessAccess) {
            this.remoteStartOfEngine = remoteStartOfEngine;
            this.keyLessAccess = keyLessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStartOfEngine=" + remoteStartOfEngine +
                    ", keyLessAccess=" + keyLessAccess +
                    '}';
        }

        public boolean isRemoteStartOfEngine() {
            return remoteStartOfEngine;
        }

        public boolean isKeyLessAccess() {
            return keyLessAccess;
        }
    }
}

