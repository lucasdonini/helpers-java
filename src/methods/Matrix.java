package methods;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public static String toString(int[][] m) {
        String s = "";
        for (int[] i : m) {
            s = s.concat(Arrays.toString(i) + "\n");
        }
        return s;
    }

    public static String toString(double[][] m) {
        String s = "";
        for (double[] d : m) {
            s = s.concat(Arrays.toString(d) + "\n");
        }
        return s;
    }

    public static String toString(char[][] m) {
        String s = "";
        for (char[] c : m) {
            s = s.concat(Arrays.toString(c) + "\n");
        }
        return s;
    }

    public static String toString(String[][] m) {
        String s = "";
        for (String[] st : m) {
            s = s.concat(Arrays.toString(st) + "\n");
        }
        return s;
    }

    public static String toString(boolean[][] m) {
        String s = "";
        for (boolean[] b : m) {
            s = s.concat(Arrays.toString(b) + "\n");
        }
        return s;
    }

    public static int[] axisMean(int[][] m, int axis) {
        int[] mean;
        if (axis == 0) {
            mean = new int[m[0].length];
            for (int i = 0; i < m.length; i++) {
                int x = 0;
                for (int j = 0; j < m[i].length; j++) {
                    x += m[i][j];
                }
                mean[i] = x / m[0].length;
            }
        } else if (axis == 1) {
            mean = new int[m.length];
            for (int i = 0; i < m.length; i++) {
                int x = 0;
                for (int[] ints : m) {
                    x += ints[i];
                }
                mean[i] = x / m.length;
            }
        } else {
            throw new IllegalArgumentException();
        }
        return mean;
    }

    public static double[] axisMean(double[][] m, int axis) {
        double[] mean;
        if (axis == 0) {
            mean = new double[m[0].length];
            for (int i = 0; i < m.length; i++) {
                double x = 0;
                for (int j = 0; j < m[i].length; j++) {
                    x += m[i][j];
                }
                mean[i] = x / m[0].length;
            }
        } else if (axis == 1) {
            mean = new double[m.length];
            for (int i = 0; i < m.length; i++) {
                double x = 0;
                for (double[] doubles : m) {
                    x += doubles[i];
                }
                mean[i] = x / m.length;
            }
        } else {
            throw new IllegalArgumentException();
        }
        return mean;
    }

    public static int[] axisSum(int[][] m, int axis) {
        int[] sum;
        if (axis == 0) {
            sum = new int[m[0].length];
            for (int i = 0; i < m.length; i++) {
                int x = 0;
                for (int j = 0; j < m[i].length; j++) {
                    sum[i] += m[i][j];
                }
            }
        } else if (axis == 1) {
            sum = new int[m.length];
            for (int i = 0; i < m.length; i++) {
                int x = 0;
                for (int[] ints : m) {
                    sum[i] += ints[i];
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
        return sum;
    }

    public static double[] axisSum(double[][] m, int axis) {
        double[] sum;
        if (axis == 0) {
            sum = new double[m[0].length];
            for (int i = 0; i < m.length; i++) {
                double x = 0;
                for (int j = 0; j < m[i].length; j++) {
                    sum[i] += m[i][j];
                }
            }
        } else if (axis == 1) {
            sum = new double[m.length];
            for (int i = 0; i < m.length; i++) {
                double x = 0;
                for (double[] ints : m) {
                    sum[i] += ints[i];
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
        return sum;
    }

    public static boolean isSymmetrical(int[][] m) {
        try {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (m[j][i] != m[i][j]) {
                        return false;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }

    public static boolean isSymmetrical(double[][] m) {
        try {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (m[j][i] != m[i][j]) {
                        return false;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }

    public static boolean isDiagonal(int[][] m) {
        try {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (i != j && m[i][j] != 0) {
                        return false;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }

    public static boolean isDiagonal(double[][] m) {
        try {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (i != j && m[i][j] != 0) {
                        return false;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }

    public static boolean isIdentity(int[][] m) {
        try {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (i != j && m[i][j] != 0) {
                        return false;
                    } else if (i == j && m[i][j] != 1) {
                        return false;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }

    public static boolean isIdentity(double[][] m) {
        try {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (i != j && m[i][j] != 0) {
                        return false;
                    } else if (i == j && m[i][j] != 1) {
                        return false;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }

    public static boolean isNull(int[][] m) {
        for (int[] i : m) {
            for (int j : i) {
                if (j != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isNull(double[][] m) {
        for (double[] i : m) {
            for (double j : i) {
                if (j != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] size(int[][] m) {
        return new int[]{m.length, m[0].length};
    }

    public static int[] size(double[][] m) {
        return new int[]{m.length, m[0].length};
    }

    public static int[] size(String[][] m) {
        return new int[]{m.length, m[0].length};
    }

    public static int[] size(char[][] m) {
        return new int[]{m.length, m[0].length};
    }

    public static int[] size(boolean[][] m) {
        return new int[]{m.length, m[0].length};
    }

    public static int[][] sum(int[][] m1, int[][] m2) {
        int[][] r = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                r[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return r;
    }

    public static double[][] sum(double[][] m1, double[][] m2) {
        double[][] r = new double[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                r[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return r;
    }

    public static int[][] sumAll(int[][][] m) {
        int[][] r = new int[m[0].length][m[0][0].length];
        for (int[][] i : m) {
            r = sum(r, i);
        }
        return r;
    }

    public static double[][] sumAll(double[][][] m) {
        double[][] r = new double[m[0].length][m[0][0].length];
        for (double[][] i : m) {
            r = sum(r, i);
        }
        return r;
    }

    public static double[][] random() {
        Random rand = new Random();
        double[][] m = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = rand.nextDouble(100);
            }
        }
        return m;
    }

    public static double[][] random(int[] size) {
        Random rand = new Random();
        double[][] m = new double[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            for (int j = 0; j < size[1]; j++) {
                m[i][j] = rand.nextDouble(100);
            }
        }
        return m;
    }

    public static double[][] random(double bound) {
        Random rand = new Random();
        double[][] m = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = rand.nextDouble(bound);
            }
        }
        return m;
    }

    public static double[][] random(double origin, double bound) {
        Random rand = new Random();
        double[][] m = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = rand.nextDouble(origin, bound);
            }
        }
        return m;
    }

    public static double[][] random(int[] size, double bound) {
        Random rand = new Random();
        double[][] m = new double[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            for (int j = 0; j < size[1]; j++) {
                m[i][j] = rand.nextDouble(bound);
            }
        }
        return m;
    }

    public static double[][] random(int[] size, double origin, double bound) {
        Random rand = new Random();
        double[][] m = new double[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            for (int j = 0; j < size[1]; j++) {
                m[i][j] = rand.nextDouble(origin, bound);
            }
        }
        return m;
    }

    public static int[][] trunc(double[][] m) {
        int[][] r = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = (int) m[i][j];
            }
        }
        return r;
    }

    public static int[][] round(double[][] m) {
        int[][] r = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = (int) Math.round(m[i][j]);
            }
        }
        return r;
    }

    public static double[][] round(double[][] m, int dp) {
        double[][] r = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = Math.round(m[i][j]*Math.pow(10, dp)) / Math.pow(10, dp);
            }
        }
        return r;
    }

    public static int[][] ceil(double[][] m) {
        int[][] r = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = (int) Math.ceil(m[i][j]);
            }
        }
        return r;
    }

    public static int[][] abs(int[][] m) {
        int[][] r = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = Math.abs(m[i][j]);
            }
        }
        return r;
    }

    public static double[][] abs(double[][] m) {
        double[][] r = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = Math.abs(m[i][j]);
            }
        }
        return r;
    }

    public static int[][] transpose(int[][] m) {
        int[][] r = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = m[j][i];
            }
        }
        return r;
    }

    public static double[][] transpose(double[][] m) {
        double[][] r = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = m[j][i];
            }
        }
        return r;
    }

    public static String[][] transpose(String[][] m) {
        String[][] r = new String[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = m[j][i];
            }
        }
        return r;
    }

    public static char[][] transpose(char[][] m) {
        char[][] r = new char[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = m[j][i];
            }
        }
        return r;
    }

    public static int[][] prod(int[][] m, double d) {
        int[][] r = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                r[i][j] = (int) (m[i][j] * d);
            }
        }
        return r;
    }

    public static double[][] prod(double[][] m, double d) {
        double[][] r = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                r[i][j] = m[i][j] * d;
            }
        }
        return r;
    }

    public static int[][] prod(int[][] m, int[][] n) {
        int[][] mn = new int[m.length][n[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < n.length; k++) {
                    sum += m[i][k] * n[k][j];
                }
                mn[i][j] = sum;
            }
        }
        return mn;

        /* Código Python original
            def prod(m, n):
                # mn[i][j] = m[i][k]*n[k][j] + m[i][k]*n[k][j] + m[i][k]*n[k][j]
                # k =               0        ->       1        ->       2
                produto = [[0, 0], [0, 0]]
                for i in range(len(m)):
                    for j in range(len(n[0])):
                        soma = 0
                        for k in range(len(n)):
                            soma += m[i][k]*n[k][j]
                        produto[i][j] = soma
                return produto


            m = [[1, 2, 3], [4, 5, 6]]
            n = [[7, 8], [9, 10], [11, 12]]
            mn = [[0, 0], [0, 0]]

            mn[0][0] = m[0][0]*n[0][0] + m[0][1]*n[1][0] + m[0][2]*n[2][0]
            mn[0][1] = m[0][0]*n[0][1] + m[0][1]*n[1][1] + m[0][2]*n[2][1]
            mn[1][0] = m[1][0]*n[0][0] + m[1][1]*n[1][0] + m[1][2]*n[2][0]
            mn[1][1] = m[1][0]*n[0][1] + m[1][1]*n[1][1] + m[1][2]*n[2][1]

            print(prod(m, n))
         */
    }

    public static double[][] prod(double[][] m, double[][] n) {
        double[][] mn = new double[m.length][n[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                double sum = 0;
                for (int k = 0; k < n.length; k++) {
                    sum += m[i][k] * n[k][j];
                }
                mn[i][j] = sum;
            }
        }
        return mn;
    }
}
