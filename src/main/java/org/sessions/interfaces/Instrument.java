package org.sessions.interfaces;

public class Instrument implements CanMakeNoise, CanRunning {

    public String makeNoise(){
        return "make some music";
    }

    public String stopNoise(){
        return "stop some music";
    }

    public String startRunning(){
        return "running";
    }
}
