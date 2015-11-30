package com.cgi.ct2015.ateliers.neo4j.step2;

import java.util.Arrays;

import com.cgi.ct2015.ateliers.neo4j.step2.entities.Connait;
import com.cgi.ct2015.ateliers.neo4j.step2.entities.Member;
import com.cgi.ct2015.ateliers.neo4j.step2.services.MemberService;
import com.cgi.ct2015.ateliers.neo4j.step2.session.Neo4jSessionFactory;
import com.google.common.collect.ImmutableSet;

public class Step2 {
  public static void main(String[] args) throws Exception {
    MemberService memberService = new MemberService();
    // Neo4jSessionFactory.getInstance().getNeo4jSession().purgeDatabase();
    Neo4jSessionFactory.getInstance().getNeo4jSession().deleteAll(Member.class);

    Member elarif = new Member();
    elarif.setPrenom("El-Arif");
    elarif.setNom("AHAMADA");
    elarif.setCoefficient(130);
    elarif.setAime(Arrays.asList("shell", "debian", "asian food", "tea"));

    Member thnouremi = new Member();
    thnouremi.setPrenom("Thnouremi");
    thnouremi.setNom("PEN");
    thnouremi.setCoefficient(130);
    thnouremi.setAime(Arrays.asList("Java", "cinema", "photographie", "Stacraft 2"));

    elarif = memberService.createOrUpdate(elarif);
    thnouremi = memberService.createOrUpdate(thnouremi);

    Connait connait = new Connait();
    connait.setDepuis(2013);
    connait.setStart(elarif);
    connait.setEnd(thnouremi);

    elarif.setConnus(ImmutableSet.of(connait));
    memberService.createOrUpdate(elarif);
    memberService.updateCoefficient(elarif, 150);
  }
}
