package com.citiesProject.dio.countries.repositories;

import com.citiesProject.dio.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
