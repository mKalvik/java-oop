package grinder;


import java.time.LocalTime;

public class Grinder {

    private int grindCount = 0;
    private int energySaveMinutes = 0;
    private int firstBeanAmount = 100;
    private int secondBeanAmount = 0;
    private boolean inEnergySaveMode = false;

    Grinder(LocalTime time) {
    }

    public static Grinder getGrinderOf(LocalTime time) {
        int timeMinutes = time.getMinute() + time.getHour() * 60;
        int early = 7 * 60;
        int late = 10 * 60 + 30;
        if (timeMinutes > early && timeMinutes < late) {
            return new EspressoGrinder(time);
        } else {
            return new Grinder(time);
        }
    }

    public double grind() throws GrinderNotCleanException {
        inEnergySaveMode = false;
        increaseGrindCount();
//        clean();
        checkIfGrinderClean();

        return 1.0;
    }

    private void checkIfGrinderClean() throws GrinderNotCleanException {

        if (grindCount >= 3) {
            throw new GrinderNotCleanException("Need cleaning!");
        }
    }

    private int increaseGrindCount() {
        return grindCount++;
    }

    public int getGrindCount() {
        return grindCount;
    }

    void clean() {
        if (grindCount == 3) {
            grindCount = 0;
        }
    }

    void setToEnergySaveMode(int minutes) throws IllegalArgumentException {
        if (minutes < 1 || minutes > 60) {
            throw new IllegalArgumentException();
        } else {
            inEnergySaveMode = true;
            energySaveMinutes = minutes;
        }
    }

    private boolean checkIfInEnergySaveMode() {
        return inEnergySaveMode;
    }

    private void exitEnergySaveMode() {
        inEnergySaveMode = false;
    }

    public void setBeanAmounts(int firstBeanAmount, int secondBeanAmount) throws IllegalArgumentException {

        if (firstBeanAmount + secondBeanAmount == 100) {
            this.firstBeanAmount = 100 - secondBeanAmount;
            this.secondBeanAmount = 100 - firstBeanAmount;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getBeansFromFirstContainer(){
        return firstBeanAmount;
    }

    public int getBeansFromSecondContainer(){
        return secondBeanAmount;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Grinder) {
            Grinder otherGrinder = (Grinder) other;
            return this.grindCount == otherGrinder.grindCount;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        // repeat this for every field!
        hashCode = 31 * hashCode + grindCount;
        return hashCode;
    }

}
