public class Gen<T> {

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

}
