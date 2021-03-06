public class Population {
    Individual[] individuals;

    // Create a population
    public Population(int populationSize, boolean initialise) {
        individuals = new Individual[populationSize];

        // Initialise population
        if (initialise) {
            // Loop and create individuals
            for (int i = 0; i < size(); i++) {
                Individual newIndividual = new Individual();
                newIndividual.generateIndividual();
                saveIndividual(i, newIndividual);

                // System.out.println("Fitness of Individual No. " + (i+1) + " : " + individuals[i].getFitness());
            }
        }
    }

    public int size() {
        return individuals.length;
    }

    public void saveIndividual(int index, Individual indiv) {
        individuals[index] = indiv;
    }

    public Individual getIndividual(int index) {
        return individuals[index];
    }

    // Find fittest aming individuals
    public Individual getFittest() {
        Individual fittest = individuals[0];

        // Loop through individuals to find fittest
        for (int i = 0; i < size(); i++) {
            if (fittest.getFitness() >= getIndividual(i).getFitness()) {
                fittest = getIndividual(i);
            }
        }
        return fittest;
    }

}