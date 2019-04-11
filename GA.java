public class GA {
    public static void main(String[] args) {

        // Create an initial population
        Population myPop = new Population(200, true);

        // Evolve our population until we reach an optimum solution
        for(int generationCount = 200; generationCount > 0; generationCount --) {
            System.out.println("Generation: " + (201-generationCount) + " Fittest: " + myPop.getFittest().getFitness());
            myPop = Algorithm.evolvePopulation(myPop);   
        }
        
        System.out.println("\nSolution Naturally Optimized!");
    }
}