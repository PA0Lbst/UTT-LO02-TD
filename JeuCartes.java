package bataille.fr.utt.lo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JeuCartes {
    private List<Carte> cartes;

    public JeuCartes() {
        cartes = new ArrayList<>();
        // Création des 32 cartes du jeu avec toutes les combinaisons de couleur et de valeur
        for (Couleur couleur : Couleur.values()) {
            for (Valeur valeur : Valeur.values()) {
                cartes.add(new Carte(valeur, couleur));
            }
        }
        Collections.shuffle(cartes); // Mélange des cartes
    }

    public Carte tirerCarte() {
        return cartes.isEmpty() ? null : cartes.remove(0); // Tire la première carte du paquet
    }

    public boolean estVide() {
        return cartes.isEmpty(); // Vérifie si le paquet est vide
    }
}
