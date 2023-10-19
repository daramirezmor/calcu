
package modelView;


public class Operaciones {
    
    
    public static int Sumar(int num1, int  num2){

        int suma = num1 + num2;
        return suma;
    }
    
    public static int Restar(int num1, int num2){
        
        int resta = num1 - num2;
        return resta;
    }

    public static int Multiplicar(int num1, int num2){
 
        return num1 * num2;
    }
    
    public static double Dividir(int num1, int num2){
        
        double division = num1 / num2;
 
        return division;
    }
    
    public static double Potencia(int num1, int num2){
 
        return Math.pow(num1, num2);
    }
    
    
    public static double Radical(double num1, double num2){
        double a = 1 / num2;
 
        return Math.pow(num1, (a));
    }
    
    public static double logaritmoNatural(int num1){
 
        return Math.log(num1);
    }
    
    public static double Logaritmo(int num1, int num2){
 
        return Math.log10(num1)/Math.log10(num2);
    }
    
    public static double Seno(int num1){
 
        return Math.sin(num1);
    }
    
    public static double Coseno(int num1){
 
        return Math.cos(num1);
    }
    
    public static double Tangente(int num1){
 
        return Math.tan(num1);
    }
    
    public static double Factorial(int num1){
        double fact = 1;
        for (int i = 1; i <= num1; i++) {                                                                            
            fact = fact * i;
        }
        return fact;     
    }
    
    
    
    

    
}
