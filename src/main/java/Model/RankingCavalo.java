package Model;

public class RankingCavalo {
    String nomeCavalo;
    Long tempoCavalo;
    
    public RankingCavalo(String nomeCavalo){
        this.setNomeCavalo(nomeCavalo);
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

    
}
