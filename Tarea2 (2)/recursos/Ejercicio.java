
package recursos;


public class Principal {
    public static void main(String[] args){
        Recursos recursos = new Recursos();
        
        System.out.println(recursos.obtenerMensaje());
        
        System.out.println("Edad 20: " + recursos.verificarEdad(20));
        System.out.println("Edad 22: " + recursos.verificarEdad(22));
        
        int resultadoMultiplicacion = recursos.multiplicar(5, 4);
        System.out.println("Multiplicacion (5 * 4): " + resultadoMultiplicacion);
        
        System.out.println("Lista de numeros del 1 al 10: " );
        recursos.imprimirNumeros(10);
        
    }
    
}
