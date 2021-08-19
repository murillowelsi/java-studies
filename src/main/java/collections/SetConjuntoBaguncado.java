package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetConjuntoBaguncado {

    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(2);
        conjunto.add("x");
        System.out.println("O tamanho desse conjunto é: " + conjunto.size());

        conjunto.add("Teste");
        System.out.println("O tamanho desse conjunto é: " + conjunto.size());

        conjunto.remove("Teste");
        System.out.println("O tamanho desse conjunto é: " + conjunto.size());

        System.out.println("O elemento x está contido no conjunto: " + conjunto.contains("x"));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

//        conjunto.addAll(nums); //faz a uniao de todos os elementos
        conjunto.retainAll(nums);

        conjunto.clear();
        System.out.println(conjunto);

        System.out.println(conjunto);

    }
}
