package com.letscatchup.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letscatchup.event.domain.entity.EventEntity;
import com.letscatchup.event.domain.repository.EventCrudRepository;

@Service
public class EventService {

	@Autowired
	private EventCrudRepository eventCrudRepository;
	
	
	public EventEntity addEvent(EventEntity eventEntity) {
		
		return eventCrudRepository.save(eventEntity);
		
	}
	
	public EventEntity updateEvent(EventEntity eventEntity) {
		
		return eventCrudRepository.save(eventEntity);
		
	}
	
	public void deleteEvent(Long eventId) {
		
		eventCrudRepository.delete(eventId);
		
	}

	public EventEntity loadEvent(Long eventId) {
		
		return eventCrudRepository.findOne(eventId);
		
	}
}
