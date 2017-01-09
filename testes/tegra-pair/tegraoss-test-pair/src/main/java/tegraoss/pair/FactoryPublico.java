package tegraoss.pair;

public class FactoryPublico {
    public static PairProgram seed(){
        PairProgram pair = new PairProgram();
        pair.addDeveloper("Paulo Mariano", Developer.niveis.pleno);
        pair.addDeveloper("Felipe Bernardes", Developer.niveis.senior);
        pair.addDeveloper("Thiago Martinho", Developer.niveis.senior);
        pair.addDeveloper("Rogerio Silva", Developer.niveis.senior);
        pair.addDeveloper("Fulano", Developer.niveis.senior);
        pair.addDeveloper("Ciclano", Developer.niveis.estagio);
        pair.addDeveloper("Outro dev", Developer.niveis.pleno);
        pair.addDeveloper("Estagiario", Developer.niveis.estagio);
        pair.addDeveloper("Junior", Developer.niveis.junior);
        pair.addDeveloper("Outra", Developer.niveis.junior);
        return pair;
    }
}
