package com.citiesProject.dio.countries.resources;

import com.citiesProject.dio.countries.entities.Country;
import com.citiesProject.dio.countries.repositories.CountryRepository;
import com.citiesProject.dio.cities.resources.CityResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("countries")
public class CountryResource {

  private static Logger log = LoggerFactory.getLogger(CityResource.class);
  private final CountryRepository repository;

  public CountryResource(final CountryRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public Page<Country> countries(final Pageable page) {
    log.info("countries, {}", page);
    return repository.findAll(page);
  }
}
