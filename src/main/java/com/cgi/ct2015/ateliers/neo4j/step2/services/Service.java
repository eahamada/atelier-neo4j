package com.cgi.ct2015.ateliers.neo4j.step2.services;

public interface Service<T> {

  Iterable<T> findAll();

  T find(Long id);

  void delete(Long id);

  T createOrUpdate(T object);

}