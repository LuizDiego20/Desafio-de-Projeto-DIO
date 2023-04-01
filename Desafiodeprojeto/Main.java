package Desafiodeprojeto;

public class Main {
    public static void main(String[] args) {
        UnidadeDeCombate unit = new UnidadeDeCombate();
        
        unit.setEstrategiaDeMovimento(new Andar());
        unit.move();
        
        unit.setEstrategiaDeMovimento(new Voar());
        unit.move();
        
        unit.setEstrategiaDeMovimento(new Nadar());
        unit.move();
    }
}