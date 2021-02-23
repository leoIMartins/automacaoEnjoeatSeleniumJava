package steps.cardapio;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.pt.*;
import support.web.pages.Restaurant;
import support.web.pages.RestaurantList;

public class CardapioSteps {

	WebDriver driver = new ChromeDriver();
	RestaurantList restaurantList = new RestaurantList(driver);
	Restaurant restaurant = new Restaurant(driver);

	@Dado("^que acesso a lista de restaurantes$")
	public void que_acesso_a_lista_de_restaurantes() {
		restaurantList.load();
	}

	@Quando("^eu escolho o restaurante \"([^\"]*)\"$")
	public void eu_escolho_o_restaurante(String restaurant)  {
		restaurantList.go(restaurant);
	}

	@Então("^vejo os seguintes itens disponíveis no cardápio:$")
	public void vejo_os_seguintes_itens_disponíveis_no_cardápio(DataTable table) {
		List<WebElement> items = restaurant.menu();
		List<List<String>> productData = table.asLists(String.class);
		
		for (int i = 0; i < items.size(); i++) {
			Assert.assertTrue(items.get(i).getText().contains(productData.get(i+1).get(0).toUpperCase()));
			Assert.assertTrue(items.get(i).getText().contains(productData.get(i+1).get(1)));
			Assert.assertTrue(items.get(i).getText().contains(productData.get(i+1).get(2)));
		}
	}

	@Então("^eu vejo as seguintes informacoes adicionais:$")
	public void eu_vejo_as_seguintes_informacoes_adicionais(DataTable table) {
		Map<String, String> infos = table.asMap(String.class, String.class);
		WebElement detail = restaurant.details();

		Assert.assertTrue(detail.getText().contains(infos.get("categoria")));
		Assert.assertTrue(detail.getText().contains(infos.get("descrição")));
		Assert.assertTrue(detail.getText().contains(infos.get("horários")));
	}
}
