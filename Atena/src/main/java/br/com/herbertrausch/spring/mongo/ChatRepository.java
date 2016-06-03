package br.com.herbertrausch.spring.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface ChatRepository extends MongoRepository<Chat, Long> {

}