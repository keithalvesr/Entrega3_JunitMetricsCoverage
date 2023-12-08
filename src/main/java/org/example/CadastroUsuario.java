package org.example;
import org.mindrot.jbcrypt.BCrypt;

// Classe cadastro de um usuário no sistema
public class CadastroUsuario {

            private String nome; // Nome do usuário
            private String email; // Endereço de e-mail do usuário
            private String senhaHash; // Hash da senha do usuário

      // Construtor para criar um novo usuário com nome, e-mail e senha
            public CadastroUsuario(String nome, String email, String senha) {
                this.nome = nome;
                this.email = email;
                this.senhaHash = hashSenha(senha);


            }


            // Método privado para gerar um hash seguro da senha usando a biblioteca BCrypt
            private String hashSenha(String senha) {
                return BCrypt.hashpw(senha, BCrypt.gensalt());
            }

            // Método para verificar se a senha fornecida corresponde à senha do usuário
            public boolean verificarSenha(String senha) {
                return BCrypt.checkpw(senha, this.senhaHash);
            }

            // Métodos de acesso para obter informações do usuário

            public String getNome() {
                return nome;
            }

            public String getEmail() {
                return email;
            }


            // Método para obter a senha, mas retorna "*****" em vez da senha real para maior segurança
            public String getSenha() {
                return "*****";
            }






        }

