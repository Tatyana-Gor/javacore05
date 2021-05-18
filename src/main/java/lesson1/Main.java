package lesson1;


public class Main {
    public static void main(String[] args) {

        JumpAndRun[] participants = {
                new Cat("Мурзик", 2, 10),
                new Human("Иван", 1, 100),
                new Robot("Железяка", 5, 50)

        };

        Tasks[] task = {
                new Treadmill(100),
                new Wall(1)
        };

        for (JumpAndRun participant : participants) {
            System.out.println("На дорожку выходит " + participant);
            boolean winner = true;
            for (Tasks tasks : task){
                System.out.println(participant + " подходит к " + tasks);
                if (tasks.toJump(participant.getMaxJump()) || tasks.toRun(participant.getMaxRun())) {
                    System.out.println(participant + " проходит препятствие");
                } else {
                    winner = false;
                    System.out.println(participant + " не проходит препятствие");
                    break;
                }
            }
            if(winner) {
                System.out.println(participant + " прошёл дистанцию!");
            } else {
                System.out.println(participant + " проиграл.");
            }
            System.out.println();
        }


        }



        }


