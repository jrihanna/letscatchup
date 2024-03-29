package com.letscatchup.group.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letscatchup.group.domain.entity.GroupEntity;
import com.letscatchup.group.domain.entity.GroupMemberEntity;
import com.letscatchup.group.domain.repository.GroupCrudRepository;

@Service
public class GroupService {

	@Autowired
	private GroupCrudRepository groupCrudRepository;
	
	
	public GroupEntity addGroup(GroupEntity groupEntity) {
		
		return groupCrudRepository.save(groupEntity);
		
	}
	
	public GroupEntity updateGroup(GroupEntity groupEntity) {
		
		return groupCrudRepository.save(groupEntity);
		
	}
	
	public void deleteGroup(Long groupId) {
		
		groupCrudRepository.delete(groupId);
		
	}

	public GroupEntity loadGroup(Long groupId) {
		
		return groupCrudRepository.findOne(groupId);
		
	}
	
}
