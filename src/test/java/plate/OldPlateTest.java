package plate;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsEqual;
import org.junit.Test;

/**
 * Tests for {@link OldPlate}
 */
public class OldPlateTest {

    /**
     * Tests if {@link OldPlate} can be created from a valid String value
     * (obeying {@link OldPlate#pattern}).
     */
    @Test
    public void createFromValidString() {
        MatcherAssert.assertThat(
            "Created wrong plate from valid String",
            new OldPlate("AJF-1331").asString(),
            new IsEqual<>("AJF-1331")
        );
    }

    /**
     * Tests if {@link OldPlate} fails on creating from a invalid String value
     * (which disobeys {@link OldPlate#pattern}).
     */
    @Test(expected = RuntimeException.class)
    public void failsCreationOnInvalidString() {
        new OldPlate("catoblepas").asString();
        new OldPlate("ABC1234").asString();
    }
}
