package com.juprado.placeservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.juprado.placeservice.domain.PlaceRepository;
import com.juprado.placeservice.domain.PlaceService;

@Configuration
public class PlaceConfig {
	@Bean
	PlaceService placeService(PlaceRepository placeRepository) {
		return new PlaceService(placeRepository);
	}
}