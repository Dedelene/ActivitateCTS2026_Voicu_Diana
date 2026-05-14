package teste;

import org.junit.Assert;

public class CalatorAbonatTest {

    @org.junit.Test
    public void testPlatesteBilet() {
        CalatorAbonat calator = new CalatorAbonat("Nick");
        calator.setSold(5.5f);
        calator.platesteBilet(1f);
        Assert.assertEquals(4.5f, calator.getSold(), 0.001f);
    }

    @org.junit.Test
    public void testPlatesteBiletInsuficient(){
        CalatorAbonat calator = new CalatorAbonat("Ana");
        calator.setSold(5.5f);
        calator.platesteBilet(10f);
        Assert.assertEquals(5.5f, calator.getSold(), 0.001f);
    }
}

