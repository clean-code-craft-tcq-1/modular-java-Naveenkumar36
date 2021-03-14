package colorcoder;

/**
 * @author {@literal Jayaram Naveenkumar (jayaram.naveenkumar@in.bosch.com)}
 */
public final class TestColorCode {

    private TestColorCode() { }

    static void testNumberToPairColor(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
        PairColor colorPair = ColorCodeAssociation.fetchColorFromNumberPair(pairNumber);
        System.out.println("Got pair " + colorPair);
        assert (expectedMajor == colorPair.fetchMajorColor());
        assert (expectedMinor == colorPair.fetchMinorColor());
    }

    static void testPairColorToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
        int pairNumber = ColorCodeAssociation.fetchNumberPairFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert (expectedPairNumber == pairNumber);
    }
}
