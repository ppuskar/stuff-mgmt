package com.stuff.mgmt.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class GroupMember {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="group_member_id")
	private int groupMembershipId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User member;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="group_id")
	private Group group;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "member", cascade = CascadeType.ALL)
	private Expense expense;
	/**
	 * @return the groupMembershipId
	 */
	public int getGroupMembershipId() {
		return groupMembershipId;
	}
	/**
	 * @param groupMembershipId the groupMembershipId to set
	 */
	public void setGroupMembershipId(int groupMembershipId) {
		this.groupMembershipId = groupMembershipId;
	}
	/**
	 * @return the member
	 */
	public User getMember() {
		return member;
	}
	/**
	 * @param member the member to set
	 */
	public void setMember(User member) {
		this.member = member;
	}
	/**
	 * @return the group
	 */
	public Group getGroup() {
		return group;
	}
	/**
	 * @param group the group to set
	 */
	public void setGroup(Group group) {
		this.group = group;
	}
	
	

}
