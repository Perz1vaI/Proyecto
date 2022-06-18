package proyecto;

import java.util.ArrayList;

public class DatosRegistros {
    
    private ArrayList<Campo> fields;
    private ArrayList<String> data;

    public DatosRegistros() {
        this.fields = new ArrayList();
        this.data = new ArrayList();
    }

    public ArrayList<Campo> getFields() {
        return fields;
    }

    public ArrayList<String> getData() {
        return data;
    }
    
    public void addCampo(Campo campo){
        this.fields.add(campo);
    }
    
    public void addDato(String dato){
        this.data.add(dato);
    }

    public void setFields(ArrayList<Campo> fields) {
        this.fields = fields;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }
    
}
