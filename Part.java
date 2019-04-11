import java.util.Arrays;

public class Part {

    static int defaultAlternativeLength[][][] = { { { 3, 2, 4 }, { 2, 4 }, { 4, 2, 4, 2, 4 } },
            { { 3, 2, 4 }, { 2, 4 }, { 4, 2, 4 }, { 2, 4 } } };
    byte[] alternatives;

    // Create a random part
    public void generatePart(int assemblyIndex, int moduleIndex, int partIndex) {
        int size = size(assemblyIndex, moduleIndex, partIndex);
        alternatives = new byte[size];
        int alt = (int) (Math.random() * size);

        alternatives[alt] = 1;
        //System.out.println(Arrays.toString(alternatives));
    }

    public int size(int assemIndex, int modIndex, int parIndex) {
        return defaultAlternativeLength[assemIndex][modIndex][parIndex];
    }

    public byte[] getAlternatives() {
        return alternatives;
    }

    public void setAlternative(int index) {
        Arrays.fill(alternatives, (byte)0);

        alternatives[index] = 1;
    }
}