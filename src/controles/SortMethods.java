package controles;
public class SortMethods {
    public void sortBubble(int []numeros){
        for(int i=0;i<numeros.length;i++){
			for(int j=i+1;j<numeros.length;j++){
				if(numeros[i]>numeros[j]){
					int aux=numeros[i];
					numeros[i]=numeros[j];
					numeros[j]=aux;
				}
			}
        }
    }
    public void sortBubbleAvz(int [] numeros){
        for(int i=0;i<numeros.length;i++){
            boolean swapped = false;
			for(int j=0;j<numeros.length-i-1;j++){
				if(numeros[j]>numeros[j+1]){
					int aux=numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]=aux;
                    swapped = true;
				}
			}
            if(!swapped){
                return;
            }
		}
    }
}
