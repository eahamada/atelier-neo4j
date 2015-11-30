package com.cgi.ct2015.ateliers.neo4j.step0;

import java.util.Collections;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.neo4j.ogm.session.transaction.Transaction;

public class Step0 {
  @SuppressWarnings("unchecked" )
  public static void main(String[] args) throws Exception {
    SessionFactory sessionFactory = new SessionFactory();
    Session session = sessionFactory.openSession("http://localhost:7474", "neo4j", "j4oen");

    Transaction tx = session.beginTransaction();
    try {
      String query = "CREATE (n:Membre { prenom :'El-Arif', nom:'AHAMADA', coefficient: 130, aime: ['shell', 'debian', 'asian food','tea'] })";
      session.query(query, Collections.EMPTY_MAP);
      
      query = "CREATE (n:Membre { prenom :'Thnouremi', nom:'PEN', coefficient: 130, aime: ['JAVA', 'Cinema', 'Photographie', 'Stacraft 2'] })";
      session.query(query, Collections.EMPTY_MAP);
      
      query = "match (n:Membre {prenom:'Thnouremi'}), (p:Membre {prenom:'El-Arif'}) create (n)-[r:CONNAIT {depuis: 2013}]->(p)";
      session.query(query, Collections.EMPTY_MAP);
      
      tx.commit();
    } catch (Exception e) {
      tx.rollback();
    } finally {
      tx.close();
    }
  }
}
