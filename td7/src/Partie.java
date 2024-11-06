public class Partie {
    private JeuCartes jeuCartes;
    private Joueur joueur1;
    private Joueur joueur2;

    public Partie(String nomJoueur1, String nomJoueur2) {
        jeuCartes = new JeuCartes();
        joueur1 = new Joueur(nomJoueur1);
        joueur2 = new Joueur(nomJoueur2);
        distribuerCartes();
    }

    private void distribuerCartes() {
        boolean toJoueur1 = true;
        while (!jeuCartes.estVide()) {
            if (toJoueur1) {
                joueur1.ajouterCarte(jeuCartes.distribuerCarte());
            } else {
                joueur2.ajouterCarte(jeuCartes.distribuerCarte());
            }
            toJoueur1 = !toJoueur1;
        }
    }

    public void jouer() {
        while (joueur1.aDesCartes() && joueur2.aDesCartes()) {
            Carte carteJoueur1 = joueur1.jouerCarte();
            Carte carteJoueur2 = joueur2.jouerCarte();

            System.out.println(joueur1.getNom() + " joue " + carteJoueur1);
            System.out.println(joueur2.getNom() + " joue " + carteJoueur2);

            if (carteJoueur1.getValeur().getValeur() > carteJoueur2.getValeur().getValeur()) {
                joueur1.ajouterCarte(carteJoueur1);
                joueur1.ajouterCarte(carteJoueur2);
                System.out.println(joueur1.getNom() + " gagne le tour.");
            } else if (carteJoueur1.getValeur().getValeur() < carteJoueur2.getValeur().getValeur()) {
                joueur2.ajouterCarte(carteJoueur1);
                joueur2.ajouterCarte(carteJoueur2);
                System.out.println(joueur2.getNom() + " gagne le tour.");
            } else {
                System.out.println("Égalité ! Les joueurs rejouent une carte.");
                // Gestion de l'égalité : les joueurs rejouent une carte supplémentaire
                jouerEnCasDEgalite(carteJoueur1, carteJoueur2);
            }
        }
        afficherGagnant();
    }

    private void jouerEnCasDEgalite(Carte carteJoueur1, Carte carteJoueur2) {
        if (joueur1.aDesCartes() && joueur2.aDesCartes()) {
            Carte nouvelleCarteJoueur1 = joueur1.jouerCarte();
            Carte nouvelleCarteJoueur2 = joueur2.jouerCarte();

            System.out.println(joueur1.getNom() + " joue " + nouvelleCarteJoueur1);
            System.out.println(joueur2.getNom() + " joue " + nouvelleCarteJoueur2);

            if (nouvelleCarteJoueur1.getValeur().getValeur() > nouvelleCarteJoueur2.getValeur().getValeur()) {
                joueur1.ajouterCarte(carteJoueur1);
                joueur1.ajouterCarte(carteJoueur2);
                joueur1.ajouterCarte(nouvelleCarteJoueur1);
                joueur1.ajouterCarte(nouvelleCarteJoueur2);
            } else {
                joueur2.ajouterCarte(carteJoueur1);
                joueur2.ajouterCarte(carteJoueur2);
                joueur2.ajouterCarte(nouvelleCarteJoueur1);
                joueur2.ajouterCarte(nouvelleCarteJoueur2);
            }
        }
    }

    private void afficherGagnant() {
        if (joueur1.aDesCartes()) {
            System.out.println(joueur1.getNom() + " a gagné la partie !");
        } else {
            System.out.println(joueur2.getNom() + " a gagné la partie !");
        }
    }
}
