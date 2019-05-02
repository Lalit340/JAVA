package com.lp.beans;

import java.util.Arrays;

public class TourPlace {
	private String[]  places;

	public void setPlaces(String[] places) {
		this.places = places;
	}

	@Override
	public String toString() {
		return "TourPlace [places=" + Arrays.toString(places) + "]";
	}

}
