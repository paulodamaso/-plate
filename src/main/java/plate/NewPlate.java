package plate;

import org.cactoos.Scalar;
import org.cactoos.scalar.StickyScalar;

/**
 * {@link Plate} in new format: [A-Z]{3}-[0-9]{1}[A-Z]{1}[0-9]{2}
 */
public class NewPlate implements Plate {

    /**
     * Regex value for validating purposes.
     */
    private final String validation = "[A-Z]{3}-[0-9]{1}[A-Z]{1}[0-9]{2}";

    /**
     * String value.
     */
    private final Scalar<String> value;

    /**
     * Builds a new plate with the string value.
     * @param value value of the plate
     */
    public NewPlate(final String value) {
        this.value = () -> {
            return value;
        };
    }

    public NewPlate(final OldPlate antiga) {
        this.value = new StickyScalar<>(
            () -> {
                char[] charArray = antiga.asString().toCharArray();
                charArray[4] = (char)(charArray[4] + 17);
                return new String(charArray);
            }
        );
    }

    @Override
    public String asString() {
        try {
            return this.value.value();
        } catch (Exception error) {
            throw new RuntimeException(error);
        }
    }
}
