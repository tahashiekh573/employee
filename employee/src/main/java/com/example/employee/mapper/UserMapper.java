package com.example.employee.mapper;

import com.example.employee.dto.UserDto;
import com.example.employee.entity.UserEntity;

public class UserMapper {

    // ENTITY TO DTO
    public static UserDto toDTO(UserEntity user) {

        UserDto dto = new UserDto();

        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setRole(user.getRole());

        return dto;
    }

    // DTO TO ENTITY
    public static UserEntity toEntity(UserDto dto) {

        UserEntity user = new UserEntity();

        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setRole(dto.getRole());

        return user;
    }
}