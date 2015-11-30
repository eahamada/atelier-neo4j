package com.cgi.ct2015.ateliers.neo4j.worldcup.services;

import org.neo4j.ogm.session.Session;

import com.cgi.ct2015.ateliers.neo4j.step2.session.Neo4jSessionFactory;
import com.cgi.ct2015.ateliers.neo4j.worldcup.dto.WinnerHost;
import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes.Country;
import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes.Player;

public class QuizzService {
  protected Session session = Neo4jSessionFactory.getInstance().getNeo4jSession();

  public Player findPlayerByName(String name) {
    return null;
  }

  public Iterable<Player> findUnusedPlayersAcrossWorldCups() {
    return null;
  }

  public Iterable<Country> findFinalistHosts() {
    return null;
  }

  public Iterable<WinnerHost> findWinnerHosts() {
    return null;
  }
}
