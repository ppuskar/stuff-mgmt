package com.stuff.mgmt.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "group_master")
public class Group {

	@GeneratedValue
	@Id
	@Column(name = "group_id")
	private int groupId;

	@ManyToMany(mappedBy = "memberOf")
	private List<User> members;

}
