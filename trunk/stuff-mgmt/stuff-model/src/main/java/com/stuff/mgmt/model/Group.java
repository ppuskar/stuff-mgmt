package com.stuff.mgmt.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "group_master")
public class Group {

	@GeneratedValue
	@Id
	@Column(name = "group_id")
	private int groupId;

	@OneToMany(mappedBy = "group")
	private List<GroupMember> groupMember;

	/**
	 * @return the groupId
	 */
	public int getGroupId() {
		return groupId;
	}

	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	/**
	 * @return the groupMember
	 */
	public List<GroupMember> getGroupMember() {
		return groupMember;
	}

	/**
	 * @param groupMember the groupMember to set
	 */
	public void setGroupMember(List<GroupMember> groupMember) {
		this.groupMember = groupMember;
	}

}
