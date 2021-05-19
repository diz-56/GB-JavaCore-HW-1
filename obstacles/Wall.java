package kek.obstacles;

import kek.interfaces.Participant;

public class Wall implements Obstacle {
    private int height;
    public Wall(int height){
        this.height = height;
    }


    @Override
    public boolean check(Participant p) {
        return p.jump() > height;
    }
}
