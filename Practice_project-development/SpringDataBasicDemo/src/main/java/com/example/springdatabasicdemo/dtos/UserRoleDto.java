package com.example.springdatabasicdemo.dtos;

import com.example.springdatabasicdemo.enums.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class UserRoleDto {

    private Integer id;
    @Enumerated(EnumType.ORDINAL)
    private Role role;


    public UserRoleDto(){
    }

    public UserRoleDto(Integer id, Role role) {
        this.id = id;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserRoleDto{" +
                "id=" + id +
                ", role=" + role +
                '}';
    }
}
