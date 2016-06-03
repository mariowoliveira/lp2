package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioRepository extends MongoRepository<Usuario, Long>
										  {
List<Usuario> findByNome(String nome);
	
}

