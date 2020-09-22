package Lesson_7;

public class Lesson7 {
    public static void main(String[] args) {

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Мурка", 5);
        cats[1] = new Cat("Симка", 5);
        cats[2] = new Cat("Таська", 5);
        cats[3] = new Cat("Васса", 5);

        Plate[] plates = new Plate[4];
        plates[0] = new Plate(1,8);
        plates[1] = new Plate(2,6);
        plates[2] = new Plate(3,3);
        plates[3] = new Plate(4,2);

// Кормим котов

        catsDinner(cats, plates);
        addDinnerToPlates(plates, 2);
        catsDinner(cats, plates);
        hungryCats(cats);
        foodInPlates(plates);
    }

    private static void catsDinner(Cat[] cats, Plate[] plates) {
        for (Plate plate : plates) {
            plate.info();
            for (Cat cat : cats) {
                if (cat.isSatiety() == false)
                    cat.eat(plate);
            }
        }
    }

    private static void addDinnerToPlates(Plate[] plates, int foodCount) {
        for (Plate plate : plates) {
            plate.addFood(foodCount);
        }
    }

    private static void foodInPlates(Plate[] plates) {
        for (Plate plate : plates) {
            plate.info();
        }
    }

    private static void hungryCats(Cat[] cats) {
        for (Cat cat : cats) {
            if (cat.isSatiety() == false) {
                System.out.println("Кот " + cat.name + " осталcя голодным голодным");
            }
            else System.out.println("Кот " + cat.name + " сытый");
        }
    }
}
