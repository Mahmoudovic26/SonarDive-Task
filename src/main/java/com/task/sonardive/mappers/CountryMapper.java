package com.task.sonardive.mappers;

import com.task.sonardive.dto.CountryDto;
import com.task.sonardive.entities.Country;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    @Mapping(target = "name", expression = "java(countryService.getName(country.getIsoCode()))")
    CountryDto toDto(Country country, @Context CountryService countryService);
}