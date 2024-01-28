import org.example.Measurement;
import org.example.BasicUnit;
import org.example.length.Length;
import org.example.length.LengthUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MeasurementTest {
    @Test
    public void OnAddingTwoLengthsReturnsResultWithLatterUnit(){
        Measurement<LengthUnit> expected = new Measurement<LengthUnit>(1, LengthUnit.CENTIMETER);

        Measurement<LengthUnit> l1 = new Measurement<LengthUnit>(0, LengthUnit.METER);
        Measurement<LengthUnit> l2 = new Measurement<LengthUnit>(0, LengthUnit.CENTIMETER);

        boolean actual = expected.equals(l1.add(l2));

        assertTrue(actual);
    }

//    @Test
//    public void OnAddingTwoMeasurementsReturnsResultWithLatterUnit(){
//        Measurement expected = new Measurement(1, BasicUnit.CENTI);
//
//        Measurement m1 = new Measurement(0, BasicUnit.BASE);
//        Measurement m2 = new Measurement(0, BasicUnit.CENTI);
//        Measurement actual = m1.add(m2);
//
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void OnAddingTwoMeasurementsOfValue0ReturnsResultWithValue0(){
//        Measurement expected = new Measurement(0, BasicUnit.CENTI);
//
//        Measurement m1 = new Measurement(0, BasicUnit.BASE);
//        Measurement m2 = new Measurement(0, BasicUnit.CENTI);
//        Measurement actual = m1.add(m2);
//
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void OnAdding12mWith12mReturns24m(){
//        Measurement expected = new Measurement(24, BasicUnit.BASE);
//
//        Measurement m1 = new Measurement(12, BasicUnit.BASE);
//        Measurement m2 = new Measurement(12, BasicUnit.BASE);
//        Measurement actual = m1.add((m2));
//
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void OnAdding10mmWith12cmReturns13cm(){
//        Measurement expected = new Measurement(13, BasicUnit.CENTI);
//
//        Measurement m1 = new Measurement(10, BasicUnit.MILLI);
//        Measurement m2 = new Measurement(12, BasicUnit.CENTI);
//        Measurement actual = m1.add(m2);
//
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void OnSubtractingTwoMeasurementsReturnsResultWithLatterUnit(){
//        Measurement expected = new Measurement(-1, Unit.CENTI);
//        Measurement actual = Operation.subtract(new Measurement(0, Unit.BASE), new Measurement(1, Unit.CENTI));
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void OnSubtractingTwoMeasurementsOfValue0ReturnsResultWithValue0(){
//        Measurement expected = new Measurement(0, Unit.CENTI);
//        Measurement actual = Operation.subtract(new Measurement(0, Unit.BASE), new Measurement(0, Unit.CENTI));
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void OnSubtracting12mWith12mReturns0m(){
//        Measurement expected = new Measurement(0, Unit.BASE);
//        Measurement actual = Operation.subtract(new Measurement(12, Unit.BASE), new Measurement(12, Unit.BASE));
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void OnSubtracting10mmWith12cmReturns13cm(){
//        Measurement expected = new Measurement(0.01-12, Unit.CENTI);
//        Measurement actual = Operation.subtract(new Measurement(10, Unit.MILI), new Measurement(12, Unit.CENTI));
//        assertEquals(actual, expected);
//    }
}
