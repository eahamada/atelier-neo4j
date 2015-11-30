package com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes;

import org.neo4j.ogm.annotation.NodeEntity;

import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;

@NodeEntity
public class Phase extends Entity {
  @JsonProperty private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("[name:").append(getName()).append("]");

		return sb.toString();
	}
}
