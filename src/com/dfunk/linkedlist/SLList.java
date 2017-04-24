/**
 * 
 */
package com.dfunk.linkedlist;

import com.dfunk.node.SLNode;

/**
 * @author dfunk
 *
 */
public class SLList<T> implements ISLList<T>{

    private SLNode<T> head = null;
    private int size = 0;
    
    /**
     * 
     */
    public SLList() {
        
    }
    
    /* (non-Javadoc)
     * @see com.dfunk.linkedlist.ISLList#size()
     */
    @Override
    public int size() {
        return size;
    }
    
    /* (non-Javadoc)
     * @see com.dfunk.linkedlist.ISLList#add(java.lang.Object)
     */
    @Override
    public void add(T item) {
        SLNode<T> node = new SLNode<T>();
        node.item(item);

        if (head != null) {            
            node.next(head);
            head = node;
        } 
        else {
            head = node;
        }        
        size++;
    }
    
    /* (non-Javadoc)
     * @see com.dfunk.linkedlist.ISLList#remove(java.lang.Object)
     */
    @Override
    public T remove(T item) {
        T rItem = null;
        
        if (head != null && head.item().equals(item)) {
            rItem = head.item();
            head = null;
            size--;
        }
        else {
            SLNode<T> prev = head;
            SLNode<T> cur = head.next();
            while (cur != null) {
                if (cur.item().equals(item)) {
                    rItem = cur.item();
                    prev.next(cur.next());
                    size--;
                    break;
                }
                cur = cur.next();
            }
        }
        return rItem;
    }

    /* (non-Javadoc)
     * @see com.dfunk.linkedlist.ISLList#removeAll(java.lang.Object)
     */
    @Override
    public int removeAll(T item) {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see com.dfunk.linkedlist.ISLList#removeDuplicates(java.lang.Object)
     */
    @Override
    public int removeDuplicates(T item) {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see com.dfunk.linkedlist.ISLList#find(java.lang.Object)
     */
    @Override
    public T find(T item) {

        for(SLNode<T> p = head; p != null; p = p.next()) {
            if (p.item().equals(item)) {
                return p.item();
            }
        }
        return null;
    }
    
}
