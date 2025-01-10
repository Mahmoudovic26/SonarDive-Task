package com.task.sonardive.mappers;

import com.task.sonardive.dto.CompanyDto;
import com.task.sonardive.entities.Company;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = CountryMapper.class)
public interface CompanyMapper {
    @Mapping(source = "company.country", target = "country")
    CompanyDto toDto(Company company, @Context CountryService countryService);
}