import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruitList = new LinkedList<>();

        fruitList.add(new Fruit("Fragola"));
        fruitList.add(new Fruit("Pesca"));
        fruitList.add(new Fruit("Albicocca"));

        System.out.println("Lista iniziale:");
        for (Fruit fruit : fruitList) {
            System.out.println(fruit.getName());
        }

        fruitList.addFirst(new Fruit("Mela"));

        fruitList.addLast(new Fruit("Ciliege"));

        System.out.println("\nLista aggiornata:");
        for (Fruit fruit : fruitList) {
            System.out.println(fruit.getName());
        }
    }
}