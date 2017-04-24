/**
 * 
 */
package com.dfunk.linkedlist;

/**
 * @author dfunk
 *
 */
public interface ISLList<T> {
    int size();
    void add(T item);
    T remove(T item);
    int removeAll(T item);
    int removeDuplicates(T item);
    T find(T item);
}
