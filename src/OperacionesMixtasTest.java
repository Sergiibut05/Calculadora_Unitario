import org.junit.Assert;
import org.junit.Test;

public class OperacionesMixtasTest {
    @Test
    public void testBooleanComoTextocaso1() {
            //Arange or given
        boolean valor=true;
        String expectedResult = "verdadero";
        // Act or when
        String actualResult = OperacionesMixtas.booleanComoTexto(valor);
        //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testBooleanComoTextocaso2() {
            //Arange or given
        boolean valor=false;
        String expectedResult = "falso";
        // Act or when
        String actualResult = OperacionesMixtas.booleanComoTexto(valor);
        //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCambiarTextoAMayusculascaso1() {
        String texto= "TexTaco";
        boolean aMayusculas= true;
            //Arange or given
        String expectedResult = "TEXTACO";
        // Act or when
        String actualResult = OperacionesMixtas.cambiarTextoAMayusculas(texto, aMayusculas);
        //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCambiarTextoAMayusculascaso2() {
        String texto= "TexTaco";
        boolean aMayusculas= false;
            //Arange or given
        String expectedResult = "textaco";
        // Act or when
        String actualResult = OperacionesMixtas.cambiarTextoAMayusculas(texto, aMayusculas);
        //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testConcatenarNumeroTexto() {
        int numero=5;
        String texto= "manzanas";
            //Arange or given
        String expectedResult = "5 manzanas";
        // Act or when
        String actualResult = OperacionesMixtas.concatenarNumeroTexto(numero, texto);
        //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testConcatenarTextos() {
        String texto1="Hola";
        String texto2="Mundo";
            //Arange or given
        String expectedResult = "Hola Mundo";
            // Act or when
        String actualResult = OperacionesMixtas.concatenarTextos(texto1, texto2);
            //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDescripcionConFloat() {
        float valor1=3.14f;
        float valor2=2.71f;
            //Arange or given
        String expectedResult = "Los valores son: 3.14€ y 2.71€";
            // Act or when
        String actualResult = OperacionesMixtas.descripcionConFloat(valor1, valor2);
            //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDescripcionNumero() {
        int valor1=3;
            //Arange or given
        String expectedResult = "El número es positivo";
            // Act or when
        String actualResult = OperacionesMixtas.descripcionNumero(valor1);
            //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFormatearNumero() {
        float numero = 17.89945f;
        int decimales=2;
        //Arange or given
        String expectedResult = "17,90";
            // Act or when
        String actualResult = OperacionesMixtas.formatearNumero(numero,decimales);
            //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
}
