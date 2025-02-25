package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 50000;
        int opcion;


        do {
            System.out.println("\n--- Cajero Automático ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Saldo actual: $" + saldo);
                case 2 -> {
                    System.out.print("Ingrese el monto: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Monto inválido.");
                    }
                }
                case 3 -> {
                    System.out.print("Monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Con fondos ");
                    }
                }
                case 4 -> System.out.println("Gracias");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }

}
