package Aplicacion10_12;

import java.util.Scanner; //Entrada del teclado

import static Aplicacion10_12.Metodos.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduce tu edad:");
        String edad = sc.nextLine();

        guardarDatos(nombre,edad);
       

    }
}
