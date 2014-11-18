package hei.tp07.controller;

import hei.tp07.entity.Slide;

import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SlideEncoder implements Encoder.Text<Slide> {

	private ObjectMapper mapper;

	@Override
	public void destroy() {

	}

	@Override
	public void init(EndpointConfig arg0) {
		mapper = new ObjectMapper();
	}

	public String encode(Slide slide) {

		try {
			return mapper.writeValueAsString(slide);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return e.getMessage();
		}

	}

}
