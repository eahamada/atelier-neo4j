package com.cgi.ct2015.ateliers.neo4j.step2.services;

import java.util.Map;

import org.neo4j.ogm.session.transaction.Transaction;

import com.cgi.ct2015.ateliers.neo4j.step2.entities.Member;
import com.google.common.collect.ImmutableMap;

public class MemberService extends GenericService<Member>{
  
  public void updateCoefficient(Member m, int newCoefficient){
    String query = "MATCH (m) WHERE id(m)={m} SET m.coefficient={newCoefficient}";
    Map<String, ?> params = ImmutableMap.of("m", m.getId(), "newCoefficient",newCoefficient);
    Transaction tx = session.beginTransaction();
    session.query(query, params);
    tx.commit();
    tx.close();
  }
  
  public void addConnaissanceWithCypher(Member start, Member end, int depuis){
      String query = "MATCH ($69) WHERE id($69)={$69} MATCH ($70) WHERE id($70)={$70} MERGE ($69)-[_0:`CONNAIT`{depuis:{_0_props}.depuis}]->($70)";
      Map<String, ?> props = ImmutableMap.of("depuis", depuis);
      Map<String, ?> params = ImmutableMap.of("$69", start.getId(), "$70", end.getId(), "_0_props",props);
      Transaction tx = session.beginTransaction();
      session.query(query, params);
      tx.commit();
      tx.close();
    }
  
    @Override 
    public Class<Member> getEntityType() {
        return Member.class;
    }
}
