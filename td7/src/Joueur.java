import java.util.LinkedList;
import java.util.Queue;

public class Joueur {
    private String nom;
    private Queue<Carte> main;

    public Joueur(String nom) {
        this.nom = nom;
        this.main = new LinkedList<>();
    }

    public void ajouterCarte(Carte carte) {
        main.add(carte);
    }

    public Carte jouerCarte() {
        return main.poll();
    }

    public boolean aDesCartes() {
        return !main.isEmpty();
    }

    public String getNom() {
        return nom;
    }

    public int nombreDeCartes() {
        return main.size();
    }
}
