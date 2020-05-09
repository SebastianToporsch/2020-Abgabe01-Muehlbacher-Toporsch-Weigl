package at.fhj.iit;

public class LongIslandIceTea extends CocktailDrink{

    /**
     * amount of vodka in centiliter
     */
    private double vodka = 4.0;

    /**
     * amount of tequila in centiliter
     */
    private double tequila = 2.0;

    /**
     * amount of rum in centiliter
     */
    private double rum = 2.0;

    /**
     * amount of gin in centiliter
     */
    private double gin = 2.0;

    /**
     * amount of lemon juice in centiliter
     */
    private double lemonJuice = 3.0;

    /**
     * amount of cola in centiliter
     */
    private double cola = 4.4;

    /**
     * amount of sugar syrup in centiliter
     */
    private double sugarSyrup = 1.0;

    /**
     * Creates a LongIslandIceTea object with given name and the amount of all the ingredients
     *
     * @param name name of the cocktail
     * @param vodka amount of vodka in the cocktail
     * @param tequila amount of tequila in the cocktail
     * @param rum amount of rum in the cocktail
     * @param gin amount of gin in the cocktail
     * @param lemonJuice amount of lemon juice in the cocktail
     * @param cola amount of cola in the cocktail
     * @param sugarSyrup amount of sugar syrup in the cocktail
     *
     */
    public LongIslandIceTea(String name, double vodka, double tequila, double rum, double gin, double lemonJuice, double cola, double sugarSyrup) {

        super(name);

        try{
            this.vodka = Math.abs(vodka);
            this.tequila = Math.abs(tequila);
            this.rum = Math.abs(rum);
            this.gin = Math.abs(gin);
            this.lemonJuice = Math.abs(lemonJuice);
            this.cola = Math.abs(cola);
            this.sugarSyrup = Math.abs(sugarSyrup);
        } catch (IllegalArgumentException ie){
            System.out.println("Use double for ingredients please!");
        }

    }

    /**
     * Creates a LongIslandIceTea with its usual ingredients
     */
    public LongIslandIceTea(){
        super("Long Island Ice Tea");
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    public double getVolume() {
        return vodka + tequila + rum + gin + lemonJuice + cola + sugarSyrup;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    public double getAlcoholPercent() {

        if (isAlcoholic()){
            try {
                return (40*vodka + 38*tequila + 40*rum + 47*gin) / getVolume();
            } catch (ArithmeticException ae){
                return 0;
            }
        }

        return 0;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    public boolean isAlcoholic() {
        return vodka > 0.0 || tequila > 0.0 || rum > 0.0 || gin > 0.0;
    }

    /**
     * Calculates and returns calories of drink
     *
     * @return the calories of drink
     */
    public double getCalories(){
        return vodka*21.7 + tequila*21.3 + rum*22.0 + gin*24.7 + lemonJuice*2.6 + cola*4.2 + sugarSyrup*33.6;
    }
}
