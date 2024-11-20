import org.junit.Assert;
import org.junit.Test;


public class ComparacionesEnterosTest {
    @Test
    public void testAlMenosUnoPositivoCaso1() {
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
    public void testAlMenosUnoPositivoCaso2() {
        int num1=-1;
        int num2=-3;
        boolean expectedResult =false;
               // Act or when
        boolean actualResult = ComparacionesEnteros.alMenosUnoPositivo(num1, num2);
               //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testAlMenosUnoPositivoCaso3() {
        int num1=1;
        int num2=3;
        boolean expectedResult =true;
               // Act or when
        boolean actualResult = ComparacionesEnteros.alMenosUnoPositivo(num1, num2);
               //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEsDivisiblecaso1() {
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
    public void testEsDivisiblecaso2() {
        //Arange or given
        int num1=4;
        int num2=3;
        boolean expectedResult =false;
        // Act or when
        boolean actualResult = ComparacionesEnteros.esDivisible(num1, num2);
        //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testEsDivisiblecaso3() {
        //Arange or given
        int num1=4;
        int num2=0;
        boolean expectedResult =false;
        // Act or when
        boolean actualResult = ComparacionesEnteros.esDivisible(num1, num2);
        //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEsMayorcaso1() {
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
    public void testEsMayorcaso2() {
         //Arange or given
        int num1=3;
        int num2=3;
        boolean expectedResult =false;
          // Act or when
        boolean actualResult = ComparacionesEnteros.esMayor(num1, num2);
          //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testEsMayorcaso3() {
          //Arange or given
        int num1=3;
        int num2=4;
        boolean expectedResult =false;
         // Act or when
        boolean actualResult = ComparacionesEnteros.esMayor(num1, num2);
         //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEsMenorcaso1() {
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
    public void testEsMenorcaso2() {
        int num1=3;
        int num2=3;
        boolean expectedResult =false;
           // Act or when
        boolean actualResult = ComparacionesEnteros.esMenor(num1, num2);
           //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testEsMenorcaso3() {
        int num1=4;
        int num2=3;
        boolean expectedResult =false;
           // Act or when
        boolean actualResult = ComparacionesEnteros.esMenor(num1, num2);
           //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSonAmbosParescaso1() {
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
    public void testSonAmbosParescaso2() {
        int num1=1;
        int num2=2;
        boolean expectedResult =false;
             // Act or when
        boolean actualResult = ComparacionesEnteros.sonAmbosPares(num1, num2);
             //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSonIgualescaso1() {
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
    public void testSonIgualescaso2() {
        //Arange or given
        int num1=2;
        int num2=3;
        boolean expectedResult =false;
        // Act or when
        boolean actualResult = ComparacionesEnteros.sonIguales(num1, num2);
        //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumaEsParcaso1() {
        //Arange or given
        int num1=2;
        int num2=3;
        boolean expectedResult =false;
        // Act or when
        boolean actualResult = ComparacionesEnteros.sonIguales(num1, num2);
        //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testSumaEsParcaso2() {
        //Arange or given
        int num1=2;
        int num2=2;
        boolean expectedResult =true;
        // Act or when
        boolean actualResult = ComparacionesEnteros.sonIguales(num1, num2);
        //Assert or then
        Assert.assertEquals(expectedResult, actualResult);
    }
}
