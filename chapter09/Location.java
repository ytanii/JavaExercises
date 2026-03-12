public class Location {

    public int row;
    public int column;
    public double maxValue;


    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;

    }

    public static Location locateLargest(double[][] a) {
        int maxIndexRow = 0;
        int maxIndexColumn = 0;
        double maxValue = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (maxValue < a[i][j]) {
                    maxValue = a[i][j];
                    maxIndexRow = i;
                    maxIndexColumn = j;
                }
            }
        }

        return new Location(maxIndexRow, maxIndexColumn,maxValue);
    }
}
