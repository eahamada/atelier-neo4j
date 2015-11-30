package com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes;

import org.neo4j.ogm.annotation.NodeEntity;

import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;

@NodeEntity
public class Time extends Entity{

  @JsonProperty
  private String time;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
