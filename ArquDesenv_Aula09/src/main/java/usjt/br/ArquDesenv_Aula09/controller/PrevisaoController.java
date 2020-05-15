package usjt.br.ArquDesenv_Aula09.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import usjt.br.ArquDesenv_Aula09.model.Previsao;
import usjt.br.ArquDesenv_Aula09.service.PrevisaoService;

@Controller
public class PrevisaoController {

	@Autowired
	PrevisaoService previsaoService;

	@GetMapping("/previsao")
	public ModelAndView previsaoDoTempo() {
		ModelAndView mv = new ModelAndView("lista_previsao");
		List<Previsao> previsoes = previsaoService.listarTodos();
		mv.addObject(new Previsao());
		mv.addObject("previsoes", previsoes);
		return mv;

	}
	@PostMapping("/previsao")
	public String salvar(Previsao previsao) {
		previsaoService.salvar(previsao);
		return "redirect:/previsao";
	}

}
