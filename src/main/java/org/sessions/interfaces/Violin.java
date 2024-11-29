package org.sessions.interfaces;

public class Violin extends Instrument {

    @Override
    public String makeNoise(){
        return "some violin music";
    }
    @Override
    public String stopNoise(){
        return "stop violin music";
    }
}
