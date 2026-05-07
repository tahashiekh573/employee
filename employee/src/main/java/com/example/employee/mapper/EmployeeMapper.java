package com.example.employee.mapper;

import com.example.employee.dto.EmployeeDto;
import com.example.employee.entity.EmployeeEntity;

public class EmployeeMapper {

    // ENTITY -> DTO
    public static EmployeeDto toDto(EmployeeEntity entity) {

        EmployeeDto dto = new EmployeeDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dto.setUserType(entity.getUserType());

        if (entity.getDepartment() != null) {

            dto.setDeptId(entity.getDepartment().getId());
            dto.setDeptName(entity.getDepartment().getDeptName());
        }

        return dto;
    }

    // DTO -> ENTITY
    public static EmployeeEntity toEntity(EmployeeDto dto) {

        EmployeeEntity entity = new EmployeeEntity();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setUserType(dto.getUserType());

        return entity;
    }
}