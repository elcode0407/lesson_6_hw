package animals;

public class Cat extends Animals{
    public Cat(int run, int jump, int swim){
        super(run,jump,swim);
    }

    @Override
    public String swim(int dist) {
        return "Не умеет плавать";
    }
    public String getName(){
        return "Cat:";
    }


}
