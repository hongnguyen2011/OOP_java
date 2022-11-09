package library;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public long difDay(Rent r) {
        // find different day between begin rent and end rent
        // convert miliseconds
        long startDay = r.getBegin().getTime();
        long endDay = r.getEnd().getTime();

        long temp = (endDay - startDay) / (24 * 60 * 60 * 1000);

        return temp;
    }
    public Rent getLongestRent() {

        int[] arr = new int[rents.length];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = (int) difDay(rents[idx]);
        }

        int max = Integer.MIN_VALUE;
        for (int idx = 0; idx < arr.length; idx++) {
            if (max < arr[idx]) {
                max = arr[idx];
            }
        }
        Rent result = null;
        for (Rent r : rents) {
            if (difDay(r) == max) {
                result = r;
            }
        }

        return result;
    }
}
