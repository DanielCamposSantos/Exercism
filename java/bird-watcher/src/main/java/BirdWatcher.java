
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }
    /*
    1. Check what the counts were last week
    For comparison purposes, you always keep a copy of last week's counts nearby, which were: 0, 2, 5, 3, 7, 8 and 4.
    Implement the BirdWatcher.getLastWeek() method that returns last week's counts:

            BirdWatcher.getLastWeek();
// => [0, 2, 5, 3, 7, 8, 4]
    */


    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];

    }




    /*
    2. Check how many birds visited today
    Implement the BirdWatcher.getToday() method to return how many birds visited your garden today. The bird counts are
    ordered by day, with the first element being the count of the oldest day, and the last element being today's count.

    int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };

    BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getToday();
// => 1
    */


    public void incrementTodaysCount() {
        gh000000000000ujuiç
    }


    /*
    3. Increment today's count
    Implement the BirdWatcher.incrementTodaysCount() method to increment today's count:

    int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
    BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
    birdCount.incrementTodaysCount();
    birdCount.getToday();
    // => 2
    */


    public boolean hasDayWithoutBirds() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
    }


    public static void main(String[] args) {
        BirdWatcher birdWatcher = new BirdWatcher(new int[]{2, 5, 0, 7, 4, 1});

    }
}
