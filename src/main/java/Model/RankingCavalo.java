package Model;

import java.io.Serializable;


public class RankingCavalo implements Serializable{
    int idCavalo;
    String nomeCavalo;
    Long tempoCavalo;
    boolean ganhou;

    public int getIdCavalo() {
        return idCavalo;
    }

    public void setIdCavalo(int idCavalo) {
        this.idCavalo = idCavalo;
    }

    public String getNomeCavalo() {
        return nomeCavalo;
    }

    public void setNomeCavalo(String nomeCavalo) {
        this.nomeCavalo = nomeCavalo;
    }

    public Long getTempoCavalo() {
        return tempoCavalo;
    }

    public void setTempoCavalo(Long tempoCavalo) {
        this.tempoCavalo = tempoCavalo;
    }

    public boolean isGanhou() {
        return ganhou;
    }

    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }
    
}
