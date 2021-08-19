package collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Murillo"));
        usuarios.add(new Usuario("Guilherme"));
        usuarios.add(new Usuario("Pedro"));

        boolean res = usuarios.contains(new Usuario("Guilherme"));
        System.out.println(res);

    }
}
