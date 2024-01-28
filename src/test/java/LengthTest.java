import org.example.BasicUnit;
import org.example.Measurement;
import org.example.length.Length;
import org.example.length.Length;
import org.example.length.LengthUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthTest {
    @Test
    public void OnAddingTwoLengthsReturnsResultWithLatterUnit(){
        Length expected = new Length(1, LengthUnit.CENTIMETER);

        Length l1 = new Length(0, LengthUnit.METER);
        Length l2 = new Length(0, LengthUnit.CENTIMETER);

        Measurement<LengthUnit> actual = l1.add(l2);

        assertEquals(actual, expected);
    }
}
