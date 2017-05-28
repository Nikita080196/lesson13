
public class GenDemo {
    public static void main(String args[]) {
        Integer n[] = {1, 2, 3, 4, 5};
        Gen <Integer> ob = new Gen<>(n);
        ob.showIndex();
        //String str[] = {"s","fsfs","gdfsfs"};
        //Gen<String> ob1 = new Gen<>(str);
        //ob1.showIndex();
        ob.minValue();
    }
}
