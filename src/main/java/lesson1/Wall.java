package lesson1;

public class Wall implements Tasks{

    String name;
    int height;

    public Wall(int height) {
        this.height = 1;
        this.name = "Стена ";

    }


    @Override
    public boolean toJump(int maxJump) {
        return (maxJump >= height);
    }

    @Override
    public boolean toRun(int maxRun) {
        return false;
    }
    public String toString() {
        return "Стена высотой " + height + " м";
    }
}
