package Models;

public class Etapa {
   private String nombre;
   private float costo;
   private boolean estado;

    public Etapa(String nombre, float costo, boolean estado) {
        this.nombre = nombre;
        this.costo = costo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
   
  
    public void addCosto(float costoE) {
        float costoT = this.getCosto() + costoE;
        this.setCosto(costoT);
    }
}
