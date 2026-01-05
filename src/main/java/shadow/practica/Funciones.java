package shadow.practica;

/*
 * @author diana
 */
public class Funciones {
    public int Digitos(int _numero) {
        int numero = Math.abs(_numero);
        int contador = 0;
        
        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }
        
        return contador;
    }
    
    public String EsPositivo(int _numero) {
        if (_numero > 0) {
            return "Positivo";
        } else if (_numero<0) {
            return "Negativo";
        } else {
            return "Neutro";
        }
    }
    
    public String EsParONon(int _numero) {
        if (_numero % 2 == 0 ) {
            return "Par";
        } else{
            return "Impar";
        }
    }
    
    public double Absoluto(int _numero) {
        return Math.abs(_numero);
    }
    
    public double Cuadrado(int _numero) {
        return Math.pow(_numero, 2);
    }
    
    public double Cubo(int _numero) {
        return Math.pow(_numero, 3);
    }
    
    public double RaizCuadrada(int _numero) {
        return Math.sqrt(_numero);
    }
    
    public double RaizCubica(int _numero) {
        return Math.cbrt(_numero);
    }
    
    public String Binario(int _numero) {
        return Integer.toBinaryString(_numero);
    }
    
    // Para hexadecimal es así: Integer.toHexString()
}
