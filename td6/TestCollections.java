package td6;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
       
        // Partie 1: Set
        System.out.println("=== Set ===");
        Set<Integer> set = new HashSet<>();
       
        // Ajouter des entiers wrappés
        set.add(1);
        set.add(2);
        set.add(3);
       
        // Afficher les éléments avec une boucle for
        for (Integer num : set) {
            System.out.println(num);
        }
       
        // Parcourir avec un itérateur
        Iterator<Integer> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println("Iterateur Set: " + setIterator.next());
        }
       
        // Partie 2: List
        System.out.println("\n=== List ===");
        List<Integer> list = new ArrayList<>();
       
        // Ajouter des entiers wrappés
        list.add(1);
        list.add(2);
        list.add(3);
       
        // Afficher les éléments avec une boucle for
        for (Integer num : list) {
            System.out.println(num);
        }
       
        // Parcourir avec un itérateur
        Iterator<Integer> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            System.out.println("Iterateur List: " + listIterator.next());
        }
       
        // Partie 3: Map
        System.out.println("\n=== Map ===");
        Map<Integer, String> map = new HashMap<>();
       
        // Ajouter des paires clé-valeur (entiers comme clés)
        map.put(1, "Un");
        map.put(2, "Deux");
        map.put(3, "Trois");
       
        // Afficher les éléments avec une boucle for
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Clé: " + entry.getKey() + ", Valeur: " + entry.getValue());
        }
       
        // Parcourir avec un itérateur
        Iterator<Map.Entry<Integer, String>> mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<Integer, String> entry = mapIterator.next();
            System.out.println("Iterateur Map - Clé: " + entry.getKey() + ", Valeur: " + entry.getValue());
        }
       
        // Partie 4: Queue
        System.out.println("\n=== Queue ===");
        Queue<Integer> queue = new LinkedList<>();
       
        // Ajouter des entiers wrappés
        queue.add(1);
        queue.add(2);
        queue.add(3);
       
        // Afficher les éléments avec une boucle for
        for (Integer num : queue) {
            System.out.println(num);
        }
       
        // Parcourir avec un itérateur
        Iterator<Integer> queueIterator = queue.iterator();
        while (queueIterator.hasNext()) {
            System.out.println("Iterateur Queue: " + queueIterator.next());
        }
    }
}

