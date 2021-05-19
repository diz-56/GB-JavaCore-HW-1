package kek.runners;

import kek.interfaces.Participant;

public class Cat implements Participant {
    @Override
    public int jump() {
        return 5;
    }

    @Override
    public int run() {
        return 3000;
    }

}
