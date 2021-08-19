package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Mauricio");
        fila.add("Marcio"); // retorna false
        fila.offer("Marcos"); // lança exceção
        fila.add("Regina");
        fila.offer("Pedro");
        fila.add("Guilherme");
        fila.offer("Murillo");
        fila.add("Cris");
        fila.offer("Becca");

        System.out.println(fila.peek()); // retorna false
        System.out.println(fila.element()); // lança exceção se estiver vazia

        System.out.println(fila.size());
        System.out.println(fila.isEmpty());

        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println(fila.remove());

        System.out.println(fila);
    }
}
