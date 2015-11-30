package com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;

@NodeEntity(label = "Country")
public class Country extends Entity {

  @JsonProperty
	private String name;

	@JsonProperty
	private Double longitude;

	@JsonProperty
	private Double lattitude;

	@Relationship(type = "NAMED_SQUAD", direction = Relationship.OUTGOING)
	private List<Squad> squadList;

	@Relationship(type = "PLAYED_IN", direction = Relationship.OUTGOING)
	private List<Match> matchList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLattitude() {
		return lattitude;
	}

	public void setLattitude(Double lattitude) {
		this.lattitude = lattitude;
	}

	public List<Squad> getSquadList() {
		return squadList;
	}

	public void setSquadList(List<Squad> squadList) {
		this.squadList = squadList;
	}

	public List<Match> getMatchList() {
		return matchList;
	}

	public void setMatchList(List<Match> matchList) {
		this.matchList = matchList;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("[name:").append(getName()).append("]");
		sb.append("[longitude:").append(getLongitude()).append("]");
		sb.append("[lattitude:").append(getLattitude()).append("]");

		return sb.toString();
	}
}
