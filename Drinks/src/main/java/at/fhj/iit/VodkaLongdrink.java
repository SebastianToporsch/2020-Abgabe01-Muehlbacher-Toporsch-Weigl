package at.fhj.iit;

/**
 * VodkaLongdrink is a class, that extends VodkaDrink.
 * It represents a longdrink that is based on vodka and one other liquid.
 *
 * @author Tobias Weigl
 * @version %I%, %G%
 */
public class VodkaLongdrink extends VodkaDrink{

    /**
     * Mixes two liquids and returns the new liquid.
     *
     * @param name name of the new liquid.
     * @param vodka represents the vodka part of the drink.
     * @param filler represents the filler part of the drink.
     * @return new Liquid, that is a mix of vodka and filler.
     */
    public static Liquid createMix(String name, VodkaShot vodka, Liquid filler){
        if(vodka.getVolume()+filler.getVolume() < 0.0001){
            throw new ArithmeticException("Drinks have to have a volume");
        }
        return new Liquid(name, vodka.getVolume()+filler.getVolume(),
                (vodka.getAlcoholPercent() * vodka.getVolume())/(vodka.getVolume()+filler.getVolume()));
    }
    /**
     * Creates new longdrink with given name and liquid.
     *
     * @param name name of the drink
     * @param mix Liquid that is made out of vodka and another liquid.
     */
    public VodkaLongdrink(String name, Liquid mix){
        super(name, mix);
    }
}
