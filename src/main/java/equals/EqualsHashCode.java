package equals;

public class EqualsHashCode {

    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Murillo Welsi";
        u1.email = "murillo@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Murillo Welsi";
        u2.email = "murillo@email.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2)); //Após implementar o equals na classe equals.Usuario
    }
}
