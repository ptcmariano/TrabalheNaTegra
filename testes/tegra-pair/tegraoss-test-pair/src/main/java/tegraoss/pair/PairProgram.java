package tegraoss.pair;

import java.util.ArrayList;
import java.util.Random;

public class PairProgram {
    private ArrayList<Developer> audience = new ArrayList<Developer>();
    
    public void addDeveloper(String nome, Developer.niveis nivel) {
        Developer dev = new Developer();
        dev.nome = nome;
        dev.nivel = nivel;
        adicionaPorPeso(dev);
    }
    
    public ArrayList<Developer> getPublico() {
        return this.audience;
    }
    
    public Developer sorteiaDriver() {
        Random rand = new Random();
        return audience.get(rand.nextInt(this.audience.size()));
    }
    
    private void adicionaPorPeso(Developer dev){
        int peso;
        switch (dev.nivel) {
            case estagio:
            case junior:
                peso = 40;
                break;

            default:
                peso = 10;
                break;
        }
        for (int i = 0; i < peso; i++) {
            audience.add(dev);
        }
    }
}
