package library;

public class Dvd extends Item{
    int duration;

    public Dvd(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return String.format(
                "Dvd [duration=%s]",
                this.duration);
    }
}
