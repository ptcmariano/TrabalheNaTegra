package tegraoss.pair;

import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PairProgramTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PairProgramTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PairProgramTest.class );
    }

    public void testInstanciaClassPair()
    {
        PairProgram pair = new PairProgram();
        
        assertEquals( pair.getClass(), PairProgram.class );
    }
    
    public void testPublicoDeveRetornarListaDeDesenvolvedor()
    {
        PairProgram pair = new PairProgram();
        ArrayList<Developer> expected = new ArrayList<Developer>();
        assertEquals(expected, pair.getPublico());
    }
    
    public void testAdicionarDoisDesenvolvedoresDeveTerNaListaDoisNaContagem()
    {
        PairProgram pair = new PairProgram();
        pair.addDeveloper("Paulo Mariano", Developer.niveis.pleno);
        pair.addDeveloper("Felipe Bernardes", Developer.niveis.senior);
        int expected = 2;
        assertEquals(expected, pair.getPublico().size());
    }
    
    public void testPublico10DevsSorteiaDriverDeveRetornarDeveloper()
    {
        PairProgram pair = FactoryPublico.gerarDez();
        Developer expected = new Developer();
        assertEquals(expected.getClass(), pair.sorteiaDriver().getClass());
    }

    public void testSorteiaNavigatorParaEstagiarioPesoSeniorDeveSer40()
    {
        PairProgram pair = new PairProgram();
        pair.addDeveloper("Fulano", Developer.niveis.estagio);
        pair.addDeveloper("Ciclano", Developer.niveis.senior);
        int expected = 40;
        assertEquals(expected, 40); // todo: pensar no design para saber o peso ao sortear navigator
    }
}
