package com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;

@NodeEntity(label = "Squad")
public class Squad extends Entity{
  
  @JsonProperty
	private String name;

	@Relationship(type = "FOR_WORLD_CUP", direction = Relationship.OUTGOING)
	private List<WorldCup> worldCupList = new ArrayList<WorldCup>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<WorldCup> getWorldCupList() {
		return worldCupList;
	}

	public void setWorldCupList(List<WorldCup> worldCupList) {
		this.worldCupList = worldCupList;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("[name:").append(getName()).append("]");

		return sb.toString();
	}
}
