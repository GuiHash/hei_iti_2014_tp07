package hei.tp07.controller;

import hei.tp07.entity.Slide;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/control", encoders={SlideEncoder.class}, decoders={SlideDecoder.class})
public class RevealController {
	
	
	@OnMessage
	public void message(Slide slide, Session session) throws IOException {
		for (Session s : session.getOpenSessions()) {
			if (s.isOpen()) {
				this.send(session, slide);
			}
		}
	}

	@OnOpen
	public void message2(Session session) throws IOException {
		session.getUserProperties().put("uid",UUID.randomUUID().toString());
	}

	private void send(Session session, Slide slide)
	{
		try {
			System.out.println(session.getUserProperties().get("uid"));
			session.getBasicRemote().sendObject(slide);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
