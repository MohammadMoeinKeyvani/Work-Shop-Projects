public class Branch2 extends MainStore {
    private int numberOfVegetable;
    private int numberOfApple;
    private int numberOfRice;
    private int numberOfWheat;
    private int numberOfWrench;
    private int numberOfCutter;

    ////////////////////////// constructor
    public Branch2 () {
        numberOfVegetable = 0;
        numberOfApple = 0;
        numberOfRice = 0;
        numberOfWheat = 0;
        numberOfWrench = 0;
        numberOfCutter = 0;
    }

    ////////////////////////// setters & getters
    public int getNumberOfVegetable() {
        return numberOfVegetable;
    }

    public void setNumberOfVegetable(int numberOfVegetable) {
        this.numberOfVegetable = numberOfVegetable;
    }

    public int getNumberOfApple() {
        return numberOfApple;
    }

    public void setNumberOfApple(int numberOfApple) {
        this.numberOfApple = numberOfApple;
    }

    public int getNumberOfRice() {
        return numberOfRice;
    }

    public void setNumberOfRice(int numberOfRice) {
        this.numberOfRice = numberOfRice;
    }

    public int getNumberOfWheat() {
        return numberOfWheat;
    }

    public void setNumberOfWheat(int numberOfWheat) {
        this.numberOfWheat = numberOfWheat;
    }

    public int getNumberOfWrench() {
        return numberOfWrench;
    }

    public void setNumberOfWrench(int numberOfWrench) {
        this.numberOfWrench = numberOfWrench;
    }

    public int getNumberOfCutter() {
        return numberOfCutter;
    }

    public void setNumberOfCutter(int numberOfCutter) {
        this.numberOfCutter = numberOfCutter;
    }
}
