package Main;

import java.util.LinkedList;
import java.util.List;
import Models.Material;


public class Materiales {
    
    private List<Material> listaMateriales;

    public Materiales() {
        Material m1 = new Material("Cemento Luminoso", 20000);
        Material m2 = new Material("Madera Laminada", 8000);
        Material m3 = new Material("Ladrillos", 2000);
        Material m4 = new Material("Colillas de Cigarrillos", 1000);
        Material m5 = new Material("Hormigón Autorreparable", 25000);
        Material m6 = new Material("Ladrillos Autoventilados", 15000);
        Material m7 = new Material("Fibra de Carbono", 30000);
        Material m8 = new Material("Cemento Programable", 26000);
        Material m9 = new Material("Pétreos (Piedra caliza, mármol, granito y pizarra)", 10000);
        Material m10 = new Material("Aglomerantes (Cemento, yeso y call)", 8000);
        Material m11 = new Material("Hormigón", 10000);
        Material m12 = new Material("Cerámica", 15000);
        Material m13 = new Material("Acero", 5000);
        Material m14 = new Material("Madera", 4000);
        Material m15 = new Material("Vidrios Polarizados o Reflectantes", 9000);
        Material m16 = new Material("Paneles Solares", 25000);
        Material m17 = new Material("Características: Antisísmico", 40000);
        Material m18 = new Material("Vidrio", 4500);
        Material m19 = new Material("PVC", 1000);
        Material m20 = new Material("Grava", 4000);
        Material m21 = new Material("Pavimento Flexible", 9000);
        Material m22 = new Material("Asfalto", 3000);
        Material m23 = new Material("Arena", 1000);
        
        this.listaMateriales = new LinkedList<Material>();
        this.setListaMateriales(m1);
        this.setListaMateriales(m2);
        this.setListaMateriales(m3);
        this.setListaMateriales(m4);
        this.setListaMateriales(m5);
        this.setListaMateriales(m6);
        this.setListaMateriales(m7);
        this.setListaMateriales(m8);
        this.setListaMateriales(m9);
        this.setListaMateriales(m10);
        this.setListaMateriales(m11);
        this.setListaMateriales(m12);
        this.setListaMateriales(m13);
        this.setListaMateriales(m14);
        this.setListaMateriales(m15);
        this.setListaMateriales(m16);
        this.setListaMateriales(m17);
        this.setListaMateriales(m18);
        this.setListaMateriales(m19);
        this.setListaMateriales(m20);
        this.setListaMateriales(m21);
        this.setListaMateriales(m22);
        this.setListaMateriales(m23);
    }
    
    public List<Material> getListaMateriales() {
        return listaMateriales;
    }

    public void setListaMateriales(Material material) {
        this.listaMateriales.add(material);
    }
    
    public Material getMaterial(String nombre) {
        Material mFound = null;
        
        for (Material material : listaMateriales) {
            if (nombre.equals(material.getNombre())) {
                mFound = material;
            }
        }
        
        return mFound;
    }
}
