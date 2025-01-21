import java.util.Arrays;

public class MySet {
    private int[] elements;
    private int size;

    public MySet() {
        this.elements = new int[100];
        this.size = 0;
    }

    public void add(int value) throws DuplicateValueException, InvalidValueException, ArrayFullException {
        if (value < 0) {
            throw new InvalidValueException("Valores negativos não são permitidos para inserção.");
        }

        if (size >= 100) {
            throw new ArrayFullException("O conjunto já atingiu o limite de 100 elementos.");
        }

        for (int i = 0; i < size; i++) {
            if (elements[i] == value) {
                throw new DuplicateValueException("O valor " + value + " já existe no conjunto.");
            }
        }

        elements[size++] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
}