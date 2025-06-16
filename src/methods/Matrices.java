package methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Representa uma matriz de tipo genérico, com n° de linhas, colunas, tipo de dado e um array 2D representando a matriz
 * <p>
 * Esta classe oferece métodos para fazer operações aritméticas entre matrizes (como soma, subtração, multiplicação e divisão)
 * Também oferece métodos de randomização de dados da matriz, verificação de propriedades (como saber se uma matriz é nula ou identidade)
 * conversão de tipo (Double -> Integer) e mais.
 * <p>
 *
 * @param <T> O tipo dos valores armazenados na matriz
 * @author Lucas Kluska Donini
 * @version 2.0.0
 * @since xx/06/2025
 */
public class Matrices<T extends Number> {
    // === ATRIBUTOS ===

    /**
     * Número de linhas da matriz
     */
    private final int rows;

    /**
     * Número de colunas da matriz
     */
    private final int columns;

    /**
     * Tipo de dado da matriz
     */
    private final Class<T> type;

    /**
     * Objeto da classe Random para fazer os métodos de randomização
     */
    private Random rand = new Random();

    /**
     * Array 2D contendo os dados da matriz
     */
    private T[][] data;

    // === CONSTRUTORES ===

    /**
     * Método protegido usado em métodos de fábrica para gerar a matriz
     *
     * @param data    Array 2D contendo os dados da matriz
     * @param rows    Número de linhas da matriz
     * @param columns Número de colunas da matriz
     * @param type    Tipo de dado da matriz
     */
    protected Matrices(T[][] data, int rows, int columns, Class<T> type) {
        this.data = data;
        this.rows = rows;
        this.columns = columns;
        this.type = type;
    }

    // === FÁBRICAS ===

    /**
     * Método público que cria uma matriz inferindo o seu tipo a partir de um do primeiro elemento do array recebido
     *
     * @param data Array 2D com os dados da matriz
     * @param <T>  Tipo de dado dos elementos da matriz
     * @return Matriz com os dados do Array
     * @throws IllegalArgumentException Se o array estiver vazio ou for irregular
     */
    @SuppressWarnings("unchecked")
    public static <T extends Number> Matrices<T> from(T[][] data) {
        if (data.length == 0 || data[0].length == 0 || data[0][0] == null) {
            throw new IllegalArgumentException("Não é possível instanciar de matrizes de arrays vazios");
        }
        if (!isRegular(data)) {
            throw new IllegalArgumentException("A matriz de entrada não é regular");
        }

        Class<T> type = (Class<T>) data[0][0].getClass();

        return new Matrices<>(data, data.length, data[0].length, type);
    }

    /**
     * Retorna uma matriz nula com o número de linhas e colunas especificado
     *
     * @param type Tipo de dado da matriz
     * @param rows Número de linhas
     * @param columns Número de colunas
     * @return A matriz nula
     * @param <T> O tipo de dado da matriz
     * @throws IllegalArgumentException se o número de linhas ou colunas foi <= 0
     */
    @SuppressWarnings("unchecked")
    public static <T extends Number> Matrices<T> nullMatrix(Class<T> type, int rows, int columns) {
        if (Math.max(rows, columns) <= 0) {
            throw new IllegalArgumentException("Não é possível iniciar Matrizes com menos de uma linha/coluna");
        }
        T[][] data = (T[][]) Array.newInstance(type, rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = convert(0, type);
            }
        }
        return new Matrices<>(data, rows, columns, type);
    }

    /**
     * Retorna uma matriz identidade da ordem especificada
     *
     * @param type Tipo de dado da matriz
     * @param order Ordem da matriz identidade
     * @return Matriz identidade
     * @param <T> Tipo de dado da matriz
     * @throws IllegalArgumentException se ordem ≤ 0
     */
    @SuppressWarnings("unchecked")
    public static <T extends Number> Matrices<T> identity(Class<T> type, int order) {
        if (order <= 0) {
            throw new IllegalArgumentException("Não existem matrizes identidades de ordem <= 0");
        }
        T[][] data = (T[][]) Array.newInstance(type, order, order);
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                data[i][j] = convert(i == j ? 1 : 0, type);
            }
        }
        return new Matrices<>(data, order, order, type);
    }

    /**
     * Copia e retorna a cópia da matriz
     *
     * @return A cópia da matriz
     */
    @SuppressWarnings("unchecked")
    public Matrices<T> copy() {
        T[][] data = (T[][]) Array.newInstance(this.type, this.rows, this.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                data[i][j] = this.data[i][j];
            }
        }

        return new Matrices<>(data, this.rows, this.columns, this.type);
    }

    // === MÉTODOS AUXILIARES PROTEGIDOS ===

    /**
     * Método auxiliar para verificar se um array 2D é regular
     *
     * @param m   O array 2D
     * @param <T> Tipo de dado do array
     * @return {@code true} se o array for regular, {@code false} caso contrário
     */
    protected static <T extends Number> boolean isRegular(T[][] m) {
        int cols = m[0].length;
        for (T[] row : m) {
            if (row.length != cols) {
                return false;
            }
        }
        return true;
    }

    /**
     * Converte um valor do tipo {@code Number} para um subtipo específico de {@code Number}.
     *
     * @param <T>   O tipo numérico de destino (ex: {@code Integer}, {@code Double}, etc.).
     * @param value O valor a ser convertido.
     * @param type  A classe do tipo numérico de destino.
     * @return O valor convertido para o tipo especificado.
     * @throws IllegalArgumentException Se o tipo especificado não for suportado.
     */
    @SuppressWarnings("unchecked")
    protected static <T extends Number> T convert(Number value, Class<T> type) {
        if (type == Integer.class) return (T) Integer.valueOf(value.intValue());
        if (type == Double.class) return (T) Double.valueOf(value.doubleValue());
        if (type == Long.class) return (T) Long.valueOf(value.longValue());
        if (type == Float.class) return (T) Float.valueOf(value.floatValue());
        if (type == Short.class) return (T) Short.valueOf(value.shortValue());
        if (type == Byte.class) return (T) Byte.valueOf(value.byteValue());
        throw new IllegalArgumentException("Tipo não suportado: " + type);
    }

    // === GETTERS & SETTERS ===

    /**
     * Retorna o array contendo os dados da matriz
     *
     * @return Os dados da matriz
     */
    public T[][] getData() {
        return data;
    }

    /**
     * Define os dados da matriz
     *
     * @param data Os dados da matriz
     */
    public void setData(T[][] data) {
        this.data = data;
    }

    /**
     * Retorna o número de colunas da matriz
     *
     * @return O número de colunas da matriz
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Retorna o número de linhas da matriz
     *
     * @return O número de linhas da matriz
     */
    public int getRows() {
        return rows;
    }

    /**
     * Retorna o tipo de dado da matriz
     *
     * @return O tipo de dado da matriz
     */
    public Class<T> getType() {
        return type;
    }

    // === toString() ===

    /**
     * Retorna os dados da matriz organizados de forma natural como {@code String}
     *
     * @return A {@code String} com os dados da matriz
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T[] i : data) {
            sb.append(Arrays.toString(i)).append('\n');
        }
        return sb.toString();
    }

    // === RANDOMIZAÇÃO ===

    /**
     * Define uma seed fixa para obter resultados previsíveis na randomização
     *
     * @param seed A seed
     */
    public void setSeed(long seed) {
        rand.setSeed(seed);
    }

    /**
     * Remove a seed para "desprevisibilizar" os resultados
     */
    public void unsetSeed() {
        rand = new Random();
    }

    /**
     * Randomiza os dados da matriz
     *
     * @param origin O valor mínimo que se pode conseguir (inclusivo)
     * @param bound  O valor máximo que se pode conseguir (exclusivo)
     * @throws UnsupportedOperationException Se o tipo de dado da matriz não for suportado
     */
    public void randomize(double origin, double bound) {
        long longOrigin = (long) origin;
        long longBound;

        if (type == Byte.class) {
            longBound = (long) Math.min(Byte.MAX_VALUE + 1, bound);
        } else if (type == Short.class) {
            longBound = (long) Math.min(Short.MAX_VALUE + 1, bound);
        } else if (type == Integer.class) {
            longBound = (long) Math.min((long) Integer.MAX_VALUE + 1, bound);
        } else if (type == Long.class) {
            longBound = (long) bound;
        } else {
            longBound = (long) bound;
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                final Object val;
                if (type == Byte.class) {
                    val = (byte) rand.nextLong(longOrigin, longBound);
                } else if (type == Short.class) {
                    val = (short) rand.nextLong(longOrigin, longBound);
                } else if (type == Integer.class) {
                    val = (int) rand.nextLong(longOrigin, longBound);
                } else if (type == Long.class) {
                    val = rand.nextLong(longOrigin, longBound);
                } else if (type == Float.class) {
                    double doubleBound = Math.min(Float.MAX_VALUE, bound);
                    val = (float) rand.nextDouble(origin, doubleBound);
                } else if (type == Double.class) {
                    val = rand.nextDouble(origin, bound);
                } else {
                    throw new UnsupportedOperationException("Tipo não suportado");
                }
                data[i][j] = type.cast(val);
            }
        }
    }

    /**
     * Randomiza os dados da matriz
     *
     * @param bound O valor máximo que se pode conseguir (exclusivo)
     */
    public void randomize(double bound) {
        randomize(0, bound);
    }

    /**
     * Randomiza os dados da matriz
     */
    public void randomize() {
        randomize(0, 10_000);
    }

    // === PROPRIEDADES ===

    /**
     * Retorna o tamanho da matriz como um array do tipo {@code int}
     *
     * @return O tamanho da matriz
     */
    public int[] size() {
        return new int[]{data.length, data[0].length};
    }

    /**
     * Verifica se a matriz é uma matriz nula
     *
     * @return {@code true} se a matriz for nula, {@code false} caso contrário
     */
    public boolean isNull() {
        for (T[] i : data) {
            for (T j : i) {
                if (j.doubleValue() != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Verifica se a matriz é uma matriz quadrada
     *
     * @return {@code true} se a matriz for quadrada, {@code false} caso contrário
     */
    public boolean isSquare() {
        return data.length == data[0].length;
    }

    /**
     * Verifica se a matriz é uma matriz identidade
     *
     * @return {@code true} se a matriz for identidade, {@code false} caso contrário
     */
    public boolean isIdentity() {
        if (!isSquare()) return false;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if ((i == j && data[i][j].doubleValue() != 1) || (i != j && data[i][j].doubleValue() != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Verifica se a matriz é uma matriz simétrica
     *
     * @return {@code true} se a matriz for simétrica, {@code false} caso contrário
     */
    public boolean isSymmetrical() {
        if (!isSquare()) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (data[i][j].doubleValue() != data[j][i].doubleValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Verifica se a matriz é uma matriz diagonal
     *
     * @return {@code true} se a matriz for diagonal, {@code false} caso contrário
     */
    public boolean isDiagonal() {
        if (!isSquare()) return false;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i != j && data[i][j].doubleValue() != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // === MANIPULAÇÃO DE DADOS ===

    /**
     * Retorna o valor presenta na posição (x, y) da matriz
     *
     * @param row A coordenada x
     * @param col A coordenada y
     * @return O valor na posição (x, y)
     */
    public T get(int row, int col) {
        return data[row][col];
    }

    /**
     * Retorna a linha x
     *
     * @param row A posição (x) da linha
     * @return A linha
     */
    public List<T> get(int row) {
        return Arrays.asList(data[row]);
    }

    /**
     * Define o valor da posição (x, y) da matriz
     *
     * @param row A coordenada x
     * @param col A coordenada y
     * @param val O valor
     */
    public void set(int row, int col, T val) {
        data[row][col] = val;
    }

    // === ARITMÉTICA ===

    /**
     * Soma duas matrizes e retorna a matriz resultante
     *
     * @param b A matriz a ser somada
     * @throws IllegalArgumentException se as duas matrizes forem de ordens diferentes
     * @return A matriz resultante
     */
    @SuppressWarnings("unchecked")
    public Matrices<T> sum(Matrices<T> b) {
        if (!Arrays.equals(this.size(), b.size())) {
            throw new IllegalArgumentException("Não é possível somar matrizes de ordens diferentes");
        }

        T[][] newData = (T[][]) Array.newInstance(this.type, this.rows, this.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                double valor = this.data[i][j].doubleValue() + b.get(i, j).doubleValue();
                newData[i][j] = convert(valor, this.type);
            }
        }

        return from(newData);
    }

    /**
     * Soma duas matrizes
     *
     * @param b A matriz a ser somada
     * @throws IllegalArgumentException Se as duas matrizes forem de ordens diferentes
     */
    public void sumInplace(Matrices<T> b) {
        if (!Arrays.equals(this.size(), b.size())) {
            throw new IllegalArgumentException("Não é possível somar matrizes de ordens diferentes");
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = convert(data[i][j].doubleValue() + b.get(i, j).doubleValue(), type);
            }
        }
    }

    /**
     * Soma todas as matrizes de um array de matrizes e retorna a matriz resultante
     *
     * @param arr Array de matrizes
     * @return A matriz resultante
     */
    @SuppressWarnings("unchecked")
    public Matrices<T> sumAll(Matrices<T>[] arr) {
        Matrices<T> auxMatrix = this.copy();
        for (Matrices<T> m : arr) {
            auxMatrix.sumInplace(m);
        }
        return auxMatrix;
    }

    /**
     * Soma todas as matrizes de um array de {@code Matrices<T>}
     *
     * @param arr O array de matrizes
     */
    public void sumAllInplace(Matrices<T>[] arr) {
        for (Matrices<T> m : arr) {
            this.sumInplace(m);
        }
    }

    /**
     * Subtrái a matriz b da que chamou o método e retorna a matriz resultante
     *
     * @param b Matriz a ser subtraída
     * @return A matriz resultante
     * @throws IllegalArgumentException se as matrizes não forem de mesma ordem
     */
    @SuppressWarnings("unchecked")
    public Matrices<T> subtract(Matrices<T> b) {
        if (!Arrays.equals(this.size(), b.size())) {
            throw new IllegalArgumentException("Não é possível subtraír matrizes de ordens diferentes");
        }

        T[][] newData = (T[][]) Array.newInstance(this.type, this.rows, this.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                double value = this.data[i][j].doubleValue() - b.get(i, j).doubleValue();
                newData[i][j] = convert(value, this.type);
            }
        }

        return from(newData);
    }

    /**
     * Subtrái duas matrizes
     *
     * @param b A matriz a ser subtraída
     * @throws IllegalArgumentException Se as duas matrizes forem de ordens diferentes
     */
    public void subtractInplace(Matrices<T> b) {
        if (!Arrays.equals(this.size(), b.size())) {
            throw new IllegalArgumentException("O tamanho das matrizes não coincide");
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = convert(data[i][j].doubleValue() - b.get(i, j).doubleValue(), type);
            }
        }
    }

    /**
     * Subtrái todas as matrizes de um array de matrizes da matriz que chamou o método
     *
     * @param arr Array de matrizes
     * @return A matriz resultante
     */
    @SuppressWarnings("unchecked")
    public Matrices<T> subtractAll(Matrices<T>[] arr) {
        Matrices<T> auxMatrix = this.copy();
        for (Matrices<T> m : arr) {
            auxMatrix.subtractInplace(m);
        }
        return auxMatrix;
    }

    /**
     * Subtrái todas as matrizes de um array de {@code Matrices<T>}
     *
     * @param arr O array de matrizes
     */
    public void subtractAllInplace(Matrices<T>[] arr) {
        for (Matrices<T> m : arr) {
            subtractInplace(m);
        }
    }

    /**
     * Múltiplica uma matriz por um número
     *
     * @param val O número
     */
    public void times(T val) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = convert(get(i, j).doubleValue() * val.doubleValue(), type);
            }
        }
    }

    /**
     * Múltiplica duas matrizes
     *
     * @param b A segunda matriz (fator)
     * @return A nova matriz (produto da múltiplicação)
     * @throws IllegalArgumentException Se o número de linhas da 2ª matriz for diferente do número de colunas da 1ª
     */
    @SuppressWarnings("unchecked")
    public Matrices<T> times(Matrices<T> b) {
        if (!(this.size()[1] == b.size()[0])) {
            throw new IllegalArgumentException("O número de linhas da matriz b não coincide com o número de colunas da matriz a");
        }

        T[][] result = (T[][]) Array.newInstance(type, this.size()[0], b.size()[1]);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                T sum = type.cast(0);
                for (int k = 0; k < b.size()[0]; k++) {
                    sum = convert(sum.doubleValue() + this.get(i, k).doubleValue() * b.get(k, j).doubleValue(), type);
                }
                result[i][j] = sum;
            }
        }
        return from(result);
    }

    /**
     * Retorna uma matriz com os dados da primeira mapeados para outro tipo
     *
     * @param newType Novo tipo
     * @param <R>     O tipo de dado da nova matriz
     * @return Uma matriz com os dados mapeados
     */
    @SuppressWarnings("unchecked")
    public <R extends Number> Matrices<R> mapTo(Class<R> newType) {
        R[][] newData = (R[][]) Array.newInstance(newType, rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newData[i][j] = convert(get(i, j), newType);
            }
        }

        return new Matrices<>(newData, rows, columns, newType);
    }

    /**
     * Retorna uma matriz com o valor absoluto dos dados da primeira matriz
     *
     * @return A nova matriz
     */
    public Matrices<T> abs() {
        Matrices<T> result = from(data);
        Number val;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                val = get(i, j);
                val = (Number) (val.doubleValue() > 0 ? val : val.doubleValue() * -1);
                result.set(i, j, convert(val, type));
            }
        }
        return result;
    }

    /**
     * Retorna a matriz transposta
     *
     * @return A matriz transposta
     */
    @SuppressWarnings("unchecked")
    public Matrices<T> transpose() {
        Object raw = new Number[columns][rows];
        T[][] result = (T[][]) raw;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = data[i][j];
            }
        }

        return from(result);
    }
}
