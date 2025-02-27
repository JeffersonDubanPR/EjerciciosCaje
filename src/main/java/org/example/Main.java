package org.example;

import java.util.Random;
public class Main {


        public static void main(String[] args) {
            Random random = new Random();

            String[] opciones = {"Piedra", "Papel", "Tijera"};
            int puntos1 = 0;
            int puntos2 = 0;

            System.out.println("Comienza el juego");

            do {
                int eleccion1 = random.nextInt(3);
                int eleccion2 = random.nextInt(3);

                String jugada1 = opciones[eleccion1];
                String jugada2 = opciones[eleccion2];

                System.out.println(" Jugador 1 : " + jugada1);
                System.out.println(" Jugador 2 : " + jugada2);

                if (jugada1.equals(jugada2)) {
                    System.out.println("Empate.");
                } else if ((jugada1.equals("Piedra") && jugada2.equals("Tijera")) ||
                        (jugada1.equals("Papel") && jugada2.equals("Piedra")) ||
                        (jugada1.equals("Tijera") && jugada2.equals("Papel"))) {
                    System.out.println("Jugador 1 gana");
                    puntos1++;
                } else {
                    System.out.println("jugador 2  gana.");
                    puntos2++;
                }

                System.out.println("Marcador Jugador 1 : " + puntos1);
                System.out.println("Marcador Jugador 2 : " + puntos2);

            } while (puntos1 < 2 && puntos2 < 2);

            System.out.println("\n" + (puntos1 == 2 ? "Jugador 1 ganaste" : "Jugador 2 ganaste "));
        }
    }









