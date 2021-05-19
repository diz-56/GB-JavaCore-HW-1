package kek.runners;

import kek.interfaces.Participant;

public class Human implements Participant {

    @Override
    public int jump() {
        return 2;
    }

    @Override
    public int run() {
        return 1500;
    }

}
