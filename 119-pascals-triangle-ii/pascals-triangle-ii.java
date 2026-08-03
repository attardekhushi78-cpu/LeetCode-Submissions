import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> Pascal = new ArrayList<>();

        Pascal.add(1);
        long prev = 1; // Declared as long to prevent overflow & match nextVal type

        for (int k = 1; k <= rowIndex; k++) {
            long nextVal = prev * (rowIndex - k + 1) / k;
            Pascal.add((int) nextVal);
            prev = nextVal;
        }

        return Pascal;
    }
}