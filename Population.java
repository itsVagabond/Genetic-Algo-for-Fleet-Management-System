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
}