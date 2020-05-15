package usjt.br.ArquDesenv_Aula09.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import usjt.br.ArquDesenv_Aula09.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
	public Usuario findOneByLoginAndSenha (String login, String senha);
}

