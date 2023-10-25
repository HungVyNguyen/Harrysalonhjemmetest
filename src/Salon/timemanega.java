package Salon;

import java.util.ArrayList;

public class timemanega {

    private ArrayList<kunden> tider;



    timemanega(){
        tider = new ArrayList<>(8);
    }

    public void addNewTime(kunden tider1){
        tider.add(tider1);
    }

    public ArrayList<kunden> getTider() {
        return tider;
    }

    public void setTider(ArrayList<kunden> tider) {
        this.tider = tider;
    }





}
