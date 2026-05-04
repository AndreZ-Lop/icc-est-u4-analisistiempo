import java.util.Arrays;
import java.util.concurrent.Callable;
import controles.SortMethods;
import models.Results;
public class App {
    public static void main(String[] args) throws Exception {
        int size=100;
        int[]arreglo = generate(size);
        int [] arreglo2=arreglo.clone();
        int[]arreglo3 = Arrays.copyOf(arreglo2, size);

        SortMethods metodos = new SortMethods();
        Callable<Void> sortBubble = () -> {
            metodos.sortBubble(arreglo2);

            return null;
        };
        Results rBubble = BenchMarking.medirTiempo(sortBubble, "Burbuja",size);
        System.out.println(rBubble.getName() + " = " + rBubble.getTime());

        Callable<Void> sortBubbleAvz = () ->{
            metodos.sortBubbleAvz(arreglo3);
            return null;
        };

         Results rBubbleAvz = BenchMarking.medirTiempo(sortBubbleAvz, "Burbuja Avz",size);
          System.out.println(rBubbleAvz.getName() + " = " + rBubbleAvz.getTime());

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
