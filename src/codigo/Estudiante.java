
package codigo;

public class Estudiante {
    private String nombre, carrera;
    private int semestre, tipoNecesidad;
    private float subsidio; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public float getSubsidio() {
        return subsidio;
    }

    public void setSubsidio(float subsidio) {
        this.subsidio = subsidio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getTipoNecesidad() {
        return tipoNecesidad;
    }

    public void setTipoNecesidad(int tipoNecesidad) {
        this.tipoNecesidad = tipoNecesidad;
    }
    
    
}
