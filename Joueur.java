package bataille.fr.utt.lo2;

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
        main.add(carte); // Ajoute une carte dans la main du joueur
    }

    public Carte jouerCarte() {
        return main.poll(); // Joue la première carte de la main
    }

    public int nombreDeCartes() {
        return main.size(); // Retourne le nombre de cartes dans la main
    }

    public boolean aDesCartes() {
        return !main.isEmpty(); // Vérifie si le joueur a encore des cartes
    }

    public String getNom() {
        return nom; // Retourne le nom du joueur
    }

    @Override
    public String toString() {
        return nom + " a " + nombreDeCartes() + " cartes.";
    }
}
