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

import br.com.herbertrausch.spring.mongo.Livros;
import br.com.herbertrausch.spring.mongo.LivrosService;
import br.com.herbertrausch.spring.mongo.Response;

@Path("/livro")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class LivrosResource {
	
	private LivrosService service = new LivrosService();

	@GET
	public List<Livros> get() {
		List<Livros> lista = service.getLivros();
		return lista;
	}

	@GET
	@Path("{id}")
	public Livros get(@PathParam("id") long id) {
		Livros e = service.getLivros(id);
		return e;
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") long id) {
		service.delete(id);
		return Response.Ok("Troca deletada com sucesso");
	}

	@POST
	public Response post(Livros e) {
		service.save(e);
		return Response.Ok("Troca salva com sucesso");
	}

	@PUT
	public Response put(Livros e) {
		service.save(e);
		return Response.Ok("Troca atualizada com sucesso");
	}


}