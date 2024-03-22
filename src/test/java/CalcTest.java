import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.example.Calc;


public class CalcTest {
    @Test
    public void testSuma() {
        Calc calc = new Calc();
        assertEquals(5, calc.suma(2, 3));
    }
}
