public class Population {
    Individual[] individuals;

    // Create a population
    public Population(int populationSize, boolean initialise) {
        //System.out.println("Hello World 2");
        individuals = new Individual[populationSize];
        //System.out.println("Hello World 3");

        // Initialise population
        if (initialise) {
            //System.out.println("Hello World 4");
            // Loop and create individuals
            for (int i = 0; i < size(); i++) {
                //System.out.println("Hello World : " + i);
                Individual newIndividual = new Individual();
                newIndividual.generateIndividual();
                saveIndividual(i, newIndividual);
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
            if (fittest.getFitness() <= getIndividual(i).getFitness()) {
                fittest = getIndividual(i);
            }
        }
        return fittest;
    }

}