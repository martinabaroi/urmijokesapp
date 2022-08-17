package urmi.springsamples.urmijokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import urmi.springsamples.urmijokesapp.service.JokeService;

@Controller
public class ControllerService {

	private JokeService jokeService;
	
	public ControllerService(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	
	@RequestMapping("/a")
	public String getRandomQuotes(Model model) {
		String findJoke = jokeService.getQuote();
		model.addAttribute("findJoke", findJoke);
		return "index";
	}
}
