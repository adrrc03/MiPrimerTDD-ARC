import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void test_crear_coche(){
        Coche cocheNuevo = new Coche();
    }

    @Test
    public void test_al_crear_un_coche_su_velocidad_es_cero(){
        Coche cocheNuevo = new Coche();
        Assertions.assertEquals(0, cocheNuevo.velocidad);
    }

    @Test
    public void test_al_acelerar_un_coche_su_velocidad_aumenta(){
        Coche cocheNuevo = new Coche();
        cocheNuevo.acelerar(30);
        Assertions.assertEquals(30, cocheNuevo.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_disminuye(){
        Coche cocheNuevo = new Coche();
        cocheNuevo.velocidad = 50;
        cocheNuevo.decelerar(20);
        Assertions.assertEquals(30, cocheNuevo.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero(){
        Coche cocheNuevo = new Coche();
        cocheNuevo.velocidad = 50;
        cocheNuevo.decelerar(80);
        Assertions.assertEquals(0, cocheNuevo.velocidad);
    }
}
