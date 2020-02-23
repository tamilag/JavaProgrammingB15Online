package day59;

import java.io.IOException;

public class DangerZone {
    public static void main(String[] args) { //throws IOException {

        try {
            playWithFire();
        } catch (IOException e) {
            System.out.println("go here if you get burn");
        }

    }
    //this is a method that declare "it might throw a checked exception IOexception
    public static void playWithFire () throws IOException {
        System.out.println("some consequences might happen");
    }
}
