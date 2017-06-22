package unomed.principal;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * Classe que ter� o m�todo principal que dar� in�cio a aplica��o
 * @author Cleiton
 *
 */


//Configurar a aplica��o Spring
@SpringBootApplication
//http://www.devmedia.com.br/desenvolvendo-uma-aplicacao-web-com-spring-boot-e-spring-mvc/34122
//@EntityScan(basePackages = { "unomed.entidades" })
//@EnableJpaRepositories(basePackages = { "unomed.persistence" })
//@ComponentScan(basePackages = {"unomed.ui"})
//@EnableAutoConfiguration()
//@Controller
public class MyApplication {
	

	//Configurando o jetty na aplica��o
	@Bean//quer dizer que ser� controlado e mapeado pelo springboot framework
	public JettyEmbeddedServletContainerFactory  jettyEmbeddedServletContainerFactory() {
	    JettyEmbeddedServletContainerFactory jettyContainer = 
	      new JettyEmbeddedServletContainerFactory();
	     
	    jettyContainer.setPort(7373);
	    jettyContainer.setContextPath("/unomed-new");
	    return jettyContainer;
	}
	
	
	//M�todo main, principal m�todo e de onde ter� inicio a aplica��o
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
    }
	
}