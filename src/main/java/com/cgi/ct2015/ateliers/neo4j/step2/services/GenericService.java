package com.cgi.ct2015.ateliers.neo4j.step2.services;

import org.neo4j.ogm.session.Session;

import com.cgi.ct2015.ateliers.neo4j.step2.entities.Entity;
import com.cgi.ct2015.ateliers.neo4j.step2.session.Neo4jSessionFactory;

public abstract class GenericService<T> implements Service<T> {

  private static final int DEPTH_LIST = 0;
  private static final int DEPTH_ENTITY = 1;
  protected Session session = Neo4jSessionFactory.getInstance().getNeo4jSession();

  @Override
  public Iterable<T> findAll() {
      return session.loadAll(getEntityType(), DEPTH_LIST);
  }

  @Override
  public T find(Long id) {
      return session.load(getEntityType(), id, DEPTH_ENTITY);
  }

  @Override
  public void delete(Long id) {
      session.delete(session.load(getEntityType(), id));
  }
  

  @Override
  public T createOrUpdate(T entity) {
      session.save(entity, DEPTH_ENTITY);
      return find(((Entity) entity).getId());
  }

  public abstract Class<T> getEntityType();
 }