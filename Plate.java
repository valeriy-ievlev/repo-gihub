package Lesson_7;

public class Plate{
    private int food;
    private int number;

    public Plate(int number, int food) {
        this.food = food;
        this.number = number;
    }

    public Plate() {
    }

    public int getFood() {
        return food;
    }

    public void addFood(int foodCount) {
        this.food += foodCount;
    }

    public void decreaseFood(int foodCount) {
        if (this.food >= foodCount)
        this.food -= foodCount;
    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "number " + number +
                " food=" + food +
                '}';
    }
}
