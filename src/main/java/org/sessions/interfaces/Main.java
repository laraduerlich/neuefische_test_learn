package org.sessions.interfaces;


public class Main {
    public static void main(String[] args) {

        Instrument violin = new Violin();
        Instrument eGitarre = new eGitarre();
        Screwdriver screwdriver = new Screwdriver();

        recordNoise(violin);
        recordNoise(eGitarre);
        recordNoise(screwdriver);

    }
    public static void recordNoise(CanMakeNoise device) {
        System.out.println("Start recording ...");
        System.out.println("Recording: " + device.makeNoise());
        System.out.println(device.stopNoise());
        System.out.println("Stop recording ...");
    }
}
