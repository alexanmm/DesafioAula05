package br.com.digitalhouse;

import br.com.digitalhouse.Filho;

public class Main {

//Desenvolva um sistema de árvore genealógica que contenha:
//● Os métodos maeDe(filho) e paiDe(filho) que deve retornar true e false e
//deve receber um objeto do tipo filho como parâmetro;
//● Os métodos temAmesmaMae(filho1, filho2) e temOmesmoPai(filho1, filho2)
//que devem receber dois objetos do tipo filho e deve retornar true se os
//filhos tiverem a mesma mae ou false para mães diferentes, o mesmo vale
//para o método temOmesmoPai(filho1, filho2);

//● O método saoMeioIrmaos(filho1, filho2) que deve receber dois objetos do
//tipo filho, além disso o método deve retornar true no caso de serem meio
//irmãos ou false no caso de não ser.

    public static void main(String[] args) {

        Filho filho1 = new Filho("Carla", "Carlos");
        Filho filho2 = new Filho("Ines", "Carlos");

        System.out.println("Tem mesma mãe: " + String.valueOf(temAmesmaMae(filho1, filho2)));
        System.out.println("Tem mesmo pai: " + String.valueOf(temOmesmoPai(filho1, filho2)));
        System.out.println("Meio irmãos: " + String.valueOf(saoMeioIrmaos(filho1, filho2)));

    }

    public static String maeDe(Filho filho){
        return filho.getMae();
    }

    public static String paiDe(Filho filho){
        return filho.getPai();
    }

    public static Boolean temAmesmaMae(Filho filho1, Filho filho2){
        return maeDe(filho1) == maeDe(filho2);
    }

    public static Boolean temOmesmoPai(Filho filho1, Filho filho2){
        return paiDe(filho1) == paiDe(filho2);
    }

    public static Boolean saoMeioIrmaos(Filho filho1, Filho filho2){
//        return     (temAmesmaMae(filho1, filho2) == false && temOmesmoPai(filho1, filho2) == true )
//                || (temAmesmaMae(filho1, filho2) == true  && temOmesmoPai(filho1, filho2) == false);

        return     (!temAmesmaMae(filho1, filho2) && temOmesmoPai(filho1, filho2))
                || (temAmesmaMae(filho1, filho2)  && !temOmesmoPai(filho1, filho2));

    }

}
