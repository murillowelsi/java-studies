package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Murillo"));
        lista.add(new Usuario("Alberto"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Carlos"));

        Usuario u1 = new Usuario("Tux");

        lista.add(u1);

        System.out.println(lista.remove(new Usuario("Manu")));
        System.out.println(lista.contains(new Usuario("Alberto")));
        System.out.println(lista.contains(u1));

        for (Usuario u: lista) {
            System.out.println(u.nome);
        }
        
    }
}
