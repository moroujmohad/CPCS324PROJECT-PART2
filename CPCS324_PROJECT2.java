
import java.util.Scanner;

/**
 *
 * @author moroujmohad
 * @author reemyziz
 * @author nojoodGMD
 *
 */
public class CPCS324_PROJECT2 {
    
    // to record the running time
    static double startTime, endTime;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            do {
                int question = displayMenu();

                switch (question) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        question_1();
                        break;
                    case 2:
                        question_2();
                        break;
                    default:
                        System.out.println("Re-Enter your choice...");
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Something Wrong!");
            System.out.println("Error Message: " + e.getMessage());
        }
    }

    /**
     *
     * @return
     */
    public static int displayMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("--- CPCS324 PROJECT PART II ---");
        System.out.println("> Enter 1 to answer question #1");
        System.out.println("> Enter 2 to answer question #2");
        System.out.println("> Enter 0 to exit.");
        System.out.println("-------------------------------");
        System.out.print("> Your Choice: ");
        int question = input.nextInt();
        return question;

    }

    // ---------------------- QUESTION #1 --------------------------------------
    /**
     * Answer question 1
     */
    public static void question_1() {
        System.out.println("THIS IS A QUESTION #1");

        // Generate a weight matrix of question #1
        int[][] weightMatrix = makeWeightMatrix();
        System.out.println("The graph generated Successfully.");

        // Apply Floyed's Warshal Algorithm
        startTime = System.currentTimeMillis();
        FW_Algorithm(weightMatrix);
        endTime = System.currentTimeMillis();
        System.out.println("Run time of Floyed's Warshal Algorithm =  " + (endTime - startTime) + " ms.\n");
        
        // Apply Dijkstra Algorithm
        startTime = System.currentTimeMillis();
        D_Algorithm(weightMatrix);
        endTime = System.currentTimeMillis();
        System.out.println("Run time of Dijkstra's algorithm =  " + (endTime - startTime) + " ms.\n");
    }

    /**
     * implementation of the 1st graph matrix generation used in question_1()
     *
     * @return
     */
    public static int[][] makeWeightMatrix() {
        // number of vertices = 10, labled from A to J
        // A B C D E F G H I J // LABRLS
        // 0 1 2 3 4 5 6 7 8 9 // INDEICES
        
        int[][] weightMatrix = new int[10][10];

        return weightMatrix;
    }

    /**
     * implementation of Floyed's Warshal algorithm used in question_1()
     *
     * @param weightMatrix
     *
     */
    public static void FW_Algorithm(int[][] weightMatrix) {
        // print the original matrix
        System.out.println("The weight matrix: ");
        printMatrix(weightMatrix);

        // print all intermediate matrices
        
        
        // print the final matrix
    }

    /**
     * implementation of dijkstra algorithm used in question_1()
     *
     *
     * @param weightMatrix
     *
     */
    public static void D_Algorithm(int[][] weightMatrix) {

    }

    /**
     * to print the graph matrix used in question_1()
     *
     * @param matrix
     *
     */
    public static void printMatrix(int[][] matrix) {

    }

    // ---------------------- QUESTION #2 --------------------------------------
    /**
     * Answer question 2
     */
    public static void question_2() {
        System.out.println("THIS IS A QUESTION #2");
    }
}
