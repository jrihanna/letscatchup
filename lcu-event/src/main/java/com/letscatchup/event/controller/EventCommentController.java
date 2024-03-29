package com.letscatchup.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.letscatchup.event.domain.entity.EventCommentEntity;
import com.letscatchup.event.domain.entity.EventEntity;
import com.letscatchup.event.service.EventCommentService;

@RestController
@RequestMapping("/event")
public class EventCommentController {
	
	@Autowired
	private EventCommentService eventCommentService;
	
	@RequestMapping(value = "/{eventId}/comments/{commentId}", method= RequestMethod.GET)
	public EventCommentEntity loadComment(@PathVariable("eventId") Long eventId, @PathVariable("commentId") Long commentId) {
		
		return eventCommentService.loadComment(eventId, commentId).get(0);
		
	}
	
	@RequestMapping(value = "/{eventId}/comments", method= RequestMethod.GET)
	public List<EventCommentEntity> loadComments(@PathVariable("eventId") Long eventId) {
		
		return eventCommentService.loadComment(eventId, null);
		
	}
	
	@RequestMapping(value = "/{eventId}/comments", method= RequestMethod.POST)
	public EventCommentEntity addComment(@PathVariable("eventId") Long eventId, @RequestBody EventCommentEntity eventCommentEntity) {
		eventCommentEntity.setEvent(new EventEntity(eventId));
		
		return eventCommentService.addComment(eventCommentEntity);
		
	}
		
	@RequestMapping(value = "/{eventId}/comments/{commentId}", method= RequestMethod.DELETE)
	public void removeComment(@PathVariable("eventId") Long eventId, @PathVariable("commentId") Long commentId) {
		
		eventCommentService.removeComment(commentId);
		
	}
	
	@RequestMapping(value = "/{eventId}/comments", method= RequestMethod.PUT)
	public EventCommentEntity editComment(@PathVariable("eventId") Long eventId, @RequestBody EventCommentEntity eventCommentEntity) {
		eventCommentEntity.setEvent(new EventEntity(eventId));
		
		return eventCommentService.updateComment(eventCommentEntity);
		
	}
}
