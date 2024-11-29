package org.sessions.interfaces;

public class eGitarre extends Instrument {

    @Override
    public String makeNoise(){
        return "some egitarre music";
    }
    @Override
    public String stopNoise(){
        return "stop egitarre music";
    }
}
