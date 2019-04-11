public class Assembly {
    static int defaultModuleLength[] = { 3, 4 };
    Module[] modules;

    // Create a random Assembly
    public void generateAssembly(int assemblyIndex) {
        int size = size(assemblyIndex);
        modules = new Module[size];
    
        // Loop and create Modules
        for (int i = 0; i < size; i++) {
            Module newModule = new Module();
            newModule.generateModule(assemblyIndex, i);
            saveModule(i, newModule);
        }
    }

    // Save module
    public void saveModule(int index, Module mod) {
        modules[index] = mod;
    }

    public int size(int assemIndex) {
        return defaultModuleLength[assemIndex];
    }

    public Module getModule(int index) {
        return modules[index];
    }
}