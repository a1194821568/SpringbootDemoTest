package com.zhanghui.entity;

import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="user_role")
public class UserRole {

	private Long id;
	private Long userId;
	private Long roleId;
	private Integer status;
}
