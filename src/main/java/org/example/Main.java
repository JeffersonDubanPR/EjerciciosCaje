package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        double saldo = 50000;
        int opcion;


        do {
            System.out.println("\n--- Cajero Automático ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner. nextInt();

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
    } */

            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\n--- Convertidor de Temperatura ---");
                System.out.println("1. Fahrenheit a Celsius");
                System.out.println("2. Celsius a Fahrenheit");
                System.out.println("3. Kelvin a Celsius");
                System.out.println("4. Celsius a Kelvin");
                System.out.println("5. Kelvin a Fahrenheit");
                System.out.println("6. Fahrenheit a Kelvin");
                System.out.println("7. Celsius a Réaumur");
                System.out.println("8. Réaumur a Celsius");
                System.out.println("9. Fahrenheit a Réaumur");
                System.out.println("10. Réaumur a Fahrenheit");
                System.out.println("11. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();

                if (opcion >= 1 && opcion <= 10) {
                    System.out.print("Ingresar  temperatura: ");
                    double temp = scanner.nextDouble();
                    double resultado = 0;

                    resultado = switch (opcion) {
                        case 1 -> (5 * (temp - 32)) / 9;
                        case 2 -> (9 * temp) / 5 + 32;
                        case 3 -> temp - 273.15;
                        case 4 -> temp + 273.15;
                        case 5 -> (9 * (temp - 273.15)) / 5 + 32;
                        case 6 -> (5 * (temp - 32)) / 9 + 273.15;
                        case 7 -> (4 * temp) / 5;
                        case 8 -> (5 * temp) / 4;
                        case 9 -> (4 * (temp - 32)) / 9;
                        case 10 -> (9 * temp) / 4 + 32;
                        default -> 0;
                    };

                    System.out.println("Resultado: " + resultado);
                } else if (opcion == 11) {
                    System.out.println("Gracias por usar el convertidor");
                } else {
                    System.out.println("Opción no válida.");
                }

            } while (opcion != 11);

            scanner.close();
        }
    }

