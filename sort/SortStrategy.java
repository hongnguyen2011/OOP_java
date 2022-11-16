package sort;

public class SortStrategy {
    private static SortStrategy instance;

    private ISort sortee;

    private SortStrategy() {}


    public static SortStrategy getInstance() {
        instance = new SortStrategy();
        return instance;
    }


    public void setSortee(ISort sortee) {
        this.sortee = sortee;
    }

    public int sort(int[] data) {
        return sortee.sort(data);
    }

}
