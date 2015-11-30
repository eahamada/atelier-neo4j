package com.cgi.ct2015.ateliers.neo4j.worldcup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cgi.ct2015.ateliers.neo4j.worldcup.dto.WinnerHost;
import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes.Country;
import com.cgi.ct2015.ateliers.neo4j.worldcup.entities.nodes.Player;
import com.cgi.ct2015.ateliers.neo4j.worldcup.services.QuizzService;

public class Quizz {

  private static final Logger LOGGER = LoggerFactory.getLogger(Quizz.class);

  public static void main(String[] args) throws Exception {
    QuizzService quizzService = new QuizzService();
//    Player zidane = quizzService.findPlayerByName("Zinedine Zidane");
//    LOGGER.info(zidane.getName());
//    Iterable<Player> useless = quizzService.findUnusedPlayersAcrossWorldCups();
//    for (Player player : useless) {
//      LOGGER.info(player.getName());
//    }
//    Iterable<Country> finalistHosts = quizzService.findFinalistHosts();
//    for (Country country : finalistHosts) {
//      LOGGER.info(country.getName());
//    }
//    
    Iterable<WinnerHost> winnerHosts = quizzService.findWinnerHosts();
    for (WinnerHost winnerHost : winnerHosts) {
      LOGGER.info(winnerHost.hostName+":"+winnerHost.worldCupName);
    }
    
  }
}
