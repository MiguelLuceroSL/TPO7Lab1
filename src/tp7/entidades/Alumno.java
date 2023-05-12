package tp7.entidades;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Alumno {

    private int legajo;

    protected HashSet<Materia> listaMateria = new HashSet<>();
//protected List<Materia> mmm=new ArrayList<>();
    private String apellido;

    private String nombre;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
//
//    public List<Materia> getM() {
//        return m;
//    }
//
//    public void setM(List<Materia> m) {
//        this.m = m;
//    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia m) {

        boolean verificar = listaMateria.contains(m);
        if (!verificar) {
            listaMateria.add(m);
            JOptionPane.showMessageDialog(null, "Te inscribiste  a " + m.getNombre());
        } else {
            JOptionPane.showMessageDialog(null, " Ya estas isncripto en " + m.getNombre());

        }

    }

    public int cantidadMateria() {

        return listaMateria.size();

    }
 @Override
    public boolean equals(Object obj) {
        if (this== obj) {
            return true;  
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other= (Alumno) obj;
        if ((this.legajo != other.legajo)) {
            return false;
        }
        return true; 
    }

    @Override
    public int hashCode() {
        int hash=5;
        hash= 89 * hash + this.legajo;
        return hash;
    }
    @Override
    public String toString() {

        return apellido + " " + nombre;
    }

}
