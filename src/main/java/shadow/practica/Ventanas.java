package shadow.practica;

/*
 * @author Knight
 */

public class Ventanas {
    private Numeros FNumeros; // Instancia de la clase del form Ventanas
    
    public Ventanas() {
        FNumeros = new Numeros(this);
    }
    
    // Métodos
    public void MostrarNumeros() {
        FNumeros.setVisible(true);
    }
}
