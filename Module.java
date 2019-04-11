public class Module {
    static int defaultPartLength[][] = { { 3, 2, 5 }, { 3, 2, 3, 2 } };
    Part[] parts;

    // Create a random Module
    public void generateModule(int assemblyIndex, int moduleIndex) {
        int size = size(assemblyIndex, moduleIndex);
        parts = new Part[size];
        //System.out.println("Hello World 7");
        // Loop and create Parts
        for (int i = 0; i < size; i++) {
            //System.out.println("Hello World => " + i);
            Part newPart = new Part();
            newPart.generatePart(assemblyIndex, moduleIndex, i);
            savePart(i, newPart);
        }
    }

    // Save module
    public void savePart(int index, Part par) {
        parts[index] = par;
    }

    public int size(int assemIndex, int modIndex) {
        return defaultPartLength[assemIndex][modIndex];
    }

    public Part getPart(int index) {
        return parts[index];
    }
}