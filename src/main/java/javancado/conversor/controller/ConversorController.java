package javancado.conversor.controller;

import javancado.conversor.dao.MoedaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javancado.conversor.model.MoedaConversor;

@Controller
public class ConversorController {
	
	@Autowired
	private MoedaDAO moedaRepository;
	
	public ConversorController() {
		moedaRepository = new MoedaDAO();
	}

	@GetMapping("/conversor")
	  public String conversorForm(Model model) {
	    model.addAttribute("conversor", new MoedaConversor());
	    return "conversor";
	  }
	
	 @PostMapping("/conversor")
	  public String conversorForm(@ModelAttribute MoedaConversor conversor, Model model) {
	    model.addAttribute("conversor", conversor);
	    model.addAttribute("convertido", moedaRepository.conversor(conversor));
	   
	   
	    
	    return "convertido";
	  }
}
