package tegraoss.pair;

public class Developer {
    public String nome;
    public enum niveis {
        estagio,
        junior,
        pleno,
        senior
    }
    public niveis nivel;
    
    @Override
    public String toString()
    {
        return "nome:"+this.nome+";nivel:"+this.nivel;
    }
}
