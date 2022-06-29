package Main;

import java.util.LinkedList;
import java.util.List;
import Models.Proyecto;
import Models.TipoProyecto;

public class Proyectos {
    
    private List<Proyecto> listaProyectos;
    private List<TipoProyecto> listaTipos;
    private List<Etapas> listaEtapas;

    public Proyectos() {
        
        this.listaProyectos = new LinkedList<>();
        this.listaTipos = new LinkedList<>();
        this.listaEtapas = new LinkedList<>();
    }
    
    public List<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(List<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    public List<TipoProyecto> getListaTipos() {
        return listaTipos;
    }

    public void setListaTipos(List<TipoProyecto> listaTipos) {
        this.listaTipos = listaTipos;
    }

    public List<Etapas> getListaEtapas() {
        return listaEtapas;
    }

    public void setListaEtapas(List<Etapas> listaEtapas) {
        this.listaEtapas = listaEtapas;
    }
    
    public void agregarProyecto(Proyecto p) {
        this.listaProyectos.add(p); 
    }
    
    public void agregarTP(TipoProyecto tp) {
        this.listaTipos.add(tp);
    }
    
    public void agregarEtapas(Etapas etps) {
        this.listaEtapas.add(etps);
    }
    
    public Proyecto buscarProyecto(String codigo) {
        Proyecto pFound = null;
        
        for (Proyecto proyecto : listaProyectos) {
            if (codigo.equals(proyecto.getCodigo())) {
                pFound = proyecto;
            }
        }
        
        return pFound;
    }
    

    public TipoProyecto buscarTP(String codigo) {
        TipoProyecto tpFound = null;
        
        for (TipoProyecto tp : listaTipos) {
            if (codigo.equals(tp.getCodP())) {
                tpFound = tp;
            }
        }
        
        return tpFound;
    }
    
    public Etapas buscarEtapas(String codigo) {
        Etapas eFound = null;
        
        for (Etapas etp : listaEtapas) {
            if (codigo.equals(etp.getCodP())) {
                eFound = etp;
            }
        }
        
        return eFound;
    }
}
