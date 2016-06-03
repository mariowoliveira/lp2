package br.com.herbertrausch.spring.mongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import br.com.herbertrausch.util.SpringUtil;

public class ChatService {

	private ChatRepository db;
	
	public ChatService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(ChatRepository.class);
		
	}

	public List<Chat> getChat() {
		try {
			
			List<Chat> chat = (List<Chat>) db.findAll();
			return chat;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Chat>();

		}
	}

	
	
	public Chat getChat(Long id) {
		try {
			
			return db.findOne(id);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	public boolean delete(Long id) {
		try {
			db.delete(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean save(Chat chat) {
		try {
			db.save(chat);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
