package lesson1;

public class Robot implements JumpAndRun{

    public String name;
    int maxJump;
    int maxRun;

    public Robot(String name, int maxJump, int maxRun){
        this.name = "Железяка";
        this.maxJump = 5;  //робот-прыгун ))
        this.maxRun = 50;
    }


    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public void jump() {
        System.out.println("Робот " + name + " умеет прыгать на " + maxJump + " м в высоту");

    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public void run() {
        System.out.println("Робот " + name + " может пробежать " + maxRun + " м");

    }
    public String toString() {
        return "Робот " + name;
    }
}
