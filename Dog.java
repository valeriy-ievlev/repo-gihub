import java.util.Random;

public class Dog extends Animal{

    Random r = new Random();
    private int maxRun = r.nextInt(100) + 500;
    private float maxJump = 0.5f;
    private int maxSwim = 10;

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
        if (length <= maxSwim)
            System.out.println("Swim: true");
        else System.out.println("Swim: false, max Swim is " + maxSwim);
    }
}
