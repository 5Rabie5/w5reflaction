import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class TvTableBuilderTest {

    @Test
    void bulidTest() {
        TvTableBuilder tvTableBuilder = new TvTableBuilder();
        TvTable table = tvTableBuilder.build();

        List<String> expected = Arrays.asList("leg, leg, leg, leg, shlef, top".split(", "));
        List<String> parts = table.getParts();

        Assertions.assertEquals(expected, parts);

    }
}