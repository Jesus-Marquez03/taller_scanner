package com.taller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Gestión de Libros en la Biblioteca ***");
        try (var consola = new Scanner(System.in)) {
            // Nombre del libro
            System.out.print("Ingresa el título del libro: ");
            var tituloLibro = consola.nextLine();

            // Autor del libro
            System.out.print("Ingresa el autor del libro: ");
            var autorLibro = consola.nextLine();

            // Año de publicación
            System.out.print("Ingresa el año de publicación: ");
            var anioPublicacion = Integer.parseInt(consola.nextLine());

            // Género del libro
            System.out.print("Ingresa el género del libro: ");
            var generoLibro = consola.nextLine();

            // Número de páginas
            System.out.print("Ingresa el número de páginas: ");
            var numeroPaginas = Integer.parseInt(consola.nextLine());

            // Mostrar la información del libro
            System.out.println("\n--- Información del Libro ---");
            System.out.println("\tTítulo: " + tituloLibro);
            System.out.println("\tAutor: " + autorLibro);
            System.out.println("\tAño de publicación: " + anioPublicacion);
            System.out.println("\tGénero: " + generoLibro);
            System.out.println("\tNúmero de páginas: " + numeroPaginas);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
