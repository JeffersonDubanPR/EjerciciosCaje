package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            String[] tipos = {"Agua", "Fuego", "Planta", "Eléctrico"};
            String opcion;

            do {

                String atacante = tipos[random.nextInt(4)];
                String defensor = tipos[random.nextInt(4)];

                int ataque = random.nextInt(100) + 1;
                int defensa = random.nextInt(100) + 1;


                double efectividad = calcularefectividad(atacante, defensor);
                double dano = 50 * ((double) ataque / defensa) * efectividad;


                System.out.println("Atacante: " + atacante + " (Ataque: " + ataque + ")");
                System.out.println("Defensor: " + defensor + " (Defensa: " + defensa + ")");
                System.out.println("Efectividad: " + efectividad);
                System.out.println("Dano causado: " + dano);


                System.out.print("Siguente Batalla (1/2): ");
                opcion = scanner.nextLine().toLowerCase();

            } while (opcion.equals("1"));

            System.out.println("Fin");
            scanner.close();
        }


        public static double calcularefectividad(String atacante, String defensor) {
            return switch (atacante) {
                case "Agua" -> defensor.equals("Fuego") ? 2 : defensor.equals("Planta") ? 0.5 : 1;
                case "Fuego" -> defensor.equals("Planta") ? 2 : defensor.equals("Agua") ? 0.5 : 1;
                case "Planta" -> defensor.equals("Agua") ? 2 : defensor.equals("Fuego") ? 0.5 : 1;
                case "Eléctrico" -> defensor.equals("Agua") ? 2 : defensor.equals("Planta") ? 0.5 : 1;
                default -> 1;
            };
        }
    }









