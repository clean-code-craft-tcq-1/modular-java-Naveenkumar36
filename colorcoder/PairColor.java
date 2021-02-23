package colorcoder;

/**
 * @author {@literal Jayaram Naveenkumar (jayaram.naveenkumar@in.bosch.com)}
 */
public class PairColor {

    private final MajorColor majorColor;
    private final MinorColor minorColor;

    public PairColor(MajorColor majorColor, MinorColor minorColor) {
        this.majorColor = majorColor;
        this.minorColor = minorColor;
    }

    public MajorColor fetchMajorColor() {
        return majorColor;
    }

    public MinorColor fetchMinorColor() {
        return minorColor;
    }

    public String toString() {
        String pairColor = majorColor.fetchColors();
        pairColor += " ";
        pairColor += minorColor.fetchColors();
        return pairColor;
    }
}
