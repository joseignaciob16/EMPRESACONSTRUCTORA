package Main;

import Models.Etapa;

public class Etapas {
    
    private String codP;
    private Etapa[] etapas;
     
    public String getCodP() {
        return codP;
    }
    
    public void setCodP(String codP) {
        this.codP = codP;
    }

    public Etapa[] getEtapas() {
        return etapas;
    }

    public void setEtapas(Etapa[] etapas) {
        this.etapas = etapas;
    }
    
    public long totalGastadoEtapas() {
        long total = 0;
        
        for (Etapa etapa : this.getEtapas()) {
            total += etapa.getCosto();
        }
        
        return total;
    }
}
