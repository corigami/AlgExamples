package algexamples.algorithms;

/**
 * Basic abstract boilerplate to give Algorithms common parent
 *
 * @author Corey
 */
public class BaseAlgorithm implements IAlgorithm {
    private String title;
    public BaseAlgorithm(String title) {
        this.title = title;
    }

    /**
     * Main function to initiate algorithm example.
     *
     * @return Int
     */
    @Override
    public int runAlgorithm(){
        return 0;
    }

    /**
     * Returns the title of the Algorithm
     *
     * @return String
     */
    @Override
    public String getTitle(){
        return title;
    }

    /**
     * Returns the String sequence current step of the Algorithm
     *
     * @return String
     */
    @Override
    public String getCurrentStep(){
        return "";
    }

}
