package br.com.digitalhouse;

public class Filho {

    private String mae;
    private String pai;

    //Construtor
    public Filho(String mae, String pai){
        setMae(mae);
        setPai(pai);
    }

    //Construtor Padrão
    public Filho(){

    }

    //Getter and Setter
    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }
}
