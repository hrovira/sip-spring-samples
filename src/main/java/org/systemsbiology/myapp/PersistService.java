package org.systemsbiology.myapp;

/**
 * @author: hrovira
 */
public interface PersistService<T> {
    public void persist(T object) throws Exception;

    public void delete(T object) throws Exception;
}
