package org.example;
public class Validaremail {
    public static boolean validarFormatoEmail(String email) {
        String regex = "^[A-Za-z0-9_.]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";
        return email.matches(regex);

    }
}
