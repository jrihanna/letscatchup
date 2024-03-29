package com.letscatchup.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letscatchup.event.domain.entity.EventAttendeeEntity;
import com.letscatchup.event.domain.entity.EventAttendeeIdEntity;
import com.letscatchup.event.domain.repository.EventAttendeeCrudRepository;

@Service
public class EventAttendeeService {
	
	@Autowired
	EventAttendeeCrudRepository eventAttendeeCrudRepository;

	public EventAttendeeEntity addAttendee(EventAttendeeEntity eventAttendeeEntity) {
		return eventAttendeeCrudRepository.save(eventAttendeeEntity);
	}
	
	public void removeAttendee(EventAttendeeIdEntity attendeId) {
		eventAttendeeCrudRepository.delete(attendeId);
	}
	
	public EventAttendeeEntity loadAttendee(EventAttendeeIdEntity attendeId) {
		return eventAttendeeCrudRepository.findOne(attendeId);
	}
	
}
