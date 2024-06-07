package Examen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FestivosTest {

    private Festivos festivos;

    @BeforeEach
    public void setUp(){
        festivos = new Festivos();
    }

    @Test
    public void incluirDiaFestivo() throws FestivosException {
        festivos.incluirDiaFestivo(0,"San Cristobal");
        assertTrue(festivos.consultarFestividad(0));
        assertEquals("San Cristobal",festivos.consultarMotivoFestividad(0));
    }

    @Test
    public void consultarFestividad()throws FestivosException {
        festivos.incluirDiaFestivo(0,"San Cristobal");
        assertTrue(festivos.consultarFestividad(0));
        assertFalse(festivos.consultarFestividad(1));
    }

    @Test
    public void consultarMotivoFestividad() throws FestivosException {
        festivos.incluirDiaFestivo(0, "San Cristobal");
        assertEquals("San Cristobal",festivos.consultarMotivoFestividad(0));
        assertEquals("No es festivo", festivos.consultarMotivoFestividad(1));

    }

    @Test
    public void contarDiasFestivos() throws  FestivosException{
        festivos.incluirDiaFestivo(0, "San Cristobal");
        festivos.incluirDiaFestivo(1, "Segundo dia");
        assertEquals(2,festivos.contarDiasFestivos());
    }

    @Test
    public void consultarMesConMasFestivos() throws FestivosException {
        for (int i =0; i<31; i++ ){
            festivos.incluirDiaFestivo(i,"Festivo Enero");
        }
        for (int i= 31; i< 59; i++){
            festivos.incluirDiaFestivo(i, "Festivo Febrero");
        }
        assertEquals(1,festivos.consultarMesConMasFestivos());
    }

    @Test
    public void consultarPrimerFestivo() throws FestivosException{
        festivos.incluirDiaFestivo(10, "Decimo dia");
        festivos.incluirDiaFestivo(5, "Quinto dia");
        assertEquals(5, festivos.consultarPrimerFestivo());
    }

    @Test
    public void diasFestivos() {
        //Este metodo es privado
    }

    @Test
    public void comprobarDia() {
        assertThrows(FestivosException.class, () -> festivos.comprobarDia(365));
    }
}






























