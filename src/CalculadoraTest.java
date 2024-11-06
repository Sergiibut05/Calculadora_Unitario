import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testSuma() {
        int sumando1 = 2;
        int sumando2 = 3;
        int resultadoEsperado = sumando1 + sumando2;
        Calculadora calculadora = new Calculadora();
        int resultadoReal = calculadora.Suma(sumando1, sumando2);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    public void testResta() {
        int sumando1 = 2;
        int sumando2 = 3;
        int resultadoEsperado = sumando1 - sumando2;
        Calculadora calculadora = new Calculadora();
        int resultadoReal = calculadora.Resta(sumando1, sumando2);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    public void testMultiplicacion() {
        int sumando1 = 2;
        int sumando2 = 3;
        int resultadoEsperado = sumando1 * sumando2;
        Calculadora calculadora = new Calculadora();
        int resultadoReal = calculadora.Multiplicacion(sumando1, sumando2);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    public void testDivision() {
        int sumando1 = 2;
        int sumando2 = 3;
        int resultadoEsperado = sumando1 / sumando2;
        Calculadora calculadora = new Calculadora();
        int resultadoReal = calculadora.Division(sumando1, sumando2);
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
