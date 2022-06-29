package Models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Proyecto {
    
    private String codigo;
    private String nombre;
    private long costo;
    private float area;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCosto() {
        return costo;
    }

    public void setCosto(long costo) {
        this.costo = costo;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public boolean validarCodigo() {
        boolean validar = false;
        Pattern ptt = Pattern.compile("[0-9]{4}");
        Matcher match = ptt.matcher(this.getCodigo());
        
        if (match.matches()) {
            validar = true;
        }
        
        return validar;
    }
    
    public boolean validarNombre() {
        boolean validar = false;
        
        if (!this.getNombre().equalsIgnoreCase("")) {
            validar = true;
        }
        
        return validar;
    }
    
    public boolean validarArea() {
        boolean validar = false;
        
        if (this.getArea() > 0) {
            validar = true;
        }
        
        return validar;
    }
    
    public void copiar(Proyecto p) {
        this.setCodigo(p.getCodigo());
        this.setNombre(p.getNombre());
        this.setArea(p.getArea());
        this.setCosto(p.getCosto());
    }
}
