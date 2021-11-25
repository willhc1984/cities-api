package com.github.william.citiesapi.countries.repositories;

import com.github.william.citiesapi.countries.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
