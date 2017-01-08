package tegraoss.pair;

import java.util.ArrayList;

public class PairProgram {
    private ArrayList<Developer> audience = new ArrayList<Developer>();
    
    public void addDeveloper(String nome, Developer.niveis nivel) {
        Developer dev = new Developer();
        dev.nome = nome;
        dev.nivel = nivel;
        audience.add(dev);
    }
    
    public ArrayList<Developer> getPublico() {
        return this.audience;
    }
    
    public Developer sorteiaDriver() {
        return audience.get(0);
    }
}
