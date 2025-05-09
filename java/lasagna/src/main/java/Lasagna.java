public class Lasagna {

    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int currentTimeInMinutesInTheOven){
        return expectedMinutesInOven() - currentTimeInMinutesInTheOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers){
        return 2 * numberOfLayers;
    }

    public int totalTimeInMinutes(int numberOfLayers,int currentTimeInMinutesInTheOven){
        return preparationTimeInMinutes(numberOfLayers) + currentTimeInMinutesInTheOven;
    }

}
