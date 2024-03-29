package com.letscatchup.group.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letscatchup.group.domain.entity.GroupMemberEntity;
import com.letscatchup.group.domain.repository.GroupMemberCrudRepository;

@Service
public class GroupMemberService {
	
	@Autowired
	GroupMemberCrudRepository groupMemberCrudRepository;
	
	public GroupMemberEntity addMember(GroupMemberEntity member) {
		return groupMemberCrudRepository.save(member);
	}
	
	public void deleteMember(GroupMemberEntity member) {
		groupMemberCrudRepository.delete(member);
	}
	
}
