public class Individual {
    static int defaultAssemblyLength = 2;
    Assembly[] assemblies = new Assembly[defaultAssemblyLength];

    // Create a random individual
    public void generateIndividual() {
        //System.out.println("Hello World 5");
        // Loop and create Assemblies
        for (int i = 0; i < size(); i++) {
            //System.out.println("Hello World = " + i);
            Assembly newAssembly = new Assembly();
            newAssembly.generateAssembly(i);
            saveAssembly(i, newAssembly);
        }
    }

    // Save assembly
    public void saveAssembly(int index, Assembly assem) {
        assemblies[index] = assem;
    }

    public int size() {
        return assemblies.length;
    }
}