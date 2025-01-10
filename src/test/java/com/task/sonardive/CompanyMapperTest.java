package com.task.sonardive;

import com.task.sonardive.dto.CompanyDto;
import com.task.sonardive.dto.CountryDto;
import com.task.sonardive.entities.Company;
import com.task.sonardive.entities.Country;
import com.task.sonardive.mappers.CompanyMapperImpl;
import com.task.sonardive.mappers.CountryMapper;
import com.task.sonardive.mappers.CountryService;
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
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class CompanyMapperTest {

    @Mock
    private CountryService countryService;

    @Mock
    private CountryMapper countryMapper;

    @InjectMocks
    private CompanyMapperImpl companyMapper;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldMapCompanyToDto() {
        // given
        Country country = new Country(1, "US");
        Company company = new Company(1, "Test Company", country);

        // Mock the behavior of CountryMapper
        Mockito.when(countryMapper.toDto(country, countryService))
                .thenReturn(new CountryDto(1, "name of US"));

        // when
        CompanyDto result = companyMapper.toDto(company, countryService);

        // then
        assertNotNull(result);
        assertEquals(1, result.id());
        assertEquals("Test Company", result.name());
        assertNotNull(result.country());
        assertEquals(1, result.country().id());
        assertEquals("name of US", result.country().name());

        // Verify only CountryMapper interaction
        verify(countryMapper).toDto(country, countryService);
    }
}
