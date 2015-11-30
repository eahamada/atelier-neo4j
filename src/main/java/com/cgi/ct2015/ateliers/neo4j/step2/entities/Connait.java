package com.cgi.ct2015.ateliers.neo4j.step2.entities;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type="CONNAIT")
public class Connait extends Entity {
  @Property(name="depuis")
  private int depuis;
  @StartNode
  private Member start;
  @EndNode
  private Member end;
  public Connait() {
  }
  public int getDepuis() {
    return depuis;
  }
  public void setDepuis(int depuis) {
    this.depuis = depuis;
  }
  public Member getStart() {
    return start;
  }
  public void setStart(Member start) {
    this.start = start;
  }
  public Member getEnd() {
    return end;
  }
  public void setEnd(Member end) {
    this.end = end;
  }
}
