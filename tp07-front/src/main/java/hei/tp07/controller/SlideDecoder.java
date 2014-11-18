package hei.tp07.controller;

import hei.tp07.entity.Slide;

import java.io.IOException;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import com.fasterxml.jackson.databind.ObjectMapper;


public class SlideDecoder implements Decoder.Text<Slide> {

	private ObjectMapper mapper;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(EndpointConfig arg0) {
		mapper = new ObjectMapper();

	}

	public Slide decode(String json) throws DecodeException {

		try {
			return mapper.readValue(json, Slide.class);

		} catch (IOException e) {
			throw new DecodeException(json, "impossible de décoder", e);
		}

	}

	public boolean willDecode(String arg0) {
		return true;
	}

}