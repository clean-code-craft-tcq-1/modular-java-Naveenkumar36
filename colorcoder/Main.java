package colorcoder;

import static colorcoder.TestColorCode.*;

public final class Main {

    private Main() {

    }

    static void printAllColorCode() {
        System.out.println(" ------------------ ");
        System.out.println("| Number | ColorCode |");
        System.out.println(" ------------------ ");
        ColorCodeAssociation.downloadAllColorCode().forEach((key, value) -> {
            System.out.println("| " + key + " | " + value + " |");
            System.out.println(" ------------------ ");
        });
    }

    public static void main(String[] args) {
        testNumberToPairColor(4, MajorColor.WHITE, MinorColor.BROWN);
        testNumberToPairColor(5, MajorColor.WHITE, MinorColor.SLATE);

        testPairColorToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        testPairColorToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);

        printAllColorCode();
    }
}
