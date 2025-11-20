package calculo;

import model.Titulo;

public class TimeCalculator {
    private int tempototal;

    public int getTempototal() {
        return tempototal;
    }

    public void includes(Titulo titulo){
        tempototal += titulo.getDurationInMinutes();
    }
}
