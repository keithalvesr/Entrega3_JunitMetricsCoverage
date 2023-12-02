package org.example;
import org.mindrot.jbcrypt.BCrypt;


public class CadastroUsuario {

            private String nome;
            private String email;
            private String senhaHash;


            public CadastroUsuario(String nome, String email, String senha) {
                this.nome = nome;
                this.email = email;
                this.senhaHash = hashSenha(senha);


            }

            private String hashSenha(String senha) {
                return BCrypt.hashpw(senha, BCrypt.gensalt());
            }

            public boolean verificarSenha(String senha) {
                return BCrypt.checkpw(senha, this.senhaHash);
            }

            public String getNome() {
                return nome;
            }

            public String getEmail() {
                return email;
            }

            public String getSenha() {
                return "*****";
            }






        }

