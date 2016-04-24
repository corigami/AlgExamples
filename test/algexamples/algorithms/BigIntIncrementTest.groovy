package algexamples.algorithms

/**
 * Created by Corey on 4/14/2016.
 */
class BigIntIncrementTest extends GroovyTestCase {
    void testRunAlgorithm() {

        BigIntIncrement testBigInt = new BigIntIncrement("100111","1110011");
        testBigInt.runAlgorithm(2);
    }

    void testBigIntConstructor(){
        BigIntIncrement testBigInt = new BigIntIncrement("100111","1110011");
        assertNotNull(testBigInt.getmStrOne());
        assertNotNull(testBigInt.getmStrTwo());
        try {
            BigIntIncrement testBigInt2 = new BigIntIncrement("100101b", "1110011a");
            assertNull(testBigInt2.getmStrOne());
            assertNull(testBigInt2.getmStrTwo());
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

    }

    void testRunIntProb(){
        BigIntIncrement testBigInt = new BigIntIncrement();
        assertEquals(testBigInt.runAlgorithm(1),1);

    }

    void testGetTitle() {

    }

    void testGetCurrentStep() {

    }
}
