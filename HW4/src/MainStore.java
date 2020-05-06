public class MainStore extends Asnaf {
    private int numberOfPasta;
    private int numberOfOil;
    private int numberOfEgg;
    private int numberOfMeat;
    private int numberOfMilk;
    private int numberOfIceCream;
    private int numberOfSoda;
    private int numberOfCoffee;
    private int numberOfSnacks;
    private int numberOfChips;

    ////////////////////////// constructor
    public MainStore () {
        numberOfPasta = 0;
        numberOfOil = 0;
        numberOfEgg = 0;
        numberOfMeat = 0;
        numberOfMilk = 0;
        numberOfIceCream = 0;
        numberOfSoda = 0;
        numberOfCoffee = 0;
        numberOfSnacks = 0;
        numberOfChips = 0;
    }

    ////////////////////////// setters & getters
    public int getNumberOfPasta() {
        return numberOfPasta;
    }

    public void setNumberOfPasta(int numberOfPasta) {
        this.numberOfPasta = numberOfPasta;
    }

    public int getNumberOfOil() {
        return numberOfOil;
    }

    public void setNumberOfOil(int numberOfOil) {
        this.numberOfOil = numberOfOil;
    }

    public int getNumberOfEgg() {
        return numberOfEgg;
    }

    public void setNumberOfEgg(int numberOfEgg) {
        this.numberOfEgg = numberOfEgg;
    }

    public int getNumberOfMeat() {
        return numberOfMeat;
    }

    public void setNumberOfMeat(int numberOfMeat) {
        this.numberOfMeat = numberOfMeat;
    }

    public int getNumberOfMilk() {
        return numberOfMilk;
    }

    public void setNumberOfMilk(int numberOfMilk) {
        this.numberOfMilk = numberOfMilk;
    }

    public int getNumberOfIceCream() {
        return numberOfIceCream;
    }

    public void setNumberOfIceCream(int numberOfIceCream) {
        this.numberOfIceCream = numberOfIceCream;
    }

    public int getNumberOfSoda() {
        return numberOfSoda;
    }

    public void setNumberOfSoda(int numberOfSoda) {
        this.numberOfSoda = numberOfSoda;
    }

    public int getNumberOfCoffee() {
        return numberOfCoffee;
    }

    public void setNumberOfCoffee(int numberOfCoffee) {
        this.numberOfCoffee = numberOfCoffee;
    }

    public int getNumberOfSnacks() {
        return numberOfSnacks;
    }

    public void setNumberOfSnacks(int numberOfSnacks) {
        this.numberOfSnacks = numberOfSnacks;
    }

    public int getNumberOfChips() {
        return numberOfChips;
    }

    public void setNumberOfChips(int numberOfChips) {
        this.numberOfChips = numberOfChips;
    }
}
