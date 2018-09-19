package plate;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsEqual;
import org.junit.Test;
import plate.NewPlate;
import plate.OldPlate;

/**
 * Tests for {@link NewPlate}.
 */
public class NewPlateTest {

    @Test
    public void canCreateNewPlateFromOldPlate() {
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'A'",
             new NewPlate(new OldPlate("ABC-0123")).asString(),
             new IsEqual<>("ABC-A123")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'B'",
             new NewPlate(new OldPlate("ABC-1234")).asString(),
             new IsEqual<>("ABC-B234")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'C'",
             new NewPlate(new OldPlate("ABC-2345")).asString(),
             new IsEqual<>("ABC-C345")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'D'",
             new NewPlate(new OldPlate("ABC-3456")).asString(),
             new IsEqual<>("ABC-D456")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'E'",
             new NewPlate(new OldPlate("ABC-4567")).asString(),
             new IsEqual<>("ABC-E567")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'F'",
             new NewPlate(new OldPlate("ABC-5678")).asString(),
             new IsEqual<>("ABC-F678")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'G'",
             new NewPlate(new OldPlate("ABC-6789")).asString(),
             new IsEqual<>("ABC-G789")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'H'",
             new NewPlate(new OldPlate("ABC-7890")).asString(),
             new IsEqual<>("ABC-H890")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'I'",
             new NewPlate(new OldPlate("ABC-8901")).asString(),
             new IsEqual<>("ABC-I901")
        );
        MatcherAssert.assertThat(
            "Wrong plate transformation, letter 'J'",
             new NewPlate(new OldPlate("ABC-9012")).asString(),
             new IsEqual<>("ABC-J012")
        );
    }
}
