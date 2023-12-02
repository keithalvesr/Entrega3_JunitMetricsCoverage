import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.example.Validaremail;

public class ValidaremailTest {

    @Test
    public void ValidarFormatoEmail() {
        assertTrue(Validaremail.validarFormatoEmail("usuario@dominio.com"));
        assertFalse(Validaremail.validarFormatoEmail("usuario@dominio"));
        assertFalse(Validaremail.validarFormatoEmail("usuario@.com"));
        assertFalse(Validaremail.validarFormatoEmail("usuario@dominio."));
    }


}