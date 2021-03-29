package animals;

public abstract class Animals {
    private int run;
    private int jump;
    private int swim;

    protected Animals(int run, int jump, int swim) {
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }

    public Animals() {

    }

    public String run(int dist) {
        String s;
        if (dist >= run) {
            s = "Умеет бегать";
        } else {
            s = "Не умеет бегать";
        }
        return s;
    }

    public String jump(int dist) {
        String s;
        if (dist >= jump) {
            s = "Умеет прыгать";
        } else {
            s = "Не умеет прыгать";
        }
        return s;
    }

    public String swim(int dist) {
        String s;
        if (dist >= swim) {
            s = "Умеет плавать";
        } else {
            s = "Не умеет плавать";
        }
        return s;
    }


    public abstract String getName();
}
