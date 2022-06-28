package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorEmail {

    /**
     * Valida la forma de una dirección de correo
     *
     * @param email cadena de texto con el email a validar
     * @return
     */
    public static Boolean validaEmail(String email) {
        Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
