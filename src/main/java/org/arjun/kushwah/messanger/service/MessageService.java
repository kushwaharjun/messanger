package org.arjun.kushwah.messanger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.arjun.kushwah.messanger.dataBase.DataBaseClass;
import org.arjun.kushwah.messanger.model.Message;

public class MessageService {
	private Map<Long, Message> messages = DataBaseClass.getMessages();

	public MessageService() {
		messages.put(1L, new Message(1, "Hello arjun", "arjun"));
		messages.put(1L, new Message(1, "Hello arjun", "modified"));
		messages.put(2L, new Message(2, "Hello kushw", "kush"));
	}

	public List<Message> getAllMessage() {
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(long id) {
		return messages.get(id);
	}

	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	public Message removeMessage(long id) {
		return messages.remove(id);
	}

	public Message updateMessage(Message message) {
		if (messages.containsKey(message.getId())) {
			System.out.println(message.getId());
			System.out.println(message.getMessage());
			return messages.put(message.getId(), message);
		} else {
			return null;
		}

	}
}
