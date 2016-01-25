
package algexamples.algorithms;

/**
 * Basic abstract boilerplate to give Algorithms common parent
 * @author Corey
 */
public abstract class BaseAlgorithm implements IAlgorithm{
    public BaseAlgorithm() {
        }
    
    @Override
    public abstract int runAlgorithm();

    @Override
    public abstract String getTitle();
    
    @Override
    public abstract String getCurrentStep();
    
    
    
    
}
