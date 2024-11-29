package org.sessions.interfaces;

public class Screwdriver implements CanMakeNoise {

    public String makeNoise() {
        return "some screwdriver noise";
    }

    public String stopNoise() {
        return "stop screwdriver noise";
    }

}
