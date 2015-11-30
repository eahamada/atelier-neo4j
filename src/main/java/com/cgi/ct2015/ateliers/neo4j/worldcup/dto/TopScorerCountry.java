package com.cgi.ct2015.ateliers.neo4j.worldcup.dto;

public class TopScorerCountry {
  public final String playerName;
  public final int goals;
  public final String country;

  private TopScorerCountry(Builder builder) {
    this.playerName = builder.playerName;
    this.goals = builder.goals;
    this.country = builder.country;
  }

  public static class Builder {

    private String playerName;
    private int goals;
    private String country;

    public Builder withPlayerName(String playerName) {
      this.playerName = playerName;
      return this;
    }

    public Builder withGoals(int goals) {
      this.goals = goals;
      return this;
    }

    public Builder withCountry(String country) {
      this.country = country;
      return this;
    }

    public TopScorerCountry build() {
      return new TopScorerCountry(this);
    }
  }
}
