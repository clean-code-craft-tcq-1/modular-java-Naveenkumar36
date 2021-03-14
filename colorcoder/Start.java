package colorcoder;

import static colorcoder.ColorCodeAssociation.*;
import static colorcoder.TestColorCode.*;

public final class Start {

    private Start() {

    }

    public static void main(String[] args) {
        testNumberToPairColor(4, MajorColor.WHITE, MinorColor.BROWN);
        testNumberToPairColor(5, MajorColor.WHITE, MinorColor.SLATE);

        testPairColorToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        testPairColorToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);

        printAllColorCode();
    }
}
