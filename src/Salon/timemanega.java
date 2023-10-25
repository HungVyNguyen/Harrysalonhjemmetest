package Salon;

import java.util.ArrayList;

public class timemanega {
    private ArrayList<kunden> tider;



    timemanega(){
        tider = new ArrayList<>(18);
    }

    public void addNewTime(kunden tider){
        this.tider.add(tider);
    }

    public ArrayList<kunden> getTider() {
        return tider;
    }

    public void setTider(ArrayList<kunden> tider) {
        this.tider = tider;
    }




}
