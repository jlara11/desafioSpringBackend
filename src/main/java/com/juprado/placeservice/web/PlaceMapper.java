package com.juprado.placeservice.web;

import com.juprado.placeservice.api.PlaceResponse;
import com.juprado.placeservice.domain.Place;

public class PlaceMapper{
	public static PlaceResponse fromPlaceToResponse(Place place) {
		return new PlaceResponse(place.name(),place.slug(),place.state(),place.createdAt(),place.updatedAt());
	}
}