package org.example;

// Classe que fornece um método estático para validar o formato de e-mails
public class Validaremail {

    // Método estático que retorna verdadeiro se o formato do e-mail for válido, falso caso contrário
    public static boolean validarFormatoEmail(String email) {
        // Expressão regular para verificar o formato do e-mail
        String regex = "^[A-Za-z0-9_.]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";
        return email.matches(regex);
    }
}
