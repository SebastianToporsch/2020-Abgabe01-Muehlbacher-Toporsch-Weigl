package at.fhj.iit;

/**
 * VodkaShot is a class, that extends VodkaDrink.
 * It represents a pure vodka shot.
 *
 * @author Tobias Weigl
 * @version %I%, %G%
 */
public class VodkaShot extends VodkaDrink{
    /**
     * Creates vodka shot with given name and liquid
     *
     * @param l represents liquid in the drink
     */
    public VodkaShot(Liquid l){
        super("Vodka Shot", l);
    }
}
