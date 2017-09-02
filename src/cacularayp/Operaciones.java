/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacularayp;
import  java.lang.Math;

/**
 *
 * @author Alumno
 */
public class Operaciones {
    
    int ladoA, altura;
  
    public Operaciones(int ladoA, int altura) {
        this.ladoA = ladoA;
        this.altura = altura;
    }
    
    
    public int areaCuadrado(){
       
        int area = ladoA * altura;

        return area; 
    }
    
    
    public int AreaTriangulo(){
       
        int area = (ladoA * altura)/2;

        return area; 
    }
    
    public int AreaCirculo(){
       
        int area = (int) ((int) Math.pow(ladoA,2) * Math.PI);

        return area; 
    }
    
    public int perimetroCuadrado(){
        
        int perimetro = ladoA*4;
            
        
        return perimetro;
    }
    
    public int perimetroCirculo(){
        
        int perimetro = (int) (2*Math.PI*ladoA);
            
        return perimetro;
    }
    
    public int perimetroTriangulo(){
        
        int perimetro = ladoA*3;    
            
        return perimetro;
    }
    
    public int perimetroRectagulo(){
        
        int perimetro = (ladoA*2) + (altura*2);  
            
        return perimetro;
    }
    
    
}
