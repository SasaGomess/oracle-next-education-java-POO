package calculo;

import entities.Movie;
import entities.Titulo;

public class TimeCalculator {
    private int tempototal;

    public int getTempototal() {
        return tempototal;
    }

    public void includes(Titulo titulo){
        tempototal += titulo.getDurationInMinutes();
    }
}
