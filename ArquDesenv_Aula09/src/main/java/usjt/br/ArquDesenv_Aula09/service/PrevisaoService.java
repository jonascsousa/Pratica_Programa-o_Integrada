package usjt.br.ArquDesenv_Aula09.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usjt.br.ArquDesenv_Aula09.model.Previsao;
import usjt.br.ArquDesenv_Aula09.repository.PrevisaoRepository;

@Service
public class PrevisaoService {
	@Autowired
	private PrevisaoRepository previsaoRepo;
	
	public void salvar (Previsao previsao) {
		previsaoRepo.save(previsao);
		}
	public List <Previsao> listarTodos (){
		return previsaoRepo.findAll();
		}
}
