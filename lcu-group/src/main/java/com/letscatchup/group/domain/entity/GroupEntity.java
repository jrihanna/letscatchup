package com.letscatchup.group.domain.entity;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.letscatchup.core.domain.entity.BaseEntity;
import com.letscatchup.user.domain.entity.UserEntity;

@Entity
@Table(name="LCU_GROUP")
@AttributeOverride(name="id", column=@Column(name="GR_ID"))
@SequenceGenerator(name="Id_Generator", sequenceName = "LCU_GROUP_ID_SEQ")
public class GroupEntity extends BaseEntity {

	public GroupEntity() {}
	
	public GroupEntity(long groupId) {
		this.setId(groupId);
	}
	
	@Column(name="GR_NAME")
	private String name;
	
	@Column(name="GR_START_DATE")
	private Date startDate;
	
	@Column(name="GR_DESCRIPTION")
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="GR_ORGANISER")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private UserEntity organiser;
	
	/*@OneToMany(mappedBy = "member")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<UserEntity> members;*/

	/*@OneToMany(mappedBy = "member")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<GroupComment> comments; 
*/
	
	public String getName() {
		return name;
	}

	/*public List<UserEntity> getMembers() {
		return members;
	}

	public void setMembers(List<UserEntity> members) {
		this.members = members;
	}*/

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserEntity getOrganiser() {
		return organiser;
	}

	public void setOrganiser(UserEntity organiser) {
		this.organiser = organiser;
	}
	
}
