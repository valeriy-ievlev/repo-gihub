import java.util.Random;

public class Cat extends Animal {

    Random r = new Random();
    private int maxRun = r.nextInt(100) + 100;
    private float maxJump = 2.0f;

    @Override
    public void jump(int high) {
        if (high <= maxJump)
            System.out.println("jump: true");
        else System.out.println("jump: false, max jump is " + maxJump);
    }

    @Override
    public void run(int length) {
        if (length <= maxRun)
            System.out.println("run: true");
        else System.out.println("run: false, max Run is " + maxRun);
    }

    @Override
    public void swim(int length) {
        System.out.println("swim: false, cat can't swim");
    }
}