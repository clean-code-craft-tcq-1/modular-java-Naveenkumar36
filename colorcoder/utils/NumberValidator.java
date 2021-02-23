package colorcoder.utils;

/**
 * @author {@literal Jayaram Naveenkumar (jayaram.naveenkumar@in.bosch.com)}
 */
public final class NumberValidator {

    public static final int MAX_COLOR_CODE = 25;
    public static final int MIN_COLOR_CODE = 1;

    private NumberValidator() { }

    public static boolean isValid(int number) {
        return number >= MIN_COLOR_CODE && number <= MAX_COLOR_CODE;
    }

}
