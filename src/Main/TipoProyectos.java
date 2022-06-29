package Main;

import Models.Etapa;
import Models.Material;
import Models.TipoProyecto;


public class TipoProyectos {
    
    private TipoProyecto[] tipos;
    private final Materiales materiales;

    public TipoProyectos() {
        this.tipos = new TipoProyecto[6];
        this.materiales = new Materiales();
        
        TipoProyecto tipo10 = new TipoProyecto();
        tipo10.setCodigo(10);
        tipo10.setTipo("Vivienda");
        Material[] mTipo1 = new Material[8];
        mTipo1[0] = this.materiales.getMaterial("Cemento Luminoso");
        mTipo1[1] = this.materiales.getMaterial("Madera Laminada");
        mTipo1[2] = this.materiales.getMaterial("Ladrillos");
        mTipo1[3] = this.materiales.getMaterial("Colillas de Cigarrillos");
        mTipo1[4] = this.materiales.getMaterial("Hormigón Autorreparable");
        mTipo1[5] = this.materiales.getMaterial("Ladrillos Autoventilados");
        mTipo1[6] = this.materiales.getMaterial("Fibra de Carbono");
        mTipo1[7] = this.materiales.getMaterial("Cemento Programable");
        tipo10.setMateriales(mTipo1);
        
        TipoProyecto tipo11 = new TipoProyecto();
        tipo11.setCodigo(11);
        tipo11.setTipo("Vivienda");
        Material[] mTipo12 = new Material[4];
        mTipo12[0] = this.materiales.getMaterial("Pétreos (Piedra caliza, mármol, granito y pizarra)");
        mTipo12[1] = this.materiales.getMaterial("Aglomerantes (Cemento, yeso y call)");
        mTipo12[2] = this.materiales.getMaterial("Hormigón");
        mTipo12[3] = this.materiales.getMaterial("Cerámica");
        tipo11.setMateriales(mTipo12);
                
        TipoProyecto tipo20 = new TipoProyecto();
        tipo20.setCodigo(20);
        tipo20.setTipo("Edificio");
        Material[] mTipo2 = new Material[7];
        mTipo2[0] = this.materiales.getMaterial("Acero");
        mTipo2[1] = this.materiales.getMaterial("Hormigón");
        mTipo2[2] = this.materiales.getMaterial("Madera");
        mTipo2[3] = this.materiales.getMaterial("Vidrios Polarizados o Reflectantes");
        mTipo2[4] = this.materiales.getMaterial("Paneles Solares");
        mTipo2[5] = this.materiales.getMaterial("Cerámica");
        mTipo2[6] = this.materiales.getMaterial("Características: Antisísmico");
        tipo20.setMateriales(mTipo2);
        
        TipoProyecto tipo21 = new TipoProyecto();
        tipo21.setCodigo(21);
        tipo21.setTipo("Edificio");
        Material[] mTipo22 = new Material[6];
        mTipo22[0] = this.materiales.getMaterial("Acero");
        mTipo22[1] = this.materiales.getMaterial("Hormigón");
        mTipo22[2] = this.materiales.getMaterial("Madera");
        mTipo22[3] = this.materiales.getMaterial("Vidrio");
        mTipo22[4] = this.materiales.getMaterial("Aglomerantes (Cemento, yeso y call)");
        mTipo22[5] = this.materiales.getMaterial("PVC");
        tipo21.setMateriales(mTipo22);
        
        TipoProyecto tipo30 = new TipoProyecto();
        tipo30.setCodigo(30);
        tipo30.setTipo("Camino");
        Material[] mTipo3 = new Material[5];
        mTipo3[0] = this.materiales.getMaterial("Hormigón");
        mTipo3[1] = this.materiales.getMaterial("Grava");
        mTipo3[2] = this.materiales.getMaterial("Ladrillos");
        mTipo3[3] = this.materiales.getMaterial("Acero");
        mTipo3[4] = this.materiales.getMaterial("Pavimento Flexible");
        tipo30.setMateriales(mTipo3);
        
        TipoProyecto tipo31 = new TipoProyecto();
        tipo31.setCodigo(31);
        tipo31.setTipo("Camino");
        Material[] mTipo32 = new Material[3];
        mTipo32[0] = this.materiales.getMaterial("Hormigón");
        mTipo32[1] = this.materiales.getMaterial("Aglomerantes (Cemento, yeso y call)");
        mTipo32[2] = this.materiales.getMaterial("Arena");
        tipo31.setMateriales(mTipo32);
        
        TipoProyecto[] tps = new TipoProyecto[6];
        tps[0] = tipo10;
        tps[1] = tipo11;
        tps[2] = tipo20;
        tps[3] = tipo21;
        tps[4] = tipo30;
        tps[5] = tipo31;
        
        this.setTipos(tps);
    }

    public TipoProyecto[] getTipos() {
        return tipos;
    }

    public void setTipos(TipoProyecto[] tipos) {
        this.tipos = tipos;
    }
    
    public TipoProyecto getTipoProyecto(String codigo) {
        TipoProyecto tpFound = null;
        int codigoN = Integer.parseInt(codigo);
        for (TipoProyecto tipo : tipos) {
            if (codigoN == tipo.getCodigo()) {
                tpFound = tipo;
            }
        }
        
        return tpFound;
    }
}
