classDiagram
    class MySet {
        -int[] elements
        -int size
        +MySet()
        +void add(int value)
    }

    MySet <-- Exception
    class DuplicateValueException {
        +DuplicateValueException(String message)
    }

    class InvalidValueException {
        +InvalidValueException(String message)
    }

    class ArrayFullException {
        +ArrayFullException(String message)
    }

    