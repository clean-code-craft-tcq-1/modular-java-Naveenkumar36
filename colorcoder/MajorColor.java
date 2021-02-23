package colorcoder;

import static colorcoder.utils.EnumHelper.*;

/**
 * @author {@literal Jayaram Naveenkumar (jayaram.naveenkumar@in.bosch.com)}
 */
public enum MajorColor implements Color<Integer> {
    WHITE(0),
    RED(1),
    BLACK(2),
    YELLOW(3),
    VIOLET(4);
    private final int index;
    private static final String[] MAJOR_COLORS = {
        "White", "Red", "Black", "Yellow", "Violet"
    };
    public static final int MAJOR_COLOR_SIZE = MAJOR_COLORS.length;

    MajorColor(int index) {
        this.index = index;
    }

    @Override
    public Integer fetchIndex() {
        return index;
    }

    @Override
    public String fetchColors() {
        return MAJOR_COLORS[index];
    }

    public static MajorColor fetchInstance(int index) {
        int zeroBasedIndex = index - 1;
        return fetchEnum(MajorColor.class, zeroBasedIndex / MAJOR_COLOR_SIZE);
    }
}
