package Desafiodeprojeto;

public class UnidadeDeCombate {
    private EstrategiaDeMovimento EstrategiaDeMovimento;

    public UnidadeDeCombate(EstrategiaDeMovimento EstrategiaDeMovimento) {
        this.EstrategiaDeMovimento = EstrategiaDeMovimento;
    }

    public UnidadeDeCombate() {
    }

    public void setEstrategiaDeMovimento(EstrategiaDeMovimento EstrategiaDeMovimento) {
        this.EstrategiaDeMovimento = EstrategiaDeMovimento;
    }

    public void move() {
        EstrategiaDeMovimento.mover();
    }
}
