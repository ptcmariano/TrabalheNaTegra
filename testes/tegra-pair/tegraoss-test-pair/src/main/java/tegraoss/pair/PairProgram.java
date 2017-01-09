package tegraoss.pair;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

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
        ArrayList<Developer> publicoSorteio = new ArrayList<Developer>();
        for (Iterator<Developer> iterator = this.getPublico().iterator(); iterator.hasNext();) {
            Developer developer = (Developer)iterator.next();
            publicoSorteio.addAll(this.adicionaPorPeso(developer));
        }
        return publicoSorteio.get(new Random().nextInt(publicoSorteio.size()));
    }

    public Developer sorteiaNavigator(Developer dev) {
        Random rand = new Random();
        return audience.get(rand.nextInt(this.audience.size()));
    }
    
    private ArrayList<Developer> adicionaPorPeso(Developer dev){
        int peso;
        ArrayList<Developer> publicoSorteio = new ArrayList<Developer>();
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
            publicoSorteio.add(dev);
        }
        return publicoSorteio;
    }
}
