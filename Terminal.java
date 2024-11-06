package bataille.fr.utt.lo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terminal {

    public static String lireChaine() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String laChaine = null;
        try {
            laChaine = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return laChaine;
    }

    public static void main(String[] args) {
        System.out.println("Entrez le nom du joueur 1 :");
        String nomJoueur1 = lireChaine();
        System.out.println("Entrez le nom du joueur 2 :");
        String nomJoueur2 = lireChaine();

        Joueur joueur1 = new Joueur(nomJoueur1);
        Joueur joueur2 = new Joueur(nomJoueur2);

        Partie partie = new Partie(joueur1, joueur2);
        partie.jouer();
    }
}
