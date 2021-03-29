package animals;

public class Dog extends Animals {
    public Dog(int run, int jump, int swim) {
        super(run, jump, swim);
    }

    public String getName() {
        return "Dog:";
    }
}
