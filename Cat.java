package Lesson_7;

public class Cat {
    protected final String name;
    private int maxAppetite;
    private int realAappetite;
    private boolean satiety = false;

    public Cat(String name, int maxAppetite) {
        this.name = name;
        this.maxAppetite = maxAppetite;
        realAappetite = maxAppetite;
    }

    public String getName() {
        return name;
    }

    public int getMaxAppetite() {
        return maxAppetite;
    }

    public void setRealAappetite(int realAappetite) {
        this.realAappetite = realAappetite;
    }

    public int getRealAappetite() {
        return realAappetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
            System.out.println("Кот " + name + " ест ");
            if (plate.getFood() >= realAappetite) {
                satiety = true;
                doEat(plate);
                System.out.println("Кот " + name + " поел");
                System.out.println();
            } else {
                satiety = false;
                doEat(plate);
                setRealAappetite(maxAppetite - plate.getFood());
                System.out.println("Коту " + name + " не хватило еды!");
                System.out.println();
            }
        }


    private void doEat(Plate plate) {
        if (plate.getFood() >= realAappetite)
        plate.decreaseFood(realAappetite);
        else plate.decreaseFood(plate.getFood());
    }
}
