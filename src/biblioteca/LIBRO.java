/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Alejandro_WEB
 */
public class LIBRO {

    //Introducimos los atributos, todos String
    private String Autor, Titulo, ISBN;

    //A continuación creamos los constructores, primero el por defecto y después el de parámetros
    public LIBRO() {
        Autor = "principito";
        Titulo = "velazquez";
        ISBN = "233443";
    }

    public LIBRO(String Autor, String Titulo, String ISBN) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.ISBN = ISBN;
    }

    //Ahora creamos los métodos get y set de cada atributo
    public void cambiaTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void cambiaAutor(String Autor) {
        this.Autor = Autor;
    }

    public void cambiaISBN(String ISBN) {
        boolean comprobacion = comprobarIsbn();
        if (comprobacion == true) {
            this.ISBN = ISBN;
        } else {
            System.out.println("El ISBN no es correcto");
        }
    }

    public String consultaTitulo() {
        return Titulo;
    }

    public String consultaAutor() {
        return Autor;
    }

    public String consultaISBN() {
        return ISBN;
    }
//creamos el metodo ToString que nos diria toda la informacion del objeto que creemos

    public String ToString() {
        String mensaje = "Datos del libro\n";
        mensaje += " Titulo " + Titulo;
        mensaje += " Autor " + Autor;
        mensaje += " ISBN " + ISBN;
        return mensaje;
    }

    //Metodo de comprobación ISBN
    public boolean comprobarIsbn() {
        boolean comprobacion = false;
        int Sumatotal = 0, resultado;
        String caracter;
        int caracterint, j = 1;
        if (ISBN.length() >= 10) {
            for (int i = 0; i < ISBN.length(); i++) {
                caracter = "" + ISBN.charAt(i);
                j++;

                if (caracter.equals("-")) {
                    caracter = "" + ISBN.charAt(i);
                    i++;
                    j--;
                }
                caracterint = Integer.parseInt(String.valueOf(caracter));
                resultado = caracterint * j;
                Sumatotal = Sumatotal + resultado;
                if (Sumatotal % 11 == 0) {
                    comprobacion = true;
                }

            }
        } else {
            System.out.println("El ISBN Introducido no es correcto");

        }
        return comprobacion;

    }
}
