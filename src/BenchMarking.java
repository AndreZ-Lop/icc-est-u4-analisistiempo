import models.Results;
import java.util.concurrent.Callable;
public class BenchMarking{
    public Results medirTiempo(Callable<Void> funcion, String name, int sample){
        try{
            long inicio = System.nanoTime();
            funcion.call();
            long fin = System.nanoTime();

        }catch (Exception e){

        }
    }
}
