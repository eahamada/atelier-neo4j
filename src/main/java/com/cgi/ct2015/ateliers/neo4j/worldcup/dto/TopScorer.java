package com.cgi.ct2015.ateliers.neo4j.worldcup.dto;

import java.util.List;

import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes.Player;
import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes.WorldCup;

public class TopScorer {
  public final Player p;
  public final int goals;
  public final List<WorldCup> competions;
  private TopScorer(Builder builder) {
    this.p = builder.p;
    this.goals = builder.goals;
    this.competions = builder.competions;
  }
  public static class Builder{

    private Player p;
    private int goals;
    private List<WorldCup> competions;
    public Builder withP(Player p) {
      this.p = p;
      return this;
    }
    public Builder withGoals(int goals) {
      this.goals = goals;
      return this;
    }
    public Builder withCompetions(List<WorldCup> competions) {
      this.competions = competions;
      return this;
    }
    public TopScorer build() {
      return new TopScorer(this);
    }
  }
}
