package etec.org.futebolbrasileiro;

/**
 * Created by Andre on 03/10/2016.
 */
public class TimeFutebol {

    private String nome;
    private Integer pontos;


    public TimeFutebol(String nome){
                this.nome = nome;
                pontos = 0;
    }

    public void vitoria(){pontos += 3;}
    public void empate(){pontos += 1;}

    public String getNome(){return nome;}
    public Integer getPontos(){return pontos;}

    @Override
    public String toString() {
        return getNome() + "   " + getPontos() + "pts";
    }
}
