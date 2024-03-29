package com.letscatchup.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.letscatchup.event.domain.entity.EventAttendeeEntity;
import com.letscatchup.event.domain.entity.EventAttendeeIdEntity;
import com.letscatchup.event.service.EventAttendeeService;

@RestController
@RequestMapping("/event")
public class EventAttendeeController {
	
	@Autowired
	EventAttendeeService eventAttendeeService;
	
	@RequestMapping(value = "/{eventId}/attendee/{attendeeId}", method= RequestMethod.GET)
	public EventAttendeeEntity loadAttendee(@PathVariable("eventId") Long eventId, @PathVariable("attendeeId") EventAttendeeIdEntity attendeeId) {
		// TODO: this is wrong! for this method, we need to load UserEntity
		return eventAttendeeService.loadAttendee(attendeeId);
		
	}
	
	@RequestMapping(value = "/{eventId}/attendee", method= RequestMethod.POST)
	public EventAttendeeEntity addAttendee(@PathVariable("eventId") Long eventId, @RequestBody EventAttendeeEntity eventAttendeeEntity) {
		
		return eventAttendeeService.addAttendee(eventAttendeeEntity);
		
	}
		
	@RequestMapping(value = "/{eventId}/attendee/{attendeeId}", method= RequestMethod.DELETE)
	public void removeAttendee(@PathVariable("eventId") Long eventId, @PathVariable("attendeeId") Long userId) {
		
		eventAttendeeService.removeAttendee(new EventAttendeeIdEntity(eventId, userId));
		
	}
	
	// edit attendee does not any meaning ...
	/*@RequestMapping(value = "/{eventId}/attendee", method= RequestMethod.PUT)
	public EventAttendeeEntity editComment(@PathVariable("eventId") Long eventId, @RequestBody EventAttendeeEntity eventAttendeeEntity) {
		eventCommentEntity.setEvent(new EventEntity(eventId));
		
		return eventAttendeeService.updateComment(eventCommentEntity);
		
	}*/
}
