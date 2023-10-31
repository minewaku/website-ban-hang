package com.minewaku.dto;

public class RolePermissionDTO {

	private int roleId;
	private int permisionId;
	private String action;
	private boolean active;
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getPermisionId() {
		return permisionId;
	}
	public void setPermisionId(int permisionId) {
		this.permisionId = permisionId;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
