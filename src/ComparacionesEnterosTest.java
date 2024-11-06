import org.junit.Assert;
import org.junit.Test;


public class ComparacionesEnterosTest {
    @Test
    public void testAlMenosUnoPositivo() {

    }

    @Test
    public void testEsDivisible() {

    }

    @Test
    public void testEsMayor() {

    }

    @Test
    public void testEsMenor() {

    }

    @Test
    public void testSonAmbosPares() {

    }

    @Test
    public void testSonIguales() {
        //Arange or given
        int num1=3;
        int num2=3;
        boolean expectedResult =true;
        // Act or when
        boolean actualResult = ComparacionesEnteros.sonIguales(num1, num2);
        //Assert or then
        Assert.assertEquals(expectedResult, actualResult);

    }


    @Test
    public void testSumaEsPar() {

    }
}
