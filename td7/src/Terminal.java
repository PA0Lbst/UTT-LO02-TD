import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du Joueur 1 : ");
        String nomJoueur1 = scanner.nextLine();
        System.out.print("Entrez le nom du Joueur 2 : ");
        String nomJoueur2 = scanner.nextLine();

        Partie partie = new Partie(nomJoueur1, nomJoueur2);
        partie.jouer();
    }
}
