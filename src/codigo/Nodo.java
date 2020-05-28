
package codigo;

public class Nodo {
    private Estudiante estudiante;

    private Nodo siguiente;

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante valor) {
        this.estudiante = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }    
}
