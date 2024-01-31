package org.example;

import java.net.*;

public class MulticastClient {
    public static void main(String[] args) throws Exception {
        MulticastSocket clientSocket = new MulticastSocket(4446);
        InetAddress group = InetAddress.getByName("230.0.0.0");
        clientSocket.joinGroup(group);
        int arraySlot0 = 0;
        int arraySlot1 = 0;
        int arraySlot2 = 0;
        int arraySlot3 = 0;
        int arraySlot4 = 0;
        int arraySlot5 = 0;
        int arraySlot6 = 0;
        int arraySlot7 = 0;

        byte[] buf = new byte[256];
        while (true) {
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            clientSocket.receive(packet);
            String received = new String(packet.getData(), 0, packet.getLength());
            switch (received){
                case "Wedu estafador": arraySlot0++; break;
                case "Sergi = Saul 3.0": arraySlot1++; break;
                case "Arnau deja de apuñalar al kevin": arraySlot2++; break;
                case "PSOE": arraySlot3++; break;
                case "Ibai Masón": arraySlot4++; break;
                case "Perro Sanche": arraySlot5++; break;
                case "Eric el ojeador de hermanas": arraySlot6++; break;
                case "Curseforge sirve para opencsv": arraySlot7++; break;
            }
            switch (received){
                case "Wedu estafador": System.out.println("El server dice: "+received+ " "+arraySlot0+ " veces"); break;
                case "Sergi = Saul 3.0": System.out.println("El server dice: "+received+ " "+arraySlot1+ " veces"); break;
                case "Arnau deja de apuñalar al kevin": System.out.println("El server dice: "+received+ " "+arraySlot2+ " veces"); break;
                case "PSOE": System.out.println("El server dice: "+received+ " "+arraySlot3+ " veces"); break;
                case "Ibai Masón": System.out.println("El server dice: "+received+ " "+arraySlot4+ " veces"); break;
                case "Perro Sanche": System.out.println("El server dice: "+received+ " "+arraySlot5+ " veces"); break;
                case "Eric el ojeador de hermanas": System.out.println("El server dice: "+received+ " "+arraySlot6+ " veces"); break;
                case "Curseforge sirve para opencsv": System.out.println("El server dice: "+received+ " "+arraySlot7+ " veces"); break;
            }


        }
    }
}
