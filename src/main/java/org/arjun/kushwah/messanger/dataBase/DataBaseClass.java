package org.arjun.kushwah.messanger.dataBase;

import java.util.HashMap;
import java.util.Map;

import org.arjun.kushwah.messanger.model.Message;
import org.arjun.kushwah.messanger.model.Profile;

public class DataBaseClass {
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
}
