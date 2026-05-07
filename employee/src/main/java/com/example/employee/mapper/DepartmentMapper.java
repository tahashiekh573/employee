package com.example.employee.mapper;

import com.example.employee.dto.DepartmentDto;
import com.example.employee.entity.DepartmentEntity;

public class DepartmentMapper {

    // ENTITY -> DTO
    public static DepartmentDto toDto(DepartmentEntity entity) {

        DepartmentDto dto = new DepartmentDto();

        dto.setId(entity.getId());
        dto.setDeptName(entity.getDeptName());
        dto.setCodeName(entity.getCodeName());
        dto.setSalary(entity.getSalary());

        return dto;
    }

    // DTO -> ENTITY
    public static DepartmentEntity toEntity(DepartmentDto dto) {

        DepartmentEntity entity = new DepartmentEntity();

        entity.setId(dto.getId());
        entity.setDeptName(dto.getDeptName());
        entity.setCodeName(dto.getCodeName());
        entity.setSalary(dto.getSalary());

        return entity;
    }
}