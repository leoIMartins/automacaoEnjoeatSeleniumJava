package steps.pedido;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PedidoSteps {
	@Dado("^que eu fechei o pedido com os itens:$")
	public void que_eu_fechei_o_pedido_com_os_itens(DataTable table) throws Throwable {
		//List<List<String>> tabela = new ArrayList<List<String>>();
		//tabela.
		
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Dado("^informei os meus dados de entrega:$")
	public void informei_os_meus_dados_de_entrega(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Quando("^eu finalizo o pedido com \"([^\"]*)\"$")
	public void eu_finalizo_o_pedido_com(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Então("^devo ver a seguinte mensagem:$")
	public void devo_ver_a_seguinte_mensagem(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
