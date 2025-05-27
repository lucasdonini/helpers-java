package methods;

import java.util.Arrays;
import java.util.Random;

/**
 * Classe utilitária para operações com matrizes.
 * 
 * Esta classe fornece métodos para manipulação de matrizes bidimensionais,
 * incluindo operações de impressão, operações aritméticas, verificação de propriedades
 * e geração de matrizes aleatórias.
 * 
 * As operações são suportadas para vários tipos de dados, incluindo int, double,
 * char, String e boolean.
 */
public class Matrix {
    /**
     * Seção de métodos para impressão de matrizes
     */

    /**
     * Converte uma matriz de inteiros em uma representação de string.
     * 
     * @param m A matriz de inteiros a ser convertida
     * @return Uma string representando a matriz, com cada linha em uma nova linha
     */
    public static String toString(int[][] m) {
        String s = "";
        for (int[] i : m) {
            s = s.concat(Arrays.toString(i) + "\n");
        }
        return s;
    }
    /**
     * Converte uma matriz de números de ponto flutuante em uma representação de string.
     * 
     * @param m A matriz de doubles a ser convertida
     * @return Uma string representando a matriz, com cada linha em uma nova linha
     */
    public static String toString(double[][] m) {
        String s = "";
        for (double[] d : m) {
            s = s.concat(Arrays.toString(d) + "\n");
        }
        return s;
    }

    /**
     * Converte uma matriz de caracteres em uma representação de string.
     * 
     * @param m A matriz de caracteres a ser convertida
     * @return Uma string representando a matriz, com cada linha em uma nova linha
     */
    public static String toString(char[][] m) {
        String s = "";
        for (char[] c : m) {
            s = s.concat(Arrays.toString(c) + "\n");
        }
        return s;
    }

    /**
     * Converte uma matriz de strings em uma representação de string.
     * 
     * @param m A matriz de strings a ser convertida
     * @return Uma string representando a matriz, com cada linha em uma nova linha
     */
    public static String toString(String[][] m) {
        String s = "";
        for (String[] st : m) {
            s = s.concat(Arrays.toString(st) + "\n");
        }
        return s;
    }

    /**
     * Converte uma matriz de booleanos em uma representação de string.
     * 
     * @param m A matriz de booleanos a ser convertida
     * @return Uma string representando a matriz, com cada linha em uma nova linha
     */
    public static String toString(boolean[][] m) {
        String s = "";
        for (boolean[] b : m) {
            s = s.concat(Arrays.toString(b) + "\n");
        }
        return s;
    }


    /**
     * Seção de métodos para operações aritméticas com matrizes
     */

    /**
     * Calcula a média dos elementos ao longo de um eixo específico em uma matriz de inteiros.
     * 
     * @param m A matriz de inteiros
     * @param axis O eixo ao longo do qual calcular a média (0 para linhas, 1 para colunas)
     * @return Um array contendo as médias calculadas
     * @throws IllegalArgumentException Se o eixo especificado não for 0 ou 1
     */
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
    /**
     * Calcula a média dos elementos ao longo de um eixo específico em uma matriz de números de ponto flutuante.
     * 
     * @param m A matriz de doubles
     * @param axis O eixo ao longo do qual calcular a média (0 para linhas, 1 para colunas)
     * @return Um array contendo as médias calculadas
     * @throws IllegalArgumentException Se o eixo especificado não for 0 ou 1
     */
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
    /**
     * Calcula a soma dos elementos ao longo de um eixo específico em uma matriz de inteiros.
     * 
     * @param m A matriz de inteiros
     * @param axis O eixo ao longo do qual calcular a soma (0 para linhas, 1 para colunas)
     * @return Um array contendo as somas calculadas
     * @throws IllegalArgumentException Se o eixo especificado não for 0 ou 1
     */
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
    /**
     * Calcula a soma dos elementos ao longo de um eixo específico em uma matriz de números de ponto flutuante.
     * 
     * @param m A matriz de doubles
     * @param axis O eixo ao longo do qual calcular a soma (0 para linhas, 1 para colunas)
     * @return Um array contendo as somas calculadas
     * @throws IllegalArgumentException Se o eixo especificado não for 0 ou 1
     */
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
    /**
     * Soma duas matrizes de inteiros elemento por elemento.
     * 
     * @param m1 A primeira matriz de inteiros
     * @param m2 A segunda matriz de inteiros
     * @return Uma nova matriz contendo a soma das duas matrizes de entrada
     */
    public static int[][] sum(int[][] m1, int[][] m2) {
        int[][] r = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                r[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return r;
    }
    /**
     * Soma duas matrizes de números de ponto flutuante elemento por elemento.
     * 
     * @param m1 A primeira matriz de doubles
     * @param m2 A segunda matriz de doubles
     * @return Uma nova matriz contendo a soma das duas matrizes de entrada
     */
    public static double[][] sum(double[][] m1, double[][] m2) {
        double[][] r = new double[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                r[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return r;
    }
    /**
     * Soma todas as matrizes de inteiros em um array tridimensional.
     * 
     * @param m Um array tridimensional de matrizes de inteiros
     * @return Uma matriz bidimensional contendo a soma de todas as matrizes
     */
    public static int[][] sumAll(int[][][] m) {
        int[][] r = new int[m[0].length][m[0][0].length];
        for (int[][] i : m) {
            r = sum(r, i);
        }
        return r;
    }
    /**
     * Soma todas as matrizes de números de ponto flutuante em um array tridimensional.
     * 
     * @param m Um array tridimensional de matrizes de doubles
     * @return Uma matriz bidimensional contendo a soma de todas as matrizes
     */
    public static double[][] sumAll(double[][][] m) {
        double[][] r = new double[m[0].length][m[0][0].length];
        for (double[][] i : m) {
            r = sum(r, i);
        }
        return r;
    }
    /**
     * Trunca os valores de uma matriz de números de ponto flutuante para inteiros.
     * 
     * @param m A matriz de doubles a ser truncada
     * @return Uma matriz de inteiros com os valores truncados
     */
    public static int[][] trunc(double[][] m) {
        int[][] r = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = (int) m[i][j];
            }
        }
        return r;
    }
    /**
     * Arredonda os valores de uma matriz de números de ponto flutuante para inteiros.
     * 
     * @param m A matriz de doubles a ser arredondada
     * @return Uma matriz de inteiros com os valores arredondados
     */
    public static int[][] round(double[][] m) {
        int[][] r = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = (int) Math.round(m[i][j]);
            }
        }
        return r;
    }
    /**
     * Arredonda os valores de uma matriz de números de ponto flutuante para um número específico de casas decimais.
     * 
     * @param m A matriz de doubles a ser arredondada
     * @param dp O número de casas decimais para arredondar
     * @return Uma matriz de doubles com os valores arredondados para o número especificado de casas decimais
     */
    public static double[][] round(double[][] m, int dp) {
        double[][] r = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = Math.round(m[i][j] * Math.pow(10, dp)) / Math.pow(10, dp);
            }
        }
        return r;
    }
    /**
     * Arredonda para cima os valores de uma matriz de números de ponto flutuante para inteiros.
     * 
     * @param m A matriz de doubles a ser arredondada para cima
     * @return Uma matriz de inteiros com os valores arredondados para cima
     */
    public static int[][] ceil(double[][] m) {
        int[][] r = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = (int) Math.ceil(m[i][j]);
            }
        }
        return r;
    }
    /**
     * Calcula o valor absoluto de cada elemento em uma matriz de inteiros.
     * 
     * @param m A matriz de inteiros
     * @return Uma nova matriz contendo o valor absoluto de cada elemento da matriz original
     */
    public static int[][] abs(int[][] m) {
        int[][] r = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = Math.abs(m[i][j]);
            }
        }
        return r;
    }
    /**
     * Calcula o valor absoluto de cada elemento em uma matriz de números de ponto flutuante.
     * 
     * @param m A matriz de doubles
     * @return Uma nova matriz contendo o valor absoluto de cada elemento da matriz original
     */
    public static double[][] abs(double[][] m) {
        double[][] r = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = Math.abs(m[i][j]);
            }
        }
        return r;
    }
    /**
     * Calcula a transposta de uma matriz de inteiros.
     * 
     * @param m A matriz de inteiros a ser transposta
     * @return A matriz transposta
     */
    public static int[][] transpose(int[][] m) {
        int[][] r = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = m[j][i];
            }
        }
        return r;
    }
    /**
     * Calcula a transposta de uma matriz de números de ponto flutuante.
     * 
     * @param m A matriz de doubles a ser transposta
     * @return A matriz transposta
     */
    public static double[][] transpose(double[][] m) {
        double[][] r = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = m[j][i];
            }
        }
        return r;
    }
    /**
     * Calcula a transposta de uma matriz de strings.
     * 
     * @param m A matriz de strings a ser transposta
     * @return A matriz transposta
     */
    public static String[][] transpose(String[][] m) {
        String[][] r = new String[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = m[j][i];
            }
        }
        return r;
    }
    /**
     * Calcula a transposta de uma matriz de caracteres.
     * 
     * @param m A matriz de caracteres a ser transposta
     * @return A matriz transposta
     */
    public static char[][] transpose(char[][] m) {
        char[][] r = new char[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                r[i][j] = m[j][i];
            }
        }
        return r;
    }
    /**
     * Multiplica cada elemento de uma matriz de inteiros por um escalar.
     * 
     * @param m A matriz de inteiros
     * @param d O valor escalar pelo qual multiplicar
     * @return Uma nova matriz com cada elemento multiplicado pelo escalar
     */
    public static int[][] prod(int[][] m, double d) {
        int[][] r = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                r[i][j] = (int) (m[i][j] * d);
            }
        }
        return r;
    }
    /**
     * Multiplica cada elemento de uma matriz de números de ponto flutuante por um escalar.
     * 
     * @param m A matriz de doubles
     * @param d O valor escalar pelo qual multiplicar
     * @return Uma nova matriz com cada elemento multiplicado pelo escalar
     */
    public static double[][] prod(double[][] m, double d) {
        double[][] r = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                r[i][j] = m[i][j] * d;
            }
        }
        return r;
    }
    /**
     * Realiza a multiplicação de matrizes de inteiros.
     * 
     * @param m A primeira matriz de inteiros
     * @param n A segunda matriz de inteiros
     * @return O produto das duas matrizes
     */
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
    /**
     * Realiza a multiplicação de matrizes de números de ponto flutuante.
     * 
     * @param m A primeira matriz de doubles
     * @param n A segunda matriz de doubles
     * @return O produto das duas matrizes
     */
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


    /**
     * Seção de métodos para verificação de propriedades de matrizes
     */

    /**
     * Verifica se uma matriz de inteiros é simétrica.
     * Uma matriz é simétrica se for igual à sua transposta (M = M^T).
     * 
     * @param m A matriz de inteiros a ser verificada
     * @return true se a matriz for simétrica, false caso contrário
     */
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
    /**
     * Verifica se uma matriz de números de ponto flutuante é simétrica.
     * Uma matriz é simétrica se for igual à sua transposta (M = M^T).
     * 
     * @param m A matriz de doubles a ser verificada
     * @return true se a matriz for simétrica, false caso contrário
     */
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
    /**
     * Verifica se uma matriz de inteiros é diagonal.
     * Uma matriz é diagonal se todos os elementos fora da diagonal principal são zero.
     * 
     * @param m A matriz de inteiros a ser verificada
     * @return true se a matriz for diagonal, false caso contrário
     */
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
    /**
     * Verifica se uma matriz de números de ponto flutuante é diagonal.
     * Uma matriz é diagonal se todos os elementos fora da diagonal principal são zero.
     * 
     * @param m A matriz de doubles a ser verificada
     * @return true se a matriz for diagonal, false caso contrário
     */
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
    /**
     * Verifica se uma matriz de inteiros é uma matriz identidade.
     * Uma matriz identidade tem 1's na diagonal principal e 0's em todas as outras posições.
     * 
     * @param m A matriz de inteiros a ser verificada
     * @return true se a matriz for uma matriz identidade, false caso contrário
     */
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
    /**
     * Verifica se uma matriz de números de ponto flutuante é uma matriz identidade.
     * Uma matriz identidade tem 1's na diagonal principal e 0's em todas as outras posições.
     * 
     * @param m A matriz de doubles a ser verificada
     * @return true se a matriz for uma matriz identidade, false caso contrário
     */
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
    /**
     * Verifica se uma matriz de inteiros é uma matriz nula.
     * Uma matriz nula tem todos os elementos iguais a zero.
     * 
     * @param m A matriz de inteiros a ser verificada
     * @return true se a matriz for uma matriz nula, false caso contrário
     */
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
    /**
     * Verifica se uma matriz de números de ponto flutuante é uma matriz nula.
     * Uma matriz nula tem todos os elementos iguais a zero.
     * 
     * @param m A matriz de doubles a ser verificada
     * @return true se a matriz for uma matriz nula, false caso contrário
     */
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
    /**
     * Retorna as dimensões de uma matriz de inteiros.
     * 
     * @param m A matriz de inteiros
     * @return Um array de inteiros contendo o número de linhas e colunas da matriz
     */
    public static int[] size(int[][] m) {
        return new int[]{m.length, m[0].length};
    }
    /**
     * Retorna as dimensões de uma matriz de números de ponto flutuante.
     * 
     * @param m A matriz de doubles
     * @return Um array de inteiros contendo o número de linhas e colunas da matriz
     */
    public static int[] size(double[][] m) {
        return new int[]{m.length, m[0].length};
    }

    /**
     * Retorna as dimensões de uma matriz de strings.
     * 
     * @param m A matriz de strings
     * @return Um array de inteiros contendo o número de linhas e colunas da matriz
     */
    public static int[] size(String[][] m) {
        return new int[]{m.length, m[0].length};
    }

    /**
     * Retorna as dimensões de uma matriz de caracteres.
     * 
     * @param m A matriz de caracteres
     * @return Um array de inteiros contendo o número de linhas e colunas da matriz
     */
    public static int[] size(char[][] m) {
        return new int[]{m.length, m[0].length};
    }

    /**
     * Retorna as dimensões de uma matriz de booleanos.
     * 
     * @param m A matriz de booleanos
     * @return Um array de inteiros contendo o número de linhas e colunas da matriz
     */
    public static int[] size(boolean[][] m) {
        return new int[]{m.length, m[0].length};
    }
    /**
     * Verifica se uma matriz de inteiros é quadrada.
     * Uma matriz é quadrada se tiver o mesmo número de linhas e colunas.
     * 
     * @param m A matriz de inteiros a ser verificada
     * @return true se a matriz for quadrada, false caso contrário
     */
    public static boolean isSquare(int[][] m) {
        int[] s = size(m);
        return s[0] == s[1];
    }
    /**
     * Verifica se uma matriz de números de ponto flutuante é quadrada.
     * Uma matriz é quadrada se tiver o mesmo número de linhas e colunas.
     * 
     * @param m A matriz de doubles a ser verificada
     * @return true se a matriz for quadrada, false caso contrário
     */
    public static boolean isSquare(double[][] m) {
        int[] s = size(m);
        return s[0] == s[1];
    }

    /**
     * Verifica se uma matriz de caracteres é quadrada.
     * Uma matriz é quadrada se tiver o mesmo número de linhas e colunas.
     * 
     * @param m A matriz de caracteres a ser verificada
     * @return true se a matriz for quadrada, false caso contrário
     */
    public static boolean isSquare(char[][] m) {
        int[] s = size(m);
        return s[0] == s[1];
    }

    /**
     * Verifica se uma matriz de strings é quadrada.
     * Uma matriz é quadrada se tiver o mesmo número de linhas e colunas.
     * 
     * @param m A matriz de strings a ser verificada
     * @return true se a matriz for quadrada, false caso contrário
     */
    public static boolean isSquare(String[][] m) {
        int[] s = size(m);
        return s[0] == s[1];
    }


    /**
     * Seção de métodos para geração de matrizes aleatórias
     */

    /**
     * Gera uma matriz 3x3 de números de ponto flutuante aleatórios entre 0 e 100.
     * 
     * @return Uma matriz 3x3 de doubles com valores aleatórios
     */
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
    /**
     * Gera uma matriz de números de ponto flutuante aleatórios entre 0 e 100 com dimensões especificadas.
     * 
     * @param size Um array contendo as dimensões da matriz [linhas, colunas]
     * @return Uma matriz de doubles com valores aleatórios e dimensões especificadas
     */
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
    /**
     * Gera uma matriz 3x3 de números de ponto flutuante aleatórios entre 0 e o limite especificado.
     * 
     * @param bound O limite superior (exclusivo) para os valores aleatórios
     * @return Uma matriz 3x3 de doubles com valores aleatórios
     */
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
    /**
     * Gera uma matriz 3x3 de números de ponto flutuante aleatórios entre os limites especificados.
     * 
     * @param origin O limite inferior (inclusivo) para os valores aleatórios
     * @param bound O limite superior (exclusivo) para os valores aleatórios
     * @return Uma matriz 3x3 de doubles com valores aleatórios dentro do intervalo especificado
     */
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
    /**
     * Gera uma matriz de números de ponto flutuante aleatórios entre 0 e o limite especificado, com dimensões personalizadas.
     * 
     * @param size Um array contendo as dimensões da matriz [linhas, colunas]
     * @param bound O limite superior (exclusivo) para os valores aleatórios
     * @return Uma matriz de doubles com valores aleatórios e dimensões especificadas
     */
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
    /**
     * Gera uma matriz de números de ponto flutuante aleatórios entre os limites especificados, com dimensões personalizadas.
     * 
     * @param size Um array contendo as dimensões da matriz [linhas, colunas]
     * @param origin O limite inferior (inclusivo) para os valores aleatórios
     * @param bound O limite superior (exclusivo) para os valores aleatórios
     * @return Uma matriz de doubles com valores aleatórios dentro do intervalo especificado e com dimensões personalizadas
     */
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
    /**
     * Gera uma matriz 3x3 de números inteiros aleatórios entre 0 e 100.
     * 
     * @return Uma matriz 3x3 de inteiros com valores aleatórios
     */
    public static int[][] randInt() {
        Random rand = new Random();
        int[][] m = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = rand.nextInt(100);
            }
        }
        return m;
    }
    /**
     * Gera uma matriz de números inteiros aleatórios entre 0 e 100 com dimensões especificadas.
     * 
     * @param size Um array contendo as dimensões da matriz [linhas, colunas]
     * @return Uma matriz de inteiros com valores aleatórios e dimensões especificadas
     */
    public static int[][] randInt(int[] size) {
        Random rand = new Random();
        int[][] m = new int[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            for (int j = 0; j < size[1]; j++) {
                m[i][j] = rand.nextInt(100);
            }
        }
        return m;
    }
    /**
     * Gera uma matriz 3x3 de números inteiros aleatórios entre 0 e o limite especificado.
     * 
     * @param bound O limite superior (exclusivo) para os valores aleatórios
     * @return Uma matriz 3x3 de inteiros com valores aleatórios
     */
    public static int[][] randInt(int bound) {
        Random rand = new Random();
        int[][] m = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = rand.nextInt(bound);
            }
        }
        return m;
    }
    /**
     * Gera uma matriz 3x3 de números inteiros aleatórios entre os limites especificados.
     * 
     * @param origin O limite inferior (inclusivo) para os valores aleatórios
     * @param bound O limite superior (exclusivo) para os valores aleatórios
     * @return Uma matriz 3x3 de inteiros com valores aleatórios dentro do intervalo especificado
     */
    public static int[][] randInt(int origin, int bound) {
        Random rand = new Random();
        int[][] m = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = rand.nextInt(origin, bound);
            }
        }
        return m;
    }
    /**
     * Gera uma matriz de números inteiros aleatórios entre 0 e o limite especificado, com dimensões personalizadas.
     * 
     * @param size Um array contendo as dimensões da matriz [linhas, colunas]
     * @param bound O limite superior (exclusivo) para os valores aleatórios
     * @return Uma matriz de inteiros com valores aleatórios e dimensões especificadas
     */
    public static int[][] randInt(int[] size, int bound) {
        Random rand = new Random();
        int[][] m = new int[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            for (int j = 0; j < size[1]; j++) {
                m[i][j] = rand.nextInt(bound);
            }
        }
        return m;
    }
    /**
     * Gera uma matriz de números inteiros aleatórios entre os limites especificados, com dimensões personalizadas.
     * 
     * @param size Um array contendo as dimensões da matriz [linhas, colunas]
     * @param origin O limite inferior (inclusivo) para os valores aleatórios
     * @param bound O limite superior (exclusivo) para os valores aleatórios
     * @return Uma matriz de inteiros com valores aleatórios dentro do intervalo especificado e com dimensões personalizadas
     */
    public static int[][] randInt(int[] size, int origin, int bound) {
        Random rand = new Random();
        int[][] m = new int[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            for (int j = 0; j < size[1]; j++) {
                m[i][j] = rand.nextInt(origin, bound);
            }
        }
        return m;
    }
}
