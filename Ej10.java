
package ej10;
import java.util.Scanner;
public class Ej10 {
    /*Programa que pida una hora (numero entero)
    y muestre las opciones de conversión a de su total en minutos, segundos y milisegundos.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hora,minutos,segundos,milisegundos,op;
        System.out.println("Escriba las horas");
        hora=sc.nextInt();
        System.out.println("Escriba la opción \n1: Convertir a minutos\n2: Convertir a segundos\n3: Convetir a milisegundos");
        op=sc.nextInt();
        switch(op){
            case 1:
                minutos=hora*60;
                System.out.println(hora+" horas equivale a "+minutos+" minutos");
            break;
            case 2:
                segundos=hora*3600;
                System.out.println(hora+" horas equivale a "+segundos+" segundos");
            break;
            case 3:
                milisegundos=hora*3600000;
                System.out.println(hora+ " horas equivale a "+milisegundos+" milisegundos");
            break;
            default:
                System.out.println("Opción inválida");
            break;
        }
    }
    
}
