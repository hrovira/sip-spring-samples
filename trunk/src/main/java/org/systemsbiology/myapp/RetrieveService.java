package org.systemsbiology.myapp;

/**
 * @author: hrovira
 */
public interface RetrieveService<T, K> {
    public T retrieve(K identifier);
}
