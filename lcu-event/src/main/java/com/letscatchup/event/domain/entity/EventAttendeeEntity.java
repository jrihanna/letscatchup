 package com.letscatchup.event.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LCU_EV_ATTENDEES")
public class EventAttendeeEntity {
	
	public EventAttendeeEntity(long eventId, long userId) {
		this.setEventAttendeeId(new EventAttendeeIdEntity(eventId, userId));
	}
	
	public EventAttendeeEntity() {
	}

	@EmbeddedId
	private EventAttendeeIdEntity eventAttendeeId;


	public EventAttendeeIdEntity getEventAttendeeId() {
		return eventAttendeeId;
	}

	public void setEventAttendeeId(EventAttendeeIdEntity eventAttendeeId) {
		this.eventAttendeeId = eventAttendeeId;
	}
	
}
	