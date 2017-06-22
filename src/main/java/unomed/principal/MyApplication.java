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
 * Classe que terá o método principal que dará início a aplicação
 * @author Cleiton
 *
 */


//Configurar a aplicação Spring
@SpringBootApplication
//http://www.devmedia.com.br/desenvolvendo-uma-aplicacao-web-com-spring-boot-e-spring-mvc/34122
//@EntityScan(basePackages = { "unomed.entidades" })
//@EnableJpaRepositories(basePackages = { "unomed.persistence" })
//@ComponentScan(basePackages = {"unomed.ui"})
//@EnableAutoConfiguration()
//@Controller
public class MyApplication {
	

	//Configurando o jetty na aplicação
	@Bean//quer dizer que será controlado e mapeado pelo springboot framework
	public JettyEmbeddedServletContainerFactory  jettyEmbeddedServletContainerFactory() {
	    JettyEmbeddedServletContainerFactory jettyContainer = 
	      new JettyEmbeddedServletContainerFactory();
	     
	    jettyContainer.setPort(7373);
	    jettyContainer.setContextPath("/unomed-new");
	    return jettyContainer;
	}
	
	
	//Método main, principal método e de onde terá inicio a aplicação
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
    }
	
}