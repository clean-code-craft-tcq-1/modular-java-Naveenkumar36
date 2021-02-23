package colorcoder;

import java.util.Map;
import java.util.TreeMap;

import colorcoder.utils.NumberValidator;

import static colorcoder.MajorColor.*;
import static colorcoder.MinorColor.*;

/**
 * @author {@literal Jayaram Naveenkumar (jayaram.naveenkumar@in.bosch.com)}
 */
public final class ColorCodeAssociation {

    private ColorCodeAssociation() {
    }

    public static PairColor fetchColorFromNumberPair(int numberPair) {
        if (!NumberValidator.isValid(numberPair)) {
            throw new IllegalArgumentException("Index number should be in between 1 to 5");
        }
        MajorColor majorColor = MajorColor.fetchInstance(numberPair);
        MinorColor minorColor = MinorColor.fetchInstance(numberPair);
        return new PairColor(majorColor, minorColor);
    }

    public static int fetchNumberPairFromColor(
        MajorColor majorColor,
        MinorColor minorColor
    )
    {
        return majorColor.fetchIndex() * MINOR_COLOR_SIZE + minorColor.fetchIndex() + 1;
    }

    public static Map<Integer, String> downloadAllColorCode() {
        Map<Integer, String> colorCodes = new TreeMap<>();
        for (int i = 1; i <= MAJOR_COLOR_SIZE * MINOR_COLOR_SIZE; i++) {
            String pairColor = fetchColorFromNumberPair(i).toString();
            colorCodes.put(i, pairColor);
        }
        return colorCodes;
    }
}
