
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

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

    @Entao("^o valor do contador será (\\d+)$") // expressões regulares (\\d+)$
    public void oValorDoContadorSer(int arg1) throws Throwable {
//    	https://jex.im/regulex
//		https://regex101.com/    	
//    	System.out.println(arg1);
//    	System.out.println(contador);
//    	System.out.println(arg1 == contador);
//    	Assert.assertTrue(arg1 == contador);
    	Assert.assertEquals(arg1,contador);
//		throw new RuntimeException();
    	
    }
    Date entrega = new Date();
    
    @Dado("^que a entrega é dia (\\d+)/(\\d+)/(\\d+)$")
    public void queAEntregaÉDia(int dia, int mes, int ano) throws Throwable {
    	Calendar cal = Calendar.getInstance();
    	cal.set(Calendar.DAY_OF_MONTH, dia);
    	cal.set(Calendar.MONTH, mes - 1);
    	cal.set(Calendar.YEAR, ano);
    	entrega = cal.getTime();
        
    }

    @Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
    public void aEntregaAtrasarEmDias(int arg1, String tempo) throws Throwable {
    	Calendar cal = Calendar.getInstance();
    	
    	cal.setTime(entrega);
    	if(tempo.equals("dias")) { 	
    	    cal.add(Calendar.DAY_OF_MONTH, arg1);
    	}
    	if(tempo.equals("meses")) {
    		cal.add(Calendar.MONTH, arg1);
    	}
    	entrega = cal.getTime();
    	
    }

    @Entao("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
    public void aEntregaSeráEfetuadaEm(String data) throws Throwable {
    	DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    	String dataFormatada = format.format(entrega);
    	Assert.assertEquals(data,dataFormatada);
        
    }

}

