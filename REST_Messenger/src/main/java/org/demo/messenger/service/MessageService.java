package org.demo.messenger.service;

import java.util.*;

import org.demo.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		Message m1=new Message(1L,"Hello World!","Prathyusha");
		Message m2=new Message(2L,"Hello Jersey!","Anusha");
		List<Message> list=new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		
	}

}
