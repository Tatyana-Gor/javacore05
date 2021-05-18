package lesson1;

public class Human implements JumpAndRun{

    public String name;
    int maxJump;
    int maxRun;

    public Human(String name, int maxJump, int maxRun){
        this.name = "Иван";
        this.maxJump = 1;
        this.maxRun = 100;
    }


    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public void jump() {
        System.out.println(name + " умеет прыгать на " + maxJump + " м в высоту");

    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public void run() {
        System.out.println(name + " может пробежать " + maxJump + " м");



    }
    public String toString() {
        return "Человек " + name;
    }
}
