import animals.Animals;
import animals.Cat;
import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = {new Cat(200, 50, 0), new Cat(200, 50, 0), new Dog(500, 23, 10), new Cat(200, 50, 0)};
        int a = 0;
        int b = 0;
        for (Animals animal : animals) {
            System.out.println(animal.getName()
                    + "\n" + animal.run(501)
                    + "\n" + animal.jump(51)
                    + "\n" + animal.swim(32));
            if (animal.getName().equals("Dog:")) {
                b++;
            } else if (animal.getName().equals("Cat:")) {
                a++;
            }
        }



        System.out.println("Dog: " + b);
        System.out.println("Cat: " + a);

    }
}
