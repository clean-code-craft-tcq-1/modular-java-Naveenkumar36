package colorcoder;

import java.util.Arrays;

/**
 * @author {@literal Jayaram Naveenkumar (jayaram.naveenkumar@in.bosch.com)}
 */
public interface Color {

    int fetchIndex();
    String fetchColors();


    static <E extends Color> E fetchColorObject(Class<E> type, int value) {
        return Arrays.stream(type.getEnumConstants())
              .filter(constant -> value == constant.fetchIndex())
              .findFirst()
              .orElse(null);
    }
}
