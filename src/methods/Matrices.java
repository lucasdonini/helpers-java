package methods;

import java.util.Random;

public class Matrices<T extends Number> {
    private final T[][] matrix;
    private final Class<T> type;
    private final Random rand = new Random();

    protected Matrices(T[][] data, Class<T> tipo) {
        this.matrix = data;
        this.type = tipo;
    }

    public static <T extends Number> Matrices<T> from(T[][] data) {
        if (data.length == 0 || data[0].length == 0 || data[0][0] == null) {
            throw new IllegalArgumentException("A matriz deve conter pelo menos um elemento não nulo");
        }
        @SuppressWarnings("unchecked")
        Class<T> tipo = (Class<T>) data[0][0].getClass();

        return new Matrices<>(data, tipo);
    }

    public void setSeed(long seed) {
        rand.setSeed(seed);
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

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
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
                matrix[i][j] = type.cast(val);
            }
        }
    }

    public void randomize(double bound) {
        randomize(0, bound);
    }

    public void randomize() {
        randomize(0, 10_000);
    }

    @Override
    public String toString() {
        return Matrix.toString(matrix);
    }
}
