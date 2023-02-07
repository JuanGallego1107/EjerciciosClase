package Enunciado1;

import java.util.Scanner;

public class MainEnunciado1 {
    public static void main(String[] args) {
        Enunciado1 enunciado1 = new Enunciado1();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese su  nombre.");
        enunciado1.setName(lector.nextLine());

        System.out.println("Ingrese su apellido.");
        enunciado1.setLastname(lector.nextLine());

        System.out.println("Ingrese la cantidad de años que lleva en la empresa.");
        enunciado1.setAntiguedad(lector.nextInt());

        enunciado1.setBasicSalary(100000);

        System.out.println("Sus datos personales: \n "+ enunciado1.mostrarMensaje());

        System.out.println("El valor de prestaciones es: "+enunciado1.prestaciones());

    }
}
