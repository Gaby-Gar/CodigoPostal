/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigopostal;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class CodigoPostal {

    Scanner principal = new Scanner(System.in);
    static String cp;

    public void Informacion() {
        System.out.println("Introduce un codigo postal del 1 al 10");
        cp = principal.nextLine();

        switch (cp.charAt(0)) {
            case '0':
                System.out.println(cp + "\tEsta muy cerca del mar");
                break;
            case '2':
                System.out.println(cp + "\tEsta en las afueras del Este");
                break;
            case '3':
                System.out.println(cp + "\tEsta en costa Este");
                break;
            case '4':
                System.out.println(cp + "\tEsta en centro del mapa");
                break;
            case '5':
                System.out.println(cp + "\tEsta en las puertas del mapa");
                break;
            case '6':
                System.out.println(cp + "\tEsta en el area del plano central");
                break;
            case '7':
                System.out.println(cp + "\tEsta en el sur");
                break;
            case '8':
                System.out.println(cp + "\tEsta en direccion Oeste");
                break;
            case '9':
                System.out.println(cp + "\tEsta en el Oeste");
                break;
            default:
                System.out.println(cp + "\tCODIGO INVALIDO");
        }
    }

    public static void main(String[] args) {
        CodigoPostal mostrar = new CodigoPostal();
        mostrar.Informacion();
    }
}
