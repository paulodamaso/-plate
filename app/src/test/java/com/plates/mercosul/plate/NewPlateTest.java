package com.plates.mercosul.plate;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsEqual;
import org.junit.Test;


/**
 * Tests for {@link NewPlate}.
 */
public class NewPlateTest {

    @Test
    public void canCreateNewPlateFromOldPlate() {
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'A'",
             new NewPlate(new OldPlate("ABC-0123")).asString(),
             new IsEqual<>("ABC0B23")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'B'",
             new NewPlate(new OldPlate("ABC-1234")).asString(),
             new IsEqual<>("ABC1C34")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'C'",
             new NewPlate(new OldPlate("ABC-2345")).asString(),
             new IsEqual<>("ABC2D45")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'D'",
             new NewPlate(new OldPlate("ABC-3456")).asString(),
             new IsEqual<>("ABC3E56")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'E'",
             new NewPlate(new OldPlate("ABC-4567")).asString(),
             new IsEqual<>("ABC4F67")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'F'",
             new NewPlate(new OldPlate("ABC-5678")).asString(),
             new IsEqual<>("ABC5G78")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'G'",
             new NewPlate(new OldPlate("ABC-6789")).asString(),
             new IsEqual<>("ABC6H89")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'H'",
             new NewPlate(new OldPlate("ABC-7890")).asString(),
             new IsEqual<>("ABC7I90")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'I'",
             new NewPlate(new OldPlate("ABC-8901")).asString(),
             new IsEqual<>("ABC8J01")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'J'",
             new NewPlate(new OldPlate("ABC-9012")).asString(),
             new IsEqual<>("ABC9A12")
        );
    }
}
