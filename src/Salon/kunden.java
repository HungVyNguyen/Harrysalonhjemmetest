package Salon;

import java.time.LocalTime;
import java.util.Locale;

public class kunden {
    private LocalTime tider;
    private String name;
    private String email;
    private int telefonnummer;


    kunden(LocalTime tider,String name, String email, int telefonnummer){

        setTider(tider);
        setName(name);
        setEmail(email);
        setTelefonnummer(telefonnummer);
    }




    public LocalTime getTider() {
        return tider;
    }

    public void setTider(LocalTime tider) {
        this.tider = tider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    @Override
    public String toString() {
        return
                "tider=" + tider +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", telefonnummer=" + telefonnummer;
    }
}
