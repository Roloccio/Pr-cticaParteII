/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Scanner;

/**
 *
 * @author Alejandro_WEB
 */
public class Biblioteca {

    LIBRO spiderman = new LIBRO();
    //creamos el objeto spiderman para instanciar la clase

    public static void main(String[] args) {
        
        Biblioteca instancia = new Biblioteca();
        int opcion = -1;
        while (opcion != 0) {
            opcion = menu();
            switch (opcion) {
                case 1:
                    instancia.menuset();
                    break;
                case 2:
                    instancia.menuget();
                    break;
            }
        }
    }
    //con esto controlamos el cambio de menus

    static Scanner teclado = new Scanner(System.in);

    public static int menu() {
        int opcion = -1;
        while (opcion < 0 || opcion > 2) {
            System.out.println("menu de opciones ");
            System.out.println("---------------");
            System.out.println("1 - Introducir datos del libro");
            System.out.println("2 - Consultar Datos del libro");
            System.out.println("0 - Salir");
            System.out.println("---------------");
            System.out.println("Que desea hacer? ");
            try {
                opcion = Integer.parseInt(teclado.next());
            } catch (NumberFormatException nfe) {
                System.out.println("ERROR AL INTRODUCIR UNA OPCION, INTRODUZCA 1,2 o 0 PARA SALIR ");
            }
        }
        return opcion;
    }
    //este es el menu principal que se abre nada mas ejecutar el programa, nos redirige al menu de los getters o al de los setters

    public void menuset() {
        int opcion;
        String titulo, autor, isbn;
        System.out.println("Introducir datos ");
        System.out.println("---------------");
        System.out.println("1 - Introducir titulo del libro");
        System.out.println("2 - Introducir autor del libro");
        System.out.println("3 - Introducir ISBN del libro");
        System.out.println("4 - Introducir todos los datos del libro");
        System.out.println("0 - Salir");
        System.out.println("---------------");
        System.out.println("Que desea hacer? ");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Introducir titulo del libro: ");
                titulo = teclado.next();
                spiderman.cambiaTitulo(titulo);
                break;
            case 2:
                System.out.println("Introduce el autor del libro: ");
                autor = teclado.next();
                spiderman.cambiaAutor(autor);
                break;
            case 3:
                System.out.println("Introduce el ISBN: ");
                isbn = teclado.next();
                spiderman.cambiaISBN(isbn);
                break;
            case 4:
                System.out.println("Introducir todos los datos: ");
                System.out.println("Primero el titulo: ");
                titulo = teclado.next();
                spiderman.cambiaTitulo(titulo);
                System.out.println("Ahora el autor: ");
                autor = teclado.next();
                spiderman.cambiaAutor(autor);
                System.out.println("Y por ultimo el ISBN: ");
                isbn = teclado.next();
                spiderman.cambiaISBN(isbn);
                break;
            case 0:

                break;
        }
    }
//Este era el menu de los setters, en el esta el set del isbn donde se encuentra el metodo de comprobar el mismo
    public void menuget() {
        int opcion;
        System.out.println("Consultar datos ");
        System.out.println("---------------");
        System.out.println("1 - Mostrar ISBN del libro");
        System.out.println("2 - Mostrar Titulo dle libro");
        System.out.println("3 - Mostrar Autor del libro");
        System.out.println("4 - Mostrar todos los datos del libro");
        System.out.println("0 - Salir");
        System.out.println("---------------");
        System.out.println("Que desea hacer? ");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("EL ISBN del libro es: " + spiderman.consultaISBN());
                break;
            case 2:
                System.out.println("El Titulo del libro es: " + spiderman.consultaTitulo());
                break;
            case 3:
                System.out.println("El Autor del libro es: " + spiderman.consultaAutor());
                break;
            case 4:
                System.out.println("El Titulo es " + spiderman.consultaTitulo() + " El autor es " + spiderman.consultaAutor() + " El ISBN es " + spiderman.consultaISBN());
                break;
            case 0:
                System.out.println("Hasta la proxima");
                break;

        }
    }
// y por ultimo el menu de los getters
}
