package com.letscatchup.event.domain.entity;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.letscatchup.core.domain.entity.BaseEntity;
import com.letscatchup.user.domain.entity.UserEntity;

@Entity
@Table(name="LCU_EV_COMMENTS")
@AttributeOverride(name="id", column=@Column(name="EVC_ID"))
@SequenceGenerator(name="Id_Generator", sequenceName = "LCU_EV_COMMENTS_ID_SEQ")
public class EventCommentEntity extends BaseEntity {

	@Column(name="EVC_COMMENT")
	private String content;
	
	@Column(name="EVC_DATETIME")
	private Date date;
	
	@Column(name="EVC_LAST_EDIT_DATETIME")
	private Date lastEditDate;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name="EVC_EV_ID")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private EventEntity event;
	
	@ManyToOne
	@JoinColumn(name="EVC_USR_ID")
	private UserEntity user;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getLastEditDate() {
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate) {
		this.lastEditDate = lastEditDate;
	}

	public EventEntity getEvent() {
		return event;
	}

	public void setEvent(EventEntity event) {
		this.event = event;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

}
