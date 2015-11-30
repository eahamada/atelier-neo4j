package com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;

@NodeEntity
public class Player extends Entity{

  @JsonProperty
	private String name;

	@Relationship(type = "IN_SQUAD", direction = Relationship.OUTGOING)
	private List<Squad> squadList = new ArrayList<Squad>();



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Squad> getSquadList() {
		return squadList;
	}

	public void setSquadList(List<Squad> squadList) {
		this.squadList = squadList;
	}

}
