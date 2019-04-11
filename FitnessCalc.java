public class FitnessCalc {
    static double[][][][] acquisitionCost = {
            { { { 3921.09, 3131.61, 1947.39 }, { 3499.9788, 2799.976 }, { 9447.97, 8549.415, 7394.13, 6110.48 } },
                    { { 4250.002, 3850.008 }, { 4213.727, 3854.639, 3719.981, 1991.87 } },
                    { { 4138.437, 3680.788, 3049.548, 2781.271 }, { 5000, 4000 },
                            { 3832.832, 3595.848, 3358.864, 2712.544 }, { 5000.001, 4000.002 },
                            { 7125.324, 7467.984, 6474.27, 4932.3 } } },
            { { { 6916.699, 5166.698, 3416.697 }, { 3499.967, 2799.968 }, { 7394.876, 7355.795, 7303.687, 4945.8 } },
                    { { 4678.567, 4421.428 }, { 3989.297, 3809.753, 3675.095, 3585.323 } },
                    { { 9256.37, 8205.26, 6845, 3753.5 }, { 5000.045, 4000.055 },
                            { 4712.788, 3207.772, 2873.324, 2706.1 } },
                    { { 6870.05, 4680.05 }, { 7029.7944, 7229.2472, 6805.41, 4935.54 } } } };

    /* Public methods */
    // Calculate inidividuals fittness by comparing it to our candidate solution
    static double getFitness(Individual individual) {
        double fitness = 0;
        byte[] alternatives;

        for (int i = 0; i < individual.size(); i++) {   // 2
            for(int j = 0; j < individual.getAssembly(i).size(i); j++) {    // 0->3 1->4
                for(int k = 0; k < individual.getAssembly(i).getModule(j).size(i, j); k++) { // { 0->{ 0->3, 1->2, 2->5 }, 1->{ 0->3, 1->2, 2->3, 3->2 } }
                    alternatives = individual.getAssembly(i).getModule(j).getPart(k).getAlternatives();
                    int alt = findIndex(alternatives, 1);

                    if(alt == -1) {
                        System.out.println("ERROR occured :::: java programm has stopped!!!");
                        System.exit(1);
                    }

                    fitness += getAcquisitionCost(i, j, k, alt);
                    //System.out.println("FitnessCalc.getFitness fitness : " + fitness);
                }
            }
        }

        return fitness;
    }

    public static int findIndex(byte[] arr, int t) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == t) return i;
        }
        return -1;
    }

    static double getAcquisitionCost(int i, int j, int k, int alt) {
        return acquisitionCost[i][j][k][alt];
    }
}