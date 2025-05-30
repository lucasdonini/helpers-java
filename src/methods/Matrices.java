package methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Matrices<T extends Number> {
    //atributos
    private final int rows;
    private final int columns;
    private Class<T> type;
    private Random rand = new Random();
    private T[][] data;

    //construtores
    protected Matrices(T[][] data, int rows, int columns, Class<T> type) {
        this.data = data;
        this.rows = rows;
        this.columns = columns;
        this.type = type;
    }

    //fabricas
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

    //métodos auxiliares protegidos
    protected static <T extends Number> boolean isRegular(T[][] m) {
        int cols = m[0].length;
        for (T[] row : m) {
            if (row.length != cols) {
                return false;
            }
        }
        return true;
    }

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

    //getters e setters
    public T[][] getData() {
        return data;
    }

    public void setData(T[][] data) {
        this.data = data;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public Class<T> getType() {
        return type;
    }

    public void setType(Class<T> type) {
        this.type = type;
    }

    //toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T[] i : data) {
            sb.append(Arrays.toString(i)).append('\n');
        }
        return sb.toString();
    }

    //randomização
    public void setSeed(long seed) {
        rand.setSeed(seed);
    }

    public void unsetSeed() {
        rand = new Random();
    }

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

    public void randomize(double bound) {
        randomize(0, bound);
    }

    public void randomize() {
        randomize(0, 10_000);
    }

    //virificação de propriedades
    public int[] size() {
        return new int[]{data.length, data[0].length};
    }

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

    public boolean isSquare() {
        return data.length == data[0].length;
    }

    public boolean isIdentity() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if ((i == j && data[i][j].doubleValue() != 1) || (i != j && data[i][j].doubleValue() != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

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

    public boolean isDiagonal() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i != j && data[i][j].doubleValue() != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //manipulação das informações
    public T get(int row, int col) {
        return data[row][col];
    }

    public List<T> get(int row) {
        return Arrays.asList(data[row]);
    }

    public void set(int row, int col, T val) {
        data[row][col] = val;
    }

    //aritmética
    public void sum(Matrices<T> b) {
        if (!Arrays.equals(this.size(), b.size())) {
            throw new IllegalArgumentException("O tamanho das matrizes não coincide");
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = convert(data[i][j].doubleValue() + b.get(i, j).doubleValue(), type);
            }
        }
    }

    public void sumAll(Matrices<T>[] arr) {
        for (Matrices<T> m : arr) {
            sum(m);
        }
    }

    public void minus(Matrices<T> b) {
        if (!Arrays.equals(this.size(), b.size())) {
            throw new IllegalArgumentException("O tamanho das matrizes não coincide");
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = convert(data[i][j].doubleValue() - b.get(i, j).doubleValue(), type);
            }
        }
    }

    public void times(T val) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = convert(get(i, j).doubleValue() * val.doubleValue(), type);
            }
        }
    }

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
