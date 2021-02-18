package steps.cardapio;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import support.web.pages.Restaurant;
import support.web.pages.RestaurantList;

public class CardapioSteps {

	WebDriver driver = new ChromeDriver();
	RestaurantList restaurantList = new RestaurantList(driver);
	Restaurant restaurant = new Restaurant(driver);

	@Dado("^que acesso a lista de restaurantes$")
	public void que_acesso_a_lista_de_restaurantes() throws Throwable {
		restaurantList.load();
	}

	@Quando("^eu escolho o restaurante \"([^\"]*)\"$")
	public void eu_escolho_o_restaurante(String restaurant) throws Throwable {
		restaurantList.go(restaurant);
	}

	@Então("^vejo os seguintes itens disponíveis no cardápio:$")
	public void vejo_os_seguintes_itens_disponíveis_no_cardápio(DataTable table) throws Throwable {
		List<WebElement> items = restaurant.menu();
		for(int i=0;i<5;i++) {
			System.out.println(items.get(i));
		}
		
	}

	@Então("^vejo a seguinte mensagem no carrinho \"([^\"]*)\"$")
	public void vejo_a_seguinte_mensagem_no_carrinho(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
