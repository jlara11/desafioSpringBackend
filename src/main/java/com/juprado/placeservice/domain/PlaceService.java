package com.juprado.placeservice.domain;

import com.juprado.placeservice.api.PlaceResponse;

import reactor.core.publisher.Mono;

public class PlaceService{
	private PlaceRepository placeRepository;

	public PlaceService(PlaceRepository placeRepository) {
		this.placeRepository = placeRepository;
	}
	
	public Mono<Place> create(PlaceResponse request){
		return placeRepository.save(request);
	}
	
}