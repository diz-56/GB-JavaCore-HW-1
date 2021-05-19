package kek.runners;

import kek.interfaces.Participant;

public class Robot implements Participant {
    @Override
    public int jump() {
        return 4;
    }

    @Override
    public int run() {
        return 5000;
    }

}
