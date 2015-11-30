package com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes;

import org.neo4j.ogm.annotation.NodeEntity;

import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;

@NodeEntity
public class Year extends Entity{
  @JsonProperty private Integer year;

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
