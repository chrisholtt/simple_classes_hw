import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {
    Bottle bottle = new Bottle(100);

    @Test
    public void hasVolume() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canTakeAway10() {
        assertEquals(90, bottle.remove10());
    }

    @Test
    public void canEmptyBottle(){
        assertEquals(0, bottle.emptyBottle());
    }

    @Test
    public void canFillBottle(){
        assertEquals(100, bottle.fill());
    }

}



