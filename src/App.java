import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int size=100;
        int[]arreglo = generate(size);
    }

    public static int [] generate(int size){
        int[]array=new int[size];
        for (int i=0;i<array.length;i++){
            int numero=(int)(Math.random()*10000);
            array[i]=numero;
        }
        return array;
    }
}
