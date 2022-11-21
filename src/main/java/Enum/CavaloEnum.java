package Enum;
public enum CavaloEnum {
    IMPERATRIZ("Imperatriz"),
    DUQUE("Duque"),
    PRINCESA("Princesa (vc sabe quem)"),
    PE("Pé de Pano"),
    PANGARE("Pangaré");

    private String nomeCavalo;
    CavaloEnum(String nomeCavalo){
        this.nomeCavalo = nomeCavalo;
    }

    public String getNomeCavalo() { return this.nomeCavalo;}

    public static CavaloEnum cavaloEscolhido(int i){
        switch (i) {
            case 1:
                return IMPERATRIZ;
            case 2:
                return DUQUE;
            case 3:
                return PRINCESA;
            case 4:
                return PE;
            default:
                return PANGARE;
        }
    }
}