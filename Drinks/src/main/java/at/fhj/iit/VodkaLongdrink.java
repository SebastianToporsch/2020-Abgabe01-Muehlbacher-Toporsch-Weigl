package at.fhj.iit;

/**
 * VodkaLongdrink is a class, that extends VodkaDrink.
 * It represents a longdrink that is based on vodka.
 *
 * @author Tobias Weigl
 * @version %I%, %G%
 */
public class VodkaLongdrink extends VodkaDrink{

    /**
     * Creates new longdrink with given name and liquids.
     * Mixes the two given liquids into a new one.
     * An exception can occur when vodka and filler have a volume of 0, because of a division by 0.
     *
     * @param name name of the drink
     * @param vodka represents the vodka part of the longdrink
     * @param filler represents the filler part of the longdrink
     */
    public VodkaLongdrink(String name, Liquid vodka, Liquid filler){
        super(name, new Liquid(name, vodka.getVolume()+filler.getVolume(),
                (vodka.getAlcoholPercent() * vodka.getVolume())/(vodka.getVolume()+filler.getVolume())));
    }
}
