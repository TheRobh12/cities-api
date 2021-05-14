package com.github.robsonbsantos.citiesapi.countries.repository;

import com.github.robsonbsantos.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long> {
}
