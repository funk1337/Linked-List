/**
 * 
 */
package com.dfunk.node;

/**
 * @author dfunk
 *
 */
public class SLNode<T> {
    private T item = null;
    private SLNode<T> next = null;
    
    public SLNode() {
        
    }

    public T item() {
        return item;
    }

    public void item(T item) {
        this.item = item;
    }

    public SLNode<T> next() {
        return next;
    }

    public void next(SLNode<T> next) {
        this.next = next;
    }    
}
