package kek;

import kek.interfaces.Participant;
import kek.obstacles.Dorogka;
import kek.obstacles.Obstacle;
import kek.obstacles.Wall;
import kek.runners.Cat;
import kek.runners.Human;
import kek.runners.Robot;

public class App {
    public static void main(String[] args) {
        Obstacle[] obstacles = new Obstacle[]{new Wall(3), new Dorogka(4500)};
        Participant[] participants = new Participant[]{new Human(), new Robot(), new Cat()};

        for (Obstacle o : obstacles) {
            for (Participant p : participants) {
                System.out.println(o.getClass() + "|" + p.getClass() + " " + o.check(p));
            }
        }
    }
}
