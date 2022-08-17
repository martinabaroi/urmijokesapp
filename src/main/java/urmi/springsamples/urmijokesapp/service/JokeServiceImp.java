package urmi.springsamples.urmijokesapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImp implements JokeService {
	
	
	private ChuckNorrisQuotes chunk;
	
	public JokeServiceImp(ChuckNorrisQuotes chunk) {
		this.chunk = chunk;
	}
	@Override
	public String getQuote() {
	
		String joke = chunk.getRandomQuote();
		return joke;
	}

	

}
