package Q3;

/**
 * Created by David on 1/22/2017.
 */
public class TemperatureGrid {
    private double[][] temps;

    public TemperatureGrid(double[][] grid) {
        temps = grid;
    }

    public static void main(String[] args) {
        TemperatureGrid temps = new TemperatureGrid(new double[][]{{95.5, 100.0, 100.0, 100.0, 100.0, 110.3},
                                                                    {0.0, 50.0, 50, 50, 50, 0},
                                                                    {0, 40, 40, 40, 40, 0},
                                                                    {0, 20, 20, 20, 20, 0},
                                                                    {0, 0, 0, 0, 0, 0}});
        System.out.println(temps);
        boolean within = temps.updateAllTemps(0.01);
        System.out.println(temps);
        System.out.println(within);
    }

    public String toString() {
        String res = "";
        for (int row = 0; row < temps.length; row++) {
            for (int col = 0; col < temps[0].length; col++) {
                res += temps[row][col] + " ";
            }
            res += "\n";
        }
        return res;
    }



    private double computeTemp(int row, int col) {
        // if we're on the border
        if (row == 0 || col == 0 || row == temps.length - 1 || col == temps[0].length - 1) {
            return temps[row][col];
        }
        return (temps[row - 1][col] + temps[row + 1][col] + temps[row][col - 1] + temps[row][col + 1]) / 4;
    }

    public boolean updateAllTemps(double tolerance) {
        boolean withinTol = true;
        //constructs new grid to hold the new temperatures
        double[][] arr = new double[temps.length][temps[0].length];
        for (int i = 0; i < temps.length; i++) {
            for (int j = 0; j < temps[0].length; j++) {
                arr[i][j] = computeTemp(i, j);
                if (Math.abs(arr[i][j] - temps[i][j]) > tolerance) {
                    withinTol = false;
                }
            }
        }
        //updates the instance variable to point at the new temperature grid
        temps = arr;
        return withinTol;
    }










    /*
    private double computeTemp(int row, int col) {
        if (row > 0 && col > 0 && row < temps.length - 1 && col < temps[0].length - 1) {
            return (temps[row - 1][col] + temps[row + 1][col] + temps[row][col - 1] + temps[row][col + 1]) / 4;
        } else {
            return temps[row][col];
        }
    }

    public boolean updateAllTemps(double tolerance) {
        double[][] newGrid = new double[temps.length][temps[0].length];
        boolean res = true;
        for (int row = 0; row < temps.length; row++) {
            for (int col = 0; col < temps[0].length; col++) {
                double newTemp = computeTemp(row, col);
                if (Math.abs(newTemp - temps[row][col]) > tolerance) {
                    res = false;
                }
                newGrid[row][col] = newTemp;
            }
        }
        temps = newGrid;
        return res;
    }
    */

}
