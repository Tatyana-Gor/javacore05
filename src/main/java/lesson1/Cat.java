package lesson1;

public class Cat implements JumpAndRun {
    String name;
    int maxJump;
    int maxRun;

    public Cat(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;

    }




    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public void jump() {
        System.out.println("Кот " + name + " умеет прыгать на " + maxJump + " м в высоту");

    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public void run() {
        System.out.println("Кот " + name + " может пробежать " + maxRun + " м");

    }

    public String toString() {
        return "Кот " + name;
    }
}
