public class Gen<T extends Number> {

    T array[];

    Gen(T[] o) {
        array = o;
    }

    public T[] getOb() {
        return array;
    }

    void showIndex() {
        System.out.println("first index of array is : " +
                array[0]);
    }

    void minValue() {
        double min = array[0].doubleValue();
        for (int i = 0; i < array.length; i++) {
                if (array[i].doubleValue() < min) {
                    min = array[i].doubleValue();
                }
            }
        System.out.println("first index of array is : " +
                min);
        }
}

