package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");

        // Mando rojo
        System.out.println("Mando Rojo");
        System.out.println(redRemote.turnOn());
        redRemote.channelUp();
        System.out.println(redRemote.channel);
        redRemote.channelDown();
        System.out.println(redRemote.channel);
        redRemote.channelDown();
        System.out.println(redRemote.channel);
        redRemote.volumeUp();
        System.out.println(redRemote.volume);
        redRemote.volumeDown();
        System.out.println(redRemote.volume);
        redRemote.volumeDown();
        System.out.println(redRemote.volume);
        System.out.println(redRemote.getColor());
        System.out.println(redRemote.turnOff());

        // Mando negro
        System.out.println("\nMando Negro");
        System.out.println(blackRemote.turnOn());
        blackRemote.channelUp();
        System.out.println(blackRemote.channel);
        blackRemote.channelUp();
        System.out.println(blackRemote.channel);
        blackRemote.channelDown();
        System.out.println(blackRemote.channel);
        blackRemote.volumeUp();
        System.out.println(blackRemote.volume);
        blackRemote.volumeUp();
        System.out.println(blackRemote.volume);
        blackRemote.volumeDown();
        System.out.println(blackRemote.volume);
        System.out.println(blackRemote.getColor());
        System.out.println(blackRemote.turnOff());

    }

}