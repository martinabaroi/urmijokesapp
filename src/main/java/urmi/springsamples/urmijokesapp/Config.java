package urmi.springsamples.urmijokesapp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class Config {
	
	@Bean    //mention it to make this library(ChuckNorrisQuotes) bean.
	public ChuckNorrisQuotes getChuckNorrisQuotes() {   //a library named ChuckNorrisQuotes is not a bean. so we made it bean here.
		return new ChuckNorrisQuotes(); //it return ChuckNorrisQuotes class after making it bean.
	}

}
