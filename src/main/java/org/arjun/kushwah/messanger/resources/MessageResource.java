package org.arjun.kushwah.messanger.resources;

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

import org.arjun.kushwah.messanger.model.Message;
import org.arjun.kushwah.messanger.service.MessageService;

@Path("/message")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
	MessageService messageService=new MessageService();
	@GET
	public List<Message> getMessage() {
		System.out.println("heloo----------------------");
		return messageService.getAllMessage();
	}
	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") long messageId) {
		return messageService.getMessage(messageId);
	}
	
	@POST
	public Message addMessage (Message message){
		return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
	public Message UpdateMessage(@PathParam("messageId") long id,Message message) {
		message.setId(id);
		return messageService.updateMessage(message);
	}
	@DELETE
	@Path("/{messageId}")
	public Message delete(@PathParam("messageId") long id) {
		return messageService.removeMessage(id);
	}
}
