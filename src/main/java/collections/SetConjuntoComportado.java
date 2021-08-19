package collections;

import java.util.HashSet;
import java.util.Set;

public class SetConjuntoComportado {

    public static void main(String[] args) {

        Set<String> lista = new HashSet<String>();

        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Bia");
        lista.add("Jorge");

        for (String nome : lista) {
            System.out.println(nome);
        }

        Set<Integer> nums = new HashSet<>();

        nums.add(2);
        nums.add(10);
        nums.add(789);

        System.out.println(nums);

    }
}
