package org.example;

import java.net.*;
import java.io.*;

public class MulticastServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket();
        InetAddress group = InetAddress.getByName("230.0.0.0");
        byte[] buf;

        String[] words = {"Wedu estafador",
                "Sergi = Saul 3.0",
                "Arnau deja de apuñalar al kevin",
                "PSOE",
                "Ibai Masón",
                "Perro Sanche",
                "Eric el ojeador de hermanas",
                "Curseforge sirve para opencsv"};

        while (true) {
            String word = words[(int) (Math.random() * words.length)];
            buf = word.getBytes();
            DatagramPacket packet = new DatagramPacket(buf, buf.length, group, 4446);
            serverSocket.send(packet);
            System.out.println("Digo: " + word);
            Thread.sleep(1000);
        }
    }
}


