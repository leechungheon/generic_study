public class MyArrayAlg {
    public static <T>void swap(T[] array, int a, int b){
        T temp;
        temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}
