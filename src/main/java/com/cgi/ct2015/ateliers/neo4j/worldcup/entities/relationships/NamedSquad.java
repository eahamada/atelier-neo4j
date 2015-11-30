package com.cgi.ct2015.ateliers.neo4j.worldcup.entities.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes.Country;
import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes.Squad;

@RelationshipEntity(type = "NAMED_SQUAD")
public class NamedSquad {

	private Long id;

	@StartNode
	private Country country;

	@EndNode
	private Squad squad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Squad getSquad() {
		return squad;
	}

	public void setSquad(Squad squad) {
		this.squad = squad;
	}
}
