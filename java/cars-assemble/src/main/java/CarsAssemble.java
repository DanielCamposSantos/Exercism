public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double succesRate = 0;
        double production = speed * 221;
        if (speed >= 1 && speed <= 4){
            succesRate = 1;
        } else if (speed >= 5 && speed <= 8){
            succesRate = 0.9;
        }else if (speed == 9 ){
            succesRate = 0.8;
        }else if (speed == 10){
            succesRate = 0.77;
        }
        return  production * succesRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
