package lesson1;

public class Treadmill implements Tasks{

    String name;
    int distance;

    public Treadmill(int distance){
        this.name = "Беговая дорожка";
        this.distance = 100;
    }

    @Override
    public boolean toJump(int maxJump) {
        return false;
    }

    @Override
    public boolean toRun(int maxRun) {
        return (maxRun >= distance);
    }

    public String toString() {
        return "Беговая дорожка длиной " + distance + " м";
    }
}
