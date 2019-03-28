import java.util.Arrays;

public class Part {

    static int defaultAlternativeLength[][][] = { { { 3, 2, 4 }, { 2, 4 }, { 4, 2, 4, 2, 4 } },
            { { 3, 2, 4 }, { 2, 4 }, { 4, 2, 4 }, { 2, 4 } } };

    // Create a random part
    public void generatePart(int assemblyIndex, int moduleIndex, int partIndex) {
        int size = size(assemblyIndex, moduleIndex, partIndex);
        int[] alternatives = new int[size];
        int alt = (int) (Math.random() * size);

        alternatives[alt] = 1;
        System.out.println(Arrays.toString(alternatives));
    }

    public int size(int assemIndex, int modIndex, int parIndex) {
        return defaultAlternativeLength[assemIndex][modIndex][parIndex];
    }
}