package codigo;

import javax.swing.JOptionPane;

public class ListaEnlazada {

    private Nodo inicio;

    public boolean estaVacia() {
        return inicio == null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public void agregarEstudiante() {
        Estudiante estu = new Estudiante();
        estu.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del estudiante"));
        estu.setCarrera(JOptionPane.showInputDialog("Ingrese la carrera que estudia"));
        estu.setTipoNecesidad(Integer.parseInt(JOptionPane.showInputDialog("¿Qué tipo de necesidad tiene el estudiante?\n\n"
                + "Necidad tipo 1: Personas sin internet"+"\n"
                + "Necesidad tipo 2: Personas sin computador"+"\n"
                + "Necesidad tipo 3: Personas sin internet y sin computador\n"
                + "Digita un número entre 1 y 3")));
        if (estu.getTipoNecesidad() >= 1 &&  estu.getTipoNecesidad() <= 3) {
            if (estu.getTipoNecesidad() == 1) {
                estu.setSubsidio(100000);
            } else if (estu.getTipoNecesidad() == 2) {
                estu.setSubsidio(800000);
            } else {
                estu.setSubsidio(1200000);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lo siento ingresaste un número fuera del rango");
        }
        Nodo nuevo = new Nodo();
        nuevo.setEstudiante(estu);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public String Informe() {
        String datos = "", tipoNe;
        if (!estaVacia()) {
            Nodo aux = inicio;
            while (aux != null) {
                if(aux.getEstudiante().getTipoNecesidad() == 1){
                    tipoNe = "Persona sin internet";
                }else if(aux.getEstudiante().getTipoNecesidad() == 2){
                    tipoNe = "Persona sin computador";
                }else{
                    tipoNe = "Persona sin internet y sin computador";
                }
                datos  +="Nombre del estudiante: " + aux.getEstudiante().getNombre() + "\n" + "Carrera: "+aux.getEstudiante().getCarrera()+"\n"+
                        "Tipo de necesidad: " + tipoNe + "\n" + "Valor del subsidio: "+ aux.getEstudiante().getSubsidio()+"\n\n";
                aux = aux.getSiguiente();
            }
        }else{
            JOptionPane.showMessageDialog(null, "La lista está vacía agregue un estudiante primero");
        }
        return datos;
    }
}
