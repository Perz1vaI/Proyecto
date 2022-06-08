package proyecto;

import java.io.Serializable;
import java.util.ArrayList;

public class Campo implements Serializable {

    String tipo;
    String nombre;
    int longitud;
    boolean llave_primaria;
    ArrayList<String> registros = new ArrayList();
    private static final long serialVersionUID = 777L;

    public Campo(String nombre, String tipo, int longitud, boolean llave_primaria) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.longitud = longitud;
        this.llave_primaria = llave_primaria;
    }

    public Campo() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLlavePrimaria() {
        return llave_primaria;
    }

    public boolean isLlave_primaria() {
        return llave_primaria;
    }

    public void setLlave_primaria(boolean llave_primaria) {
        this.llave_primaria = llave_primaria;
    }

    public ArrayList<String> getRegistros() {
        return registros;
    }

    public String getRegistro(int i) {
        return registros.get(i);
    }

    public void setRegistros(ArrayList<String> registros) {
        this.registros = registros;
    }

    public void addRegistro(String registro) {
        this.registros.add(registro);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
