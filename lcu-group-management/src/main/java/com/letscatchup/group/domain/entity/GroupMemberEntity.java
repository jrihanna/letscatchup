package com.letscatchup.group.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.letscatchup.group.type.MemberStatus;
import com.letscatchup.user.domain.entity.UserEntity;

//@Entity
public class GroupMemberEntity {
	
//	@EmbeddedId
//	private GroupMemberId groupMemberId; 
//	
//	@ManyToOne
//    @MapsId("userId")
//    @JoinColumn(name = "GRM_USR_ID")
//	private UserEntity member;
//	
//	@ManyToOne
//    @MapsId("groupId")
//    @JoinColumn(name = "GRM_GR_ID")
//	private GroupEntity group;
//	
//	@Column(name="GRM_DATE")
//	private Date joinDate;
//	
//	@Column(name="GRM_STATUS")
//	private MemberStatus status;
//
//	public GroupMemberId getGroupMemberId() {
//		return groupMemberId;
//	}
//
//	public void setGroupMemberId(GroupMemberId groupMemberId) {
//		this.groupMemberId = groupMemberId;
//	}
//
//	public UserEntity getMember() {
//		return member;
//	}
//
//	public void setMember(UserEntity member) {
//		this.member = member;
//	}
//
//	public GroupEntity getGroup() {
//		return group;
//	}
//
//	public void setGroup(GroupEntity group) {
//		this.group = group;
//	}
//
//	public Date getJoinDate() {
//		return joinDate;
//	}
//
//	public void setJoinDate(Date joinDate) {
//		this.joinDate = joinDate;
//	}
//
//	public MemberStatus getStatus() {
//		return status;
//	}
//
//	public void setStatus(MemberStatus status) {
//		this.status = status;
//	}	

}

//@Embeddable
class GroupMemberId {

//	@Column(name="GRM_USR_ID")
//	@Id
//	UserEntity userId;
//
//	@Column(name="GRM_GR_ID")
//	@Id
//	GroupEntity groupId;
}