package kek.obstacles;

import kek.interfaces.Participant;

public class Dorogka implements Obstacle {

    private int length;
    public Dorogka(int length){
        this.length = length;
    }

    @Override
    public boolean check(Participant p) {
        return p.run() > length;
    }
}
