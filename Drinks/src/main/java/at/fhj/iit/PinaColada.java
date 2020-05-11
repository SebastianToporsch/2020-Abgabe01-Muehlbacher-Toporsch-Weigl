package at.fhj.iit;

import java.util.ArrayList;

public class PinaColada extends CocktailDrink {

    /**
     * List of all the ingredients
     */
    public ArrayList<Double> ingredients = new ArrayList<Double>();

    /**
     * amount of lemon juice in centiliter
     */
    private double lemonJuice = 2.0;

    /**
     * Getter for lemonJuice
     *
     * @return lemonJuice amount of liquid
     */
    public double getLemonJuice() {
        return lemonJuice;
    }

    /**
     * Setter for lemonJuice
     *
     * @param lemonJuice new name
     */
    public void setLemonJuice(double lemonJuice) {
        this.lemonJuice = lemonJuice;
    }

    /**
     * amount of coconut cream in centiliter
     */
    private double coconutCream = 4.0;

    /**
     * Getter for coconutCream
     *
     * @return coconutCream amount of liquid
     */
    public double getCoconutCream() {
        return coconutCream;
    }

    /**
     * Setter for coconutCream
     *
     * @param coconutCream new name
     */
    public void setCoconutCream(double coconutCream) {
        this.coconutCream = coconutCream;
    }

    /**
     * amount of whipped cream in centiliter
     */
    private double whippedCream = 2.0;

    /**
     * Getter for whippedCream
     *
     * @return whippedCream amount of liquid
     */
    public double getWhippedCream() {
        return whippedCream;
    }

    /**
     * Setter for whippedCream
     *
     * @param whippedCream new name
     */
    public void setWhippedCream(double whippedCream) {
        this.whippedCream = whippedCream;
    }

    /**
     * amount of rum in centiliter
     */
    private double rum = 6.0;

    /**
     * Getter for rum
     *
     * @return rum amount of liquid
     */
    public double getRum() {
        return rum;
    }

    /**
     * Setter for rum
     *
     * @param rum new name
     */
    public void setRum(double rum) {
        this.rum = rum;
    }

    /**
     * amount of pineapple juice in centiliter
     */
    private double pineappleJuice = 8.0;

    /**
     * Getter for pineappleJuice
     *
     * @return pineappleJuice amount of liquid
     */
    public double getPineappleJuice() {
        return pineappleJuice;
    }

    /**
     * Setter for pineappleJuice
     *
     * @param pineappleJuice new name
     */
    public void setPineappleJuice(double pineappleJuice) {
        this.pineappleJuice = pineappleJuice;
    }

    /**
     * Creates a PinaColada object with given name and the amount of all the ingredients
     *
     * @param name name of the cocktail
     * @param lemonJuice amount of lemon juice in the cocktail
     * @param coconutCream amount of coconut cream in the cocktail
     * @param whippedCream amount of whipped cream in the cocktail
     * @param rum amount of rum in the cocktail
     * @param pineappleJuice amount of pineapple juice in the cocktail
     *
     */
    public PinaColada(String name, double lemonJuice, double coconutCream, double whippedCream, double rum, double pineappleJuice) {

        super(name);

        try{
            this.lemonJuice = Math.abs(lemonJuice);
            this.coconutCream = Math.abs(coconutCream);
            this.whippedCream = Math.abs(whippedCream);
            this.rum = Math.abs(rum);
            this.pineappleJuice = Math.abs(pineappleJuice);
        } catch (IllegalArgumentException ie){
            System.out.println("Use double for ingredients please!");
        }

        ingredients.add(lemonJuice);
        ingredients.add(coconutCream);
        ingredients.add(whippedCream);
        ingredients.add(rum);
        ingredients.add(pineappleJuice);
    }

    /**
     * Creates a PinaColada with its usual ingredients
     */
    public PinaColada(){
        super("Piña Colada");
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in centiliter
     */
    public double getVolume() {
        return super.getVolume(this);
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    public double getAlcoholPercent() {

        if (isAlcoholic()){
            try {
                return 40*rum / getVolume();
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
        return rum > 0.0;
    }

    /**
     * Calculates and returns calories of drink
     *
     * @return the calories of drink
     */
    public double getCalories(){
        return lemonJuice*2.6 + coconutCream*10.6 + whippedCream*34.8 + rum*22.0 + pineappleJuice*5.6;
    }
}
