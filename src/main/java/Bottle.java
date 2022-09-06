public class Bottle {
    private int volume;

    public Bottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int remove10() {
        int newVolume = this.volume - 10;
        this.volume = newVolume;
        return this.volume;
    }

    public int emptyBottle(){
    this.volume = 0;
    return this.volume;
    }

    public int fill() {
        this.volume = 100;
        return this.volume;
    }

}
