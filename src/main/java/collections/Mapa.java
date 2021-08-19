package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Murillo");
        usuarios.put(2, "Cris");
        usuarios.put(3, "Rebecca");
        usuarios.put(3, "Ana");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());

        System.out.println(usuarios.containsKey(4));
        System.out.println(usuarios.containsValue("Murillo"));

        System.out.println(usuarios.get(3));

        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor: usuarios.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.println(registro);
        }

        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.containsValue("Murillo"));
    }
}
