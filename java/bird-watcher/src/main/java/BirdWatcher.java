import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }


    public static void main(String[] args) {
        BirdWatcher birdWatcher = new BirdWatcher(new int[]{2, 5, 0, 7, 4, 1});


        System.out.println(Arrays.toString(birdWatcher.getLastWeek()));

        System.out.println("HOJE = " + birdWatcher.getToday());

        System.out.println("AUMENTANDO HOJE");
        birdWatcher.incrementTodaysCount();

        System.out.println("HOJE = " + birdWatcher.getToday());


        System.out.println("DIAS SEM PASSAROS = " + birdWatcher.hasDayWithoutBirds());

        System.out.println();

    }


    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
       for(int birdsPerDay : birdsPerDay){
           if (birdsPerDay == 0){
               return true;
           }
       }
       return false;

    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdCount = 0;
        for (int i = 0; i < numberOfDays; i++) {
            birdCount += birdsPerDay[i];
        }
        return birdCount;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int birdsPerDay : birdsPerDay ) {
            if (birdsPerDay >= 5){
                busyDays++;
            }
        }
        return busyDays;
    }
}
