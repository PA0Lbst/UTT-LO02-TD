package bataille.fr.utt.lo2.td6;

public class Carte implements Comparable<Carte> {  // Implémentation de Comparable
    private Couleur couleur;
    private Valeur valeur;

    public Carte(Valeur valeur, Couleur couleur) {
        this.setCouleur(couleur);
        this.setValeur(valeur);
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public Valeur getValeur() {
        return valeur;
    }

    public void setValeur(Valeur valeur) {
        this.valeur = valeur;
    }

    // Ajout de la méthode compareTo pour comparer les cartes selon leur valeur
    @Override
    public int compareTo(Carte autreCarte) {
        return this.valeur.ordinal() - autreCarte.getValeur().ordinal();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.valeur);
        sb.append(" de ");
        sb.append(this.couleur);
        return sb.toString();
    }

    public static void main(String[] args) {
        Carte c1 = new Carte(Valeur.DIX, Couleur.COEUR);
        Carte c2 = new Carte(Valeur.ROI, Couleur.COEUR);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.getValeur());
        System.out.println(c2.getValeur());
        System.out.println(c1.getValeur().ordinal());
        System.out.println(c2.getValeur().ordinal());

        Valeur[] v = Valeur.values();
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        // Comparaison des valeurs des cartes
        System.out.println(c1.getValeur().compareTo(c2.getValeur()));
    }
}
