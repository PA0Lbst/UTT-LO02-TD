package td6;

public enum Valeur {
    SEPT(7), HUIT(8), NEUF(9), DIX(10), VALET(11), DAME(12), ROI(13), AS(14);

    private int valeur;

    Valeur(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }
}
