package src.l2;

import java.util.ArrayList;
import java.util.List;

public class Crash {
    public static void main(String[] args) {
        List<byte[]> lista = new ArrayList<>();
        long tempoInizio = System.currentTimeMillis();
        long ramTotaleOccupataMB = 0;
        int ciclo = 0;

        System.out.println("Inizio stress test RAM...");

        try {
            while (true) {
                // Alloca 100 MB a ogni ciclo
                byte[] blocco = new byte[100 * 1024 * 1024];
                lista.add(blocco);

                ciclo++;
                ramTotaleOccupataMB += 100;
                long tempoTrascorsoSec = (System.currentTimeMillis() - tempoInizio) / 1000;

                System.out.println("Ciclo " + ciclo + " | RAM allocata: " + ramTotaleOccupataMB + " MB | Tempo: " + tempoTrascorsoSec + "s");
            }
        } catch (OutOfMemoryError e) {
            long tempoFinaleSec = (System.currentTimeMillis() - tempoInizio) / 1000;
            System.out.println("\nBOOM! CRASH RAGGIUNTO!");
            System.out.println("Sopravvissuto per: " + tempoFinaleSec + " secondi");
            System.out.println("RAM totale occupata prima del crash: " + ramTotaleOccupataMB + " MB (" + (ramTotaleOccupataMB / 1024.0) + " GB)");
        }
    }
}
