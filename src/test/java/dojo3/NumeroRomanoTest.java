package dojo3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class NumeroRomanoTest {

    @Test
    public void para_I_deveRetornar_1() {
        String entrada = "I";

        int retorno = NumeroRomano.converter(entrada);

        assertEquals(1, retorno);
    }

    @Test
    public void para_II_deveRetornar_2() {
        String entrada = "II";

        int retorno = NumeroRomano.converter(entrada);

        assertEquals(2, retorno);
    }


    @Test
    public void para_IV_deveRetornar_4() {
        String entrada = "IV";

        int retorno = NumeroRomano.converter(entrada);

        assertEquals(4, retorno);
    }

    @Test
    public void para_XIV_deveRetornar_14() {
        String entrada = "XIV";

        int retorno = NumeroRomano.converter(entrada);

        assertEquals(14, retorno);
    }

    @Test
    public void para_V_deveRetornar_5() {
        String entrada = "V";

        int retorno = NumeroRomano.converter(entrada);

        assertEquals(5, retorno);
    }

    @Test
    public void para_X_deveRetornar_10() {
        String entrada = "X";

        int retorno = NumeroRomano.converter(entrada);

        assertEquals(10, retorno);
    }

    @Test
    public void para_MMM_deveRetornar_3000() {
        String entrada = "MMM";

        int retorno = NumeroRomano.converter(entrada);

        assertEquals(3000, retorno);
    }

    @Test
    public void para_LXXIX_deveRetornar_79() {
        String entrada = "LXXIX";

        int retorno = NumeroRomano.converter(entrada);

        assertEquals(79, retorno);
    }

    @Test
    public void para_CCXXV_deveRetornar_225() {
        String entrada = "CCXXV";

        int retorno = NumeroRomano.converter(entrada);

        assertEquals(225, retorno);
    }

    @Test
    public void para_DCCCXLV_deveRetornar_845() {
        String entrada = "DCCCXLV";

        int retorno = NumeroRomano.converter(entrada);

        assertEquals(845, retorno);
    }

    @Test
    public void para_MMXXII_deveRetornar_2022() {
        String entrada = "MMXXII";

        int retorno = NumeroRomano.converter(entrada);

        assertEquals(2022, retorno);
    }
    
    @Test
    public void para_MMDCLXVI_deveRetornar_2666() {
        String entrada = "MMDCLXVI";

        int retorno = NumeroRomano.converter(entrada);

        assertEquals(2666, retorno);
    }
    
    @Test
    public void para_MCMXCIX_deveRetornar_1999() {
        String entrada = "MCMXCIX";

        int retorno = NumeroRomano.converter(entrada);

        assertEquals(1999, retorno);
    }

    static class NumeroRomano {

        private final static Map<String, Integer> map = new HashMap<String, Integer>();

        static {
            map.put("M", 1000);
            map.put("CM", 900);
            map.put("D", 500);
            map.put("CD", 400);
            map.put("C", 100);
            map.put("XC", 90);
            map.put("L", 50);
            map.put("XL", 40);
            map.put("X", 10);
            map.put("IX", 9);
            map.put("V", 5);
            map.put("IV", 4);
            map.put("I", 1);
        }

        public static int converter(String entrada) {

            int valor = 0;
            String[] algarismos = entrada.split("");

            for(int contador = 0; contador < algarismos.length; contador++){
                if(contador + 1 < algarismos.length && map.containsKey(algarismos[contador] + algarismos[contador + 1])){
                    valor += map.get(algarismos[contador] + algarismos[contador + 1]);
                    contador++;
                }
                else if(map.containsKey(algarismos[contador])){
                    valor += map.get(algarismos[contador]);
                }
            }

            return valor;
        }
    }

}
