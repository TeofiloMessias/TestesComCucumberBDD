
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {
	@Dado("^que criei o arquivo corretamente$")
    public void queCrieiOArquivoCorretamente() throws Throwable {
		System.out.println("qualquer coisa");
	
    }

    @Quando("^executa-lo$")
    public void executaLo() throws Throwable {
    	System.out.println("teste de script");
    }

    @Entao("^a especificacao deve finalizar com sucesso$")
    public void aEspecificacaoDeveFinalizarComSucesso() throws Throwable {
    	System.out.println("realizando teste");
    }
    
    private int contador = 0;
    @Dado("^que o valor do contador é (\\d+)$")
    public void que_o_valor_do_contador_é(int arg1) throws Throwable {
        contador = arg1;
    }
    @Quando("^eu incrementar em (\\d+)$")
    public void euIncrementarEm(int arg1) throws Throwable {
    	contador = contador + arg1;
    }

    @Entao("^o valor do contador será (\\d+)$")
    public void oValorDoContadorSer(int arg1) throws Throwable {
    	System.out.println(arg1);
    	System.out.println(contador);
    	System.out.println(arg1 == contador);
       
    }

}

