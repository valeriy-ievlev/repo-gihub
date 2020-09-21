public class Main {
    public static void main(String[] args) {

        Cat myrka = new Cat();
        Cat milka = new Cat();
        Dog sharik = new Dog();
        Dog palkan = new Dog();


        myrka.run(4000);
        myrka.jump(10);
        myrka.swim(10);

        milka.run(800);

        sharik.run(900);
        sharik.jump(10);
        sharik.swim(9);

        palkan.run(1000);
    }
}
