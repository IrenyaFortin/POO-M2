/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop1.t1m2.irenyafortin.pkg202410060535;

import java.util.Scanner;

/**
 *
 * @author IRENYA FORTIN
 */
public class POOP1T1M2IRENYAFORTIN202410060535 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int edad=0,a=0,b=0,x=21;
        String mensaje="";
        Recursos recursos = new Recursos();
        
      
        mensaje = recursos.mensajesalida(mensaje);
        System.out.println(mensaje);
        System.out.println("------------------");
        String mensajedad=recursos.verificarEdad(edad);
        System.out.println(mensajedad);
        System.out.println("------------------");
        int mensajemultiplicacion= recursos.multiplicacion(a, b);
        System.out.println("el resultado es: "+mensajemultiplicacion);
        System.out.println("------------------");
        int[] lista = recursos.listaDNumeros(x);
        for (int numero : lista) {
            System.out.println(numero);
    }
    }
public static class Recursos {
Scanner ingreso= new Scanner(System.in);
    public String mensajesalida(String mensaje)
    {
        mensaje = "Programacion Orientada a Objetos";
        return mensaje;
    }

    public String verificarEdad(int edad) {
        String mensajedad;
        System.out.print("Ingrese la edad ");
        edad = ingreso.nextInt();
        if (edad >= 21) {
            mensajedad = "Mayor de edad";
            
        } else {
            mensajedad = "menor de edad";
        }
        return mensajedad;
    }

    public int multiplicacion(int a, int b) {
        System.out.print("primer numero a multiplicar ");
        a = ingreso.nextInt();
        System.out.print("segundo numero a multiplicar ");
        b = ingreso.nextInt();
        int resultado = a * b;
        return resultado;
    }
    public int[] listaDNumeros(int x) {
        System.out.print("Ingrese hasta que numero desea sumalizar ");
        x = ingreso.nextInt();
        int[] numeros = new int[x];
        for (int i = 0; i < x; i++) {
            numeros[i] = i + 1;
        }
        return numeros;
    }
}
    
}
