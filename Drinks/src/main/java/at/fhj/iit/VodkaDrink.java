package at.fhj.iit;

/**
 * VodkaDrink is the base abstract class for all vodka drinks.
 * It is derived from the SimpleDrinks class and holds a Liquid object,
 * that represents a liquid.
 * <p>
 * VodkaDrink is used to calculate the effects of alcoholic vodka drinks
 * on the human body, based on size, weight, gender and duration of intake,
 * given that drinks were taken in consecutively over that duration of time.
 *
 * @author Tobias Weigl
 * @version %I%, %G%
 */
public abstract class VodkaDrink extends SimpleDrink{
    private String name;
    private Liquid l;
    /**
     * Constructor for vodka drinks.
     *
     * @param name name of the drink
     * @param l liquid in drink
     */
    public VodkaDrink(String name, Liquid l){
        super(name, l);
    }

    /**
     * Takes a list of vodka drinks and calculates the effects of that
     * list of alcoholic drinks on the human body, based on size, weight,
     * gender and duration of intake.
     */
    public static VodkaEffects calculateEffects(){
        return null;
    }

}

/**
 * Enum for returning the effects of vodka drinks on the human body.
 */
enum VodkaEffects{

}
