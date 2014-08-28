package pegasus;

import gnu.trove.list.array.TLongArrayList;
import gnu.trove.list.array.TShortArrayList;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GIMVTest {

    //
    //     |0 1 0|      |0|        |0|
    // M = |1 0 1|  V = |1|  res = |0|
    //     |0 1 0|      |2|        |1|
    @Test
    public void simple() throws IOException {
        TShortArrayList matrixIndexes = new TShortArrayList(new short[] {0, 1, 1, 0, 1, 2, 2, 1});
        TLongArrayList vectorValues = new TLongArrayList(new long[] {0, 1, 2});
        TLongArrayList res = new TLongArrayList(new long[] {0, 0, 1});
        assertEquals(res, GIMV.minBlockVector(matrixIndexes, vectorValues));
    }
}

