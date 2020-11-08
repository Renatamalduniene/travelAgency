package com.example.travelAgency.model;

import javax.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long roleId;
    private String role;
    private Long userId;

    public Role() {

    }

    public Role(Long roleId, String role, Long userId) {
        this.roleId = roleId;
        this.role = role;
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "roleId=" + roleId +
                ", role='" + role + '\'' +
                ", userId=" + userId +
                '}';
    }
}
