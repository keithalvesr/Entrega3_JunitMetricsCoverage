import org.example.CadastroUsuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CadastroUsuarioTest {

    @Test
    public void testVerificarSenha() {
        String nome = "Keith";
        String email = "keith@email.com";
        String senha = "senha123";

        CadastroUsuario cadastroUsuario = new CadastroUsuario(nome, email, senha);

        Assertions.assertTrue(cadastroUsuario.verificarSenha(senha));
    }

    @Test
    public void testGetNome() {
        // Arrange
        String nome = "Maria";
        String email = "maria@email.com";
        String senha = "outrasenha123";

        CadastroUsuario cadastroUsuario = new CadastroUsuario(nome, email, senha);

        Assertions.assertEquals(nome, cadastroUsuario.getNome());
    }

    @Test
    public void testCadastroUsuario() {

        String nome = "Teste";
        String email = "teste@teste.com";
        String senha = "senha";


        CadastroUsuario usuario = new CadastroUsuario(nome, email, senha);

        Assertions.assertEquals(nome, usuario.getNome());
        Assertions.assertEquals(email, usuario.getEmail());
        Assertions.assertTrue(usuario.verificarSenha(senha));
    }
}
