package bataille.fr.utt.lo2;

public class Partie {
    private Joueur joueur1;
    private Joueur joueur2;
    private JeuCartes jeuCartes;

    public Partie(Joueur joueur1, Joueur joueur2) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.jeuCartes = new JeuCartes();
        distribuerCartes();
    }

    private void distribuerCartes() {
        // Distribution des cartes entre les deux joueurs
        while (!jeuCartes.estVide()) {
            joueur1.ajouterCarte(jeuCartes.tirerCarte());
            if (!jeuCartes.estVide()) {
                joueur2.ajouterCarte(jeuCartes.tirerCarte());
            }
        }
    }

    public void jouer() {
        // Boucle de jeu jusqu'à ce qu'un joueur n'ait plus de cartes
        while (joueur1.aDesCartes() && joueur2.aDesCartes()) {
            Carte carte1 = joueur1.jouerCarte();
            Carte carte2 = joueur2.jouerCarte();

            System.out.println(joueur1.getNom() + " joue " + carte1);
            System.out.println(joueur2.getNom() + " joue " + carte2);

            // Comparaison des cartes jouées
            if (carte1.compareTo(carte2) > 0) {
                joueur1.ajouterCarte(carte1);
                joueur1.ajouterCarte(carte2);
                System.out.println(joueur1.getNom() + " remporte ce tour.");
            } else if (carte1.compareTo(carte2) < 0) {
                joueur2.ajouterCarte(carte1);
                joueur2.ajouterCarte(carte2);
                System.out.println(joueur2.getNom() + " remporte ce tour.");
            } else {
                System.out.println("Égalité ! Les joueurs rejouent une carte.");
            }
        }

        // Affichage du gagnant
        if (joueur1.aDesCartes()) {
            System.out.println(joueur1.getNom() + " remporte la partie !");
        } else {
            System.out.println(joueur2.getNom() + " remporte la partie !");
        }
    }
}
