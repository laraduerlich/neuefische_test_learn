package org.task.interfaces;

public class Main {
    public static void main(String[] args) {
        Playable musicplayer = new MusicPlayer();
        Playable videoplayer = new VideoPlayer();

        MediaController mediaController = new MediaController();

        mediaController.playMedia(musicplayer);
        mediaController.playMedia(videoplayer);
    }


}
