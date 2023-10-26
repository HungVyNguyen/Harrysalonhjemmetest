package Salon;

public class frisør {

    private String username;
    private String password;

    frisør(String username,String password){
        setPassword(password);
        setUsername(username);

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean equals(frisør obj){
        if(this.password.equals(obj.password)&&this.username.equals(obj.username)){
            return true;
        }else{
            return false;
        }
    }

}
