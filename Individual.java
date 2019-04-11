public class Individual {
    static int defaultAssemblyLength = 2;
    Assembly[] assemblies = new Assembly[defaultAssemblyLength];
    double fitness = 0;

    // Create a random individual
    public void generateIndividual() {
        // Loop and create Assemblies
        for (int i = 0; i < size(); i++) {
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

    public Assembly getAssembly(int index) {
        return assemblies[index];
    }

    public double getFitness() {
        if (fitness == 0.0) {
            fitness = FitnessCalc.getFitness(this);
        }

        return fitness;
    }
}