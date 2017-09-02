/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacularayp;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class CacularAyP {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int base =0;
        int altura=0;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("******* SOLO TRIANGULOS EQUILATERO ******");
        System.out.println("Ingrese base: ");
        base = sc.nextInt();
        
        System.out.println("Ingrese altura: ");
        altura = sc.nextInt();
        
        Operaciones operacion = new Operaciones(base,altura);
        System.out.println(" Area del circulo con esos datos: " + operacion.AreaCirculo());
        System.out.println(" Area del Triangulo con esos datos: " + operacion.AreaTriangulo());
        System.out.println(" Area del Cuadrado con esos datos: " + operacion.areaCuadrado());
        System.out.println(" Area del Rectangulo con esos datos: " + operacion.areaCuadrado());
        System.out.println("");
        System.out.println("");
        System.out.println(" Perimetro del circulo con esos datos: " + operacion.perimetroCirculo());
        System.out.println(" Perimetro del Triangulo con esos datos: " + operacion.perimetroTriangulo());
        System.out.println(" Perimetro del Cuadrado con esos datos: " + operacion.perimetroCuadrado());
        System.out.println(" Perimetro del Rectangulo con esos datos: " + operacion.perimetroRectagulo());
        
    }
    
}
