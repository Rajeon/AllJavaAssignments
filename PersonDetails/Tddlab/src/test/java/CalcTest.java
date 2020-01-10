import calculater.Calc;
import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    @Test
    public void addTest(){
//        Given
        Calc calc = new Calc();
        int x = 1;
        int y = 2;

        int expected = 3;

//        When
        int actual = calc.add(x,y);

//        Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void subtractTest(){
        Calc calc = new Calc();
        int r = 5;
        int f = 4;

        int expected = 1;

        int actual = calc.subtract(r,f);

        Assert.assertEquals(expected,actual,0.0);
    }
    @Test
    public void multiply(){
        Calc calc = new Calc();
        double r = 5.5;
        double y = 4.5;

        double expected = 24.75;

        double actual = calc.multiply(r,y);

        Assert.assertEquals(expected,actual,0.0);
    }
    @Test
    public void divide(){
        Calc calc = new Calc();
        double r = 8.0;
        double y = 2.0;

        double expected = 4;

        double actual = calc.divide(r,y);

        Assert.assertEquals(expected,actual, 0.0);
    }
    @Test
    public void square(){
        Calc calc = new Calc();
        int r = (int) Math.pow(5.0, 5.0);

        int expected = 3125;

        int actual = calc.square(r);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void squareRoot(){
        Calc calc = new Calc();
        double r = (double) Math.sqrt(25.0);

        double expected = 5;

        double actual = calc.squareRoot(r);

        Assert.assertEquals(expected,actual,0.0);
    }
    @Test
    public void exponents(){
        Calc calc = new Calc();
        double r = Math.exp(10.0);

        double expected = 22026.465794806718;

        double actual = calc.exponents(r);

        Assert.assertEquals(expected,actual,0.0);
    }
@Test
    public void sineMethod(){
        Calc calc = new Calc();
        double r = Math.sin(20.0);

        double expected = 0.9129452507276277;

        double actual = calc.sineMethod(r);

        Assert.assertEquals(expected,actual,0.0);
    }


}
