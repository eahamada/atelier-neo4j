package com.cgi.ct2015.ateliers.neo4j.worldcup.dto;

public class WinnerHost {
  public final String hostName;
  public final String worldCupName;
  private WinnerHost(Builder builder) {
    this.hostName = builder.hostName;
    this.worldCupName = builder.worldCupName;
  }
  public static class Builder{

    private String hostName;
    private String worldCupName;
    public Builder withHostName(String hostName) {
      this.hostName = hostName;
      return this;
    }
    public Builder withWorldCupName(String worldCupName) {
      this.worldCupName = worldCupName;
      return this;
    }
    public WinnerHost build() {
      return new WinnerHost(this);
    }
  }
}
