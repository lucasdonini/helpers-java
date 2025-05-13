package methods;

import java.util.Arrays;

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
}
