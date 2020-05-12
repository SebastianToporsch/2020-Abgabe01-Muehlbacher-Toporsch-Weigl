# Software Configuration Managment Exercise 01

In this exercise we learned how to work with Github and how to effectively commit and push. Especially when it comes to working together on a Java project. At first we distributed the rolls and talked about what classes and subclasses we should implement.
We agreed on the following classes:

## VodkaDrink

### This class should:
- Calculate and return the effect of several vodka drinks on the
human body, given size, weight, gender and duration of intake, assuming that the drinks
were taken in continuously over that duration of time.

#### It has the following sublclasses:
 1. **VodkaLongDrink**:

    Creates a drink that represents a LongDrink containing Vodka.

 2. **VodkaShot**:

    Creates a Shot that is pure Vodka.

### Most impprtant code snippet:

```Vodka

Formula used to calculate percentage of alcohol in the blood

double alcoholBloodPercentage = (gramsOfAlcohol/((weight*1000) * ((gender==Gender.MALE)?0.68:0.55)))*100;
       alcoholBloodPercentage -= (gender==Gender.MALE)?0.015*(time/60):0.013*(time/60);

```

## CocktailDrink

### This class should:
- Calculate how many calories a given cocktail contains based on the amount of ingredients it contains.

- Task 2

#### It has the following sublclasses:
 1. **PinaColada**:

    Creates a Pina Colada with lemonJuice, coconutCream, whippedCream, rum & pineappleJuice.

 2. **LongIslandIceTea**:

    Creates a Long Island Ice Tea with vodka, tequila, rum, gin, lemonJuice, cola & sugarSyrup

### Most impprtant code snippets:

```Cocktail

Core method getCalories is used to calculate the Calories a given Cocktail(PinaColada or LongIslandIceTea) has

getClories for LongIslandIceTea:
  public double getCalories(){
        return vodka*21.7 + tequila*21.3 + rum*22.0 + gin*24.7 + lemonJuice*2.6 + cola*4.2 + sugarSyrup*33.6;
    }

getCaloires for PinaColada:
  public double getCalories(){
      return lemonJuice*2.6 + coconutCream*10.6 + whippedCream*34.8 + rum*22.0 + pineappleJuice*5.6;
  }

```

[//]: # (1. Numbered)
[//]: # (2. List)

[//]: # (**Bold** and _Italic_ and `Code` text)
