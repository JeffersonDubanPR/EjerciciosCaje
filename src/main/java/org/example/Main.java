package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion, total = 0, dinero, cambio, productosComprados = 0;

                do {
                    System.out.println("\n--- Máquina De Alimentos ---");
                    System.out.println("1. Mani - $2000");
                    System.out.println("2. Galletas - $1500");
                    System.out.println("3. Chocolate - $2500");
                    System.out.println("4. Jugo Hit  - $3000");
                    System.out.println("5. Coca-Cola - $3500");
                    System.out.println("6. Pagar y salir");
                    System.out.print("Seleccione un producto: ");
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1 -> total += 2000;
                        case 2 -> total += 1500;
                        case 3 -> total += 2500;
                        case 4 -> total += 3000;
                        case 5 -> total += 3500;
                        case 6 -> System.out.println("Total a pagar: $" + total);
                        default -> System.out.println("Opción inválida.");
                    }

                    if (opcion >= 1 && opcion <= 5) {
                        productosComprados++;
                    }

                } while (opcion != 6 && productosComprados < 5);

                if (total > 0) {
                    System.out.print("Ingrese su dinero: ");
                    dinero = scanner.nextInt();

                    if (dinero < total) {
                        System.out.println("Dinero insuficiente. Compra cancelada.");
                    } else {
                        cambio = dinero - total;
                        System.out.println("Compra realizada. Su cambio es: $" + cambio);
                    }
                }

                System.out.println("Gracias por su compra.");
                scanner.close();
            }
        }








