import org.junit.Assert;
import org.junit.Test;


public class ComparacionesEnterosTest {
    @Test
    public void testAlMenosUnoPositivo() {
          //Arange or given
        int num1=1;
        int num2=-3;
        boolean expectedResult =true;
               // Act or when
        boolean actualResult = ComparacionesEnteros.alMenosUnoPositivo(num1, num2);
               //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEsDivisible() {
        //Arange or given
        int num1=4;
        int num2=2;
        boolean expectedResult =true;
        // Act or when
        boolean actualResult = ComparacionesEnteros.esDivisible(num1, num2);
        //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEsMayor() {
         //Arange or given
        int num1=4;
        int num2=3;
        boolean expectedResult =true;
         // Act or when
        boolean actualResult = ComparacionesEnteros.esMayor(num1, num2);
         //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEsMenor() {
          //Arange or given
        int num1=2;
        int num2=3;
        boolean expectedResult =true;
           // Act or when
        boolean actualResult = ComparacionesEnteros.esMenor(num1, num2);
           //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSonAmbosPares() {
          //Arange or given
        int num1=2;
        int num2=2;
        boolean expectedResult =true;
             // Act or when
        boolean actualResult = ComparacionesEnteros.sonAmbosPares(num1, num2);
             //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
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
