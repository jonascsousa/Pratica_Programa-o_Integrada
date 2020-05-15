package usjt.br.ArquDesenv_Aula09.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usjt.br.ArquDesenv_Aula09.model.Usuario;
import usjt.br.ArquDesenv_Aula09.repository.UsuarioRepository;

@Service
public class LoginService {
	@Autowired
	UsuarioRepository usuarioRepo;
	public boolean logar (Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),

				usuario.getSenha()) != null;
	}
}
