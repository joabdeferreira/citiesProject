package com.citiesProject.dio.states.repositories;

import com.citiesProject.dio.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
