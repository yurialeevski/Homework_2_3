import transport.Bus;
import transport.Car;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задача 2_1");
        System.out.println("Добавлены новые свойства в класс Car.");
        Car.Key ladaKey = new Car.Key(false, false);
        Car ladaGranta = new Car("Lada", "Lada Granta", 2015, "Россия", "желтый", 150, 1.7, "МКПП", "седан", "а001аа999", 5, Car.summer, ladaKey);
        System.out.println(ladaGranta);
        Car.Key audiKey = new Car.Key(true, true);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 300, 3.0, "АКПП", "седан", "а002аа999", 5,Car.summer, audiKey);
        System.out.println(audiA8);
        Car.Key bmwKey = new Car.Key(true, true);
        Car bmwZ8 = new Car("BMW", "Z8", 2021, "Германия", "черный", 250, 3.0, "АКПП", "родстер", "а003аа999", 2, Car.summer, bmwKey);
        System.out.println(bmwZ8);
        Car.Key kiaKey = new Car.Key(true, false);
        Car kiaSportage = new Car("KIA", "Sportage 4-го поколения", 2018, "Южная Корея", "черный", 180, 2.4, "АКПП", "внедорожник", "а004аа999", 5, Car.summer, kiaKey);
        System.out.println(kiaSportage);
        Car.Key hyundayKey = new Car.Key(false, false);
        Car hyundayAvante = new Car("Hyunday", "Avante", 2016, "Южная Корея", "черный", 180, 1.6, "МКПП", "седан", "а005аа999", 5, !Car.summer, hyundayKey);
        System.out.println(hyundayAvante);
        System.out.println("Смена шин на сезонные");
        ladaGranta.changeTireToSeason(2);
        System.out.println(ladaGranta);
        System.out.println();

        Bus bus_1 = new Bus("Лиаз", "Лиаз1", 2022, "Россия", "зеленый", 150);
        System.out.println(bus_1);
        Bus bus_2 = new Bus("Лиаз", "Лиаз1", 2021, "Россия", "белый", 150);
        System.out.println(bus_2);
        Bus bus_3 = new Bus("Лиаз", "Лиаз1",2020, "Россия","",150);
        System.out.println(bus_3);

    }


}