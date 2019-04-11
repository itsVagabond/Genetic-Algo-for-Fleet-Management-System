public class GA {
    public static void main(String[] args) {

        // Create an initial population
        //System.out.println("Hello World 1");
        Population myPop = new Population(50, true);

        // Evolve our population until we reach an optimum solution
        int generationCount = 10;

        //while(generationCount > 0) {
            System.out.println("Generation: " + (10-generationCount) + " Fittest: " + myPop.getFittest().getFitness());
            // myPop = Algorithm.evolvePopulation(myPop);
            // generationCount --;
        //}
        
        System.out.println("Solution Naturally Optimized!");
    }
}