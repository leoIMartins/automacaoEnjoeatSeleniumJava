package runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",	//Caminho das features
		glue = "steps",		//Caminho dos steps
		tags = {"@infos"},				//Executa apenas os cenários/funcionalidades que possuem "@tag" -- ignora os que possuem "~@tag"
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},					//Muda a apresentação do teste no console. Entre chaves {} para permitir mais que um
		monochrome = true,					//Tira os caracteres especiais do console após execução ou adiciona cores no terminal do SO
		snippets = SnippetType.CAMELCASE,	//Métodos seguem padrão "queCrieiOArquivoCorretamente"
		dryRun = false,						//Não executa os testes. Valida se o mapeamento está correto
		strict = false						//Se algum passo do .feature não estiver na classe, Junit acusa erro
		)

public class RunnerTest {
	
}
