package com.plates.mercosul.plate;

import org.cactoos.Scalar;
import org.cactoos.scalar.StickyScalar;
import org.cactoos.text.FormattedText;

import java.util.regex.Pattern;

/**
 * {@link Plate} in old format: [A-Z]{3}-[0-9]{4}
 */
public class OldPlate implements Plate {

    private final Pattern pattern = Pattern.compile("[A-Z]{3}-[0-9]{4}");

    /**
     * String value.
     */
    private final Scalar<String> value;

    /**
     * Builds a new plate with the string value.
     * @param value value of the plate
     */
    public OldPlate(final String value) {
        this.value = new StickyScalar<String>(
            () -> {
                if (pattern.matcher(value).find()) {
                    return value;
                } else {
                    throw new RuntimeException(
                        String.format(
                            "Invalid OldPlate value: %s",
                            value
                        )
                    );
                }
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
