package colorcoder;

/**
 * @author {@literal Jayaram Naveenkumar (jayaram.naveenkumar@in.bosch.com)}
 */
public enum MinorColor implements Color {

    BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);
    private static final String[] MINOR_COLOR = {
          "Blue", "Orange", "Green", "Brown", "Slate"
    };
    public static final int MINOR_COLOR_SIZE = MINOR_COLOR.length;
    private final int index;

    MinorColor(int index) {
        this.index = index;
    }

    @Override
    public int fetchIndex() {
        return index;
    }

    @Override
    public String fetchColors() {
        return MINOR_COLOR[index];
    }

    public static MinorColor fetchInstance(int index) {
        int zeroBasedIndex = index - 1;
        return Color.fetchColorObject(MinorColor.class, zeroBasedIndex % MINOR_COLOR_SIZE);
    }
}
