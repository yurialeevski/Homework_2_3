import transport.Car;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задача 2_1");
        System.out.println("Добавлены новые свойства в класс Car.");
        Car.Key ladaKey = new Car.Key(false, false);
        Car ladaGranta = new Car("Lada", "Lada Granta", 1.7, "желтый", 2015, "Россия", "МКПП", "седан", "а001аа999",5,Car.summer, ladaKey);
        System.out.println(ladaGranta);
        Car.Key audiKey = new Car.Key(true, true);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "АКПП", "седан", "а002аа999", 5, !Car.summer, audiKey);
        System.out.println(audiA8);
        Car.Key bmwKey = new Car.Key(true, true);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "АКПП", "родстер", "а003аа999", 2, false, bmwKey);
        System.out.println(bmwZ8);
        Car.Key kiaKey = new Car.Key(true, false);
        Car kiaSportage = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "АКПП", "внедорожник", "а004аа999", 5, false, kiaKey);
        System.out.println(kiaSportage);
        Car.Key hyundayKey = new Car.Key(false, false);
        Car hyundayAvante = new Car("Hyunday", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "МКПП", "седан", "а005аа999", 5, true, hyundayKey);
        System.out.println(hyundayAvante);
        System.out.println("Смена шин на сезонные");
        ladaGranta.changeTireToSeason(2);
        System.out.println(ladaGranta);
        System.out.println();

    }


}