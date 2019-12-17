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


    static class NumeroRomano {

        private final static Map<String, Integer> map = new HashMap<String, Integer>();

        static {
            map.put("M", 1000);
            map.put("X", 10);
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
