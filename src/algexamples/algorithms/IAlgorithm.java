/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algexamples.algorithms;

/**
 *
 * @author Corey
 */
public interface IAlgorithm {

    /**
     * Main entry point for the algorithm.  This will be called from the main program menu
     * @return int status code.  (-1 for failure)
     */
    public int runAlgorithm();

    /**
     * Returns string title of algorithm
     * @return String title of alogorithm
     */
    public String getTitle();

    /**
     * Returns string representation of current step.
     * @return string representation of current step of algorithm
     */
    public String getCurrentStep();
}
