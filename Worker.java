package Lesson5HomeWork;

public class Worker {
    public String name;
    public String position;
    public String email;
    public int telNumber;
    public int slary;
    public int age;

    public Worker(String name, String position, String email, int telNumber, int slary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telNumber = telNumber;
        this.slary = slary;
        this.age = age;
    }

    public static void main(String[] args) {
        Worker[] workersArray = new Worker[5];
        workersArray[0] = new Worker("Vladimir Ivanov", "counter", "VI@firma.pro", 1123, 19500, 24);
        workersArray[1] = new Worker("Elena Smirnova", "Head manager", "ES@firma.pro", 1100, 59500, 39);
        workersArray[2] = new Worker("Igor Potapin", "driver", "IP@firma.pro", 1745, 26300, 51);
        workersArray[3] = new Worker("Sepgey Kolesnikov", "driver", "SK@firma.pro", 1746, 26300, 47);
        workersArray[4] = new Worker("Fedir Manyshkin", "administrator", "FM@firma.pro", 1410, 35000, 41);

        for (int i = 0; i < workersArray.length; i++) {
            if (workersArray[i].age > 40)
                workersArray[i].printInfo();
        }
    }

    public void printInfo() {
         System.out.println("Name - " + this.name + " position - " + this.position + " email - " + this.email + " telNumber " +
                 this.telNumber + " slary - " + this.telNumber + " age - " + this.age);
    }
}
