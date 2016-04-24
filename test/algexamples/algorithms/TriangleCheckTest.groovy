package algexamples.algorithms

/**
 * Created by Corey on 4/24/2016.
 */
class TriangleCheckTest extends GroovyTestCase {
    TriangleCheck testTriangle;


    @Override
    void setUp() {
        super.setUp()
        testTriangle = new TriangleCheck();

    }

    void testCreateTriangleObject(){
        assertNotNull(testTriangle);
    }


    void testRunAlgorithm() {
        fail();
    }

    void testGetTitle() {
        assertEquals("Triangle Test", testTriangle.getTitle());
    }

    void testGetCurrentStep() {
        fail();
    }
}
