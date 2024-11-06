import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class JeuCartes {
    private Queue<Carte> cartes;

    public JeuCartes() {
        cartes = new LinkedList<>();
        for (Couleur couleur : Couleur.values()) {
            for (Valeur valeur : Valeur.values()) {
                cartes.add(new Carte(couleur, valeur));
            }
        }
        melanger();
    }

    public void melanger() {
        ArrayList<Carte> listCartes = new ArrayList<>(cartes);
        Collections.shuffle(listCartes);
        cartes = new LinkedList<>(listCartes);
    }

    public Carte distribuerCarte() {
        return cartes.poll();
    }

    public boolean estVide() {
        return cartes.isEmpty();
    }
}
