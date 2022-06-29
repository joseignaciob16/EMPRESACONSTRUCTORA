package Models;

public class TipoProyecto {
    
    private String codP;
    private int codigo;
    private String tipo;
    private Material[] materiales;

    public String getCodP() {
        return codP;
    }

    public void setCodP(String codP) {
        this.codP = codP;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Material[] getMateriales() {
        return materiales;
    }

    public void setMateriales(Material[] materiales) {
        this.materiales = materiales;
    }
    
    public float costoMateriales() {
        float costo = 0;
        
        for (Material material : materiales) {
            costo += material.getPrecio();
        }
        
        return costo;
    }
    
    
    public long costoProyecto(float area) {
        long costo = (long) (this.costoMateriales() * area);
        return costo;
    }
    
    public void copiar(TipoProyecto tp) {
        this.setCodigo(tp.getCodigo());
        this.setMateriales(tp.getMateriales());
        this.setTipo(tp.getTipo());
    }
}
