package com.cgi.ct2015.ateliers.neo4j.step1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.neo4j.ogm.session.transaction.Transaction;

import com.google.common.collect.ImmutableMap;

public class Step1 {
  public static void main(String[] args) throws Exception {
    SessionFactory sessionFactory = new SessionFactory();
    Session session = sessionFactory.openSession("http://localhost:7474", "neo4j", "j4oen");
    Transaction tx = session.beginTransaction();
    try {
      Map<String, Object> params = new HashMap<String, Object>();
      
      String query = "match (n) detach delete n";
      session.query(query, params);
      
      Map<String, Object> props = new HashMap<String, Object>();

      props.put("prenom", "El-Arif");
      props.put("nom", "AHAMADA");
      props.put("coefficient", Integer.valueOf(130));
      props.put("aime", Arrays.asList("shell", "debian", "asian food", "tea"));
      
      params.put( "props", props );
      query = "CREATE (n:Membre {props})";
      session.query(query, params);
      
      props.clear();
      props.put("prenom", "Thnouremi");
      props.put("nom", "PEN");
      props.put("coefficient", Integer.valueOf(130));
      props.put("aime", Arrays.asList("JAVA", "Cinema", "Photographie", "Starcraft 2"));
      
      session.query(query, params);
      
      props.clear();
      Map<String, Object> thnouremi = ImmutableMap.of("prenom", "Thnouremi");
      Map<String, Object> elarif = ImmutableMap.of("prenom", "El-Arif");
      Map<String, Object> r = ImmutableMap.of("depuis", Integer.valueOf(2013));
      params= ImmutableMap.of("thnouremi", thnouremi,
                             "elarif", elarif, "r", r);
      query = "match (n:Membre {prenom: {thnouremi}.prenom}), (p:Membre {prenom: {elarif}.prenom}) create (n)-[r:CONNAIT {r}]->(p)";
      session.query(query, params);
      
      tx.commit();
    } catch (Exception e) {
      tx.rollback();
    } finally {
      tx.close();
    }
  }
}
