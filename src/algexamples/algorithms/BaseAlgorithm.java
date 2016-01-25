package algexamples.algorithms;

/**
 * Basic abstract boilerplate to give Algorithms common parent
 *
 * @author Corey
 */
public abstract class BaseAlgorithm implements IAlgorithm {

    public BaseAlgorithm() {
    }

    /**
     * Main function to initiate algorithm example.
     *
     * @return String
     */
    @Override
    public abstract int runAlgorithm();

    /**
     * Returns the title of the Algorithm
     *
     * @return String
     */
    @Override
    public abstract String getTitle();

    /**
     * Returns the String sequence current step of the Algorithm
     *
     * @return String
     */
    @Override
    public abstract String getCurrentStep();

}
