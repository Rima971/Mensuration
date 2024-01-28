import org.example.temperature.TemperatureConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureConverterTest {

    @Test
    public void returns_32F_on_passing_0c(){
        double expected = 32;

        double actual = TemperatureConverter.convertCelciusToFerhenheit(0);

        assertEquals(actual, expected, 0.001);
    }

}
