package at.fhj.iit;

import java.util.ArrayList;

/**
 * VodkaDrink is the base abstract class for all vodka drinks.
 * It is derived from the SimpleDrinks class and holds a Liquid object,
 * that represents a liquid.
 * <p>
 * VodkaDrink is used to calculate the effects of alcoholic vodka drinks
 * on the human body, based on weight, gender and duration of intake,
 * given that drinks were taken in consecutively over that duration of time.
 *
 * @author Tobias Weigl
 * @version %I%, %G%
 */
public abstract class VodkaDrink extends SimpleDrink{

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
     * list of alcoholic drinks on the human body, based on weight,
     * gender and duration of intake.
     *
     * @param time duration of intake in minutes
     * @param gender gender of the person which effects are being calculated
     * @param weight weight in grams of the person which effects are being calculated
     * @param list list of drinks that were taken in
     */
    public static String calculateEffects(int time, Gender gender, int weight, ArrayList<VodkaDrink> list){
        double gramsOfAlcohol = 0;
        for(VodkaDrink drink : list){
            gramsOfAlcohol += (double) (drink.getVolume()*1000)/drink.getAlcoholPercent()*0.789;
        }
        double alcoholBloodPercentage = (gramsOfAlcohol/(weight * ((gender==Gender.MALE)?0.68:0.55)))*100;
        alcoholBloodPercentage -= (gender==Gender.MALE)?0.015*(time/60):0.013*(time/60);

        if(alcoholBloodPercentage > 0.5) {
            return "You dead";

        }else if(alcoholBloodPercentage > 0.4) {
            return "Probably dead";

        } else if(alcoholBloodPercentage > 0.3) {
            return "Alcohol poisoning";

        }else if(alcoholBloodPercentage > 0.2){
            return "Very drunk";

        }else if(alcoholBloodPercentage > 0.1){
            return "Drunk";

        }else if(alcoholBloodPercentage <= 0.05){
            return "No driving";

        }else if(alcoholBloodPercentage > 0.02){
            return "Tipsy";
        }
        return "You good";

    }

}

/**
 * Enum for different genders
 */
enum Gender{
    MALE, FEMALE
}
