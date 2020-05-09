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
     * represents vodka in longdrink
     */
    private Liquid vodka;
    /**
     * represents filler in longdrink
     */
    private Liquid filler;

    /**
     * Creates new longdrink with given name and liquids.
     * Mixes the two given liquids into a new one.
     *
     * @param name name of the drink
     * @param vodka represents the vodka part of the longdrink
     * @param filler represents the filler part of the longdrink
     */
    public VodkaLongdrink(String name, Liquid vodka, Liquid filler){
        super(name, new Liquid(name, vodka.getVolume()+filler.getVolume(),
                (vodka.getAlcoholPercent() * vodka.getVolume())/(vodka.getVolume()+filler.getVolume())));
        this.vodka = vodka;
        this.filler = filler;
    }
}
