package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.spring.mongo.Chat;
import br.com.herbertrausch.spring.mongo.ChatService;
import br.com.herbertrausch.spring.mongo.Response;

@Path("/troca")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class ChatResource {
	
	private ChatService service = new ChatService();

	@GET
	public List<Chat> get() {
		List<Chat> lista = service.getChat();
		return lista;
	}

	@GET
	@Path("{id}")
	public Chat get(@PathParam("id") long id) {
		Chat e = service.getChat(id);
		return e;
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") long id) {
		service.delete(id);
		return Response.Ok("Troca deletada com sucesso");
	}

	@POST
	public Response post(Chat e) {
		service.save(e);
		return Response.Ok("Troca salva com sucesso");
	}

	@PUT
	public Response put(Chat e) {
		service.save(e);
		return Response.Ok("Troca atualizada com sucesso");
	}


}
