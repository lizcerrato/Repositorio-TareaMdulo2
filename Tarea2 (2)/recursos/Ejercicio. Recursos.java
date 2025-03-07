
package recursos;


public class Recursos {

    
    public String obtenerMensaje(){
        return "Programacion Orientada a Objetos";    
    }
    
    public String verificarEdad(int edad){
        if (edad >= 21){
            return "Mayor de edad";            
        }else {
            return "Menor de edad";
        }
    }
    public int multiplicar(int a, int b){
        return a * b;
    }
    
    public void imprimirNumeros(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    
}
