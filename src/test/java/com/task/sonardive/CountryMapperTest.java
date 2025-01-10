package com.task.sonardive;

import com.task.sonardive.dto.CountryDto;
import com.task.sonardive.entities.Country;
import com.task.sonardive.mappers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class CountryMapperTest {

    @Mock
    private CountryService countryService;

    @InjectMocks
    private CountryMapper countryMapper = new CountryMapperImpl();

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldMapCountryToDto() {
        // given
        Country country = new Country();
        country.setId(1);
        country.setIsoCode("US");

        // Mock the behavior of CountryService
        Mockito.when(countryService.getName("US")).thenReturn("name of US");

        // when
        CountryDto result = countryMapper.toDto(country, countryService);

        // then
        assertNotNull(result);
        assertEquals(1, result.id());
        assertEquals("name of US", result.name());
    }
}
