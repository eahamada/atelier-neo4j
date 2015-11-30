package com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes;

import org.neo4j.ogm.annotation.NodeEntity;

import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;

@NodeEntity
public class Goal extends Entity {

  @JsonProperty private Integer time;

	@JsonProperty private Integer matchId;

	@JsonProperty private String playerId;

	@JsonProperty private String goal;

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public Integer getMatchId() {
		return matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

}
