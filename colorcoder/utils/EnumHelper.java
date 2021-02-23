package colorcoder.utils;

import java.util.Arrays;

import colorcoder.Color;

/**
 * @author {@literal Jayaram Naveenkumar (jayaram.naveenkumar@in.bosch.com)}
 */
public final class EnumHelper {

    private EnumHelper() { }

    // Generic return syntax is copy pasted from internet
    public static <E extends Enum<E> & Color<P>, P>
    E fetchEnum(Class<E> type, P value) {
        return Arrays.stream(type.getEnumConstants())
            .filter(constant -> value.equals(constant.fetchIndex()))
            .findFirst()
            .orElse(null);
    }
}
