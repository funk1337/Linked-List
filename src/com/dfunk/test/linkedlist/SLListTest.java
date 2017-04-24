/**
 * 
 */
package com.dfunk.test.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dfunk.linkedlist.*;

/**
 * @author dfunk
 *
 */
public class SLListTest {

    /**
     * Test method for {@link com.dfunk.linkedlist.SLList#SLList()}.
     */
    @Test
    public void testSLList() {
        ISLList<Integer> linkedList = new SLList<Integer>();

        assertNotNull(linkedList);
    }
    
    /**
     * Test method for {@link com.dfunk.linkedlist.SLList#add()}.
     */
    @Test
    public void testAdd() {
        ISLList<Integer> linkedList = new SLList<Integer>();
        
        linkedList.add(1);
        
        assertEquals(1, linkedList.size());
        assertTrue(1 == linkedList.find(1));
    }
    
    /**
     * Test method for {@link com.dfunk.linkedlist.SLList#remove()}.
     */
    @Test
    public void testRemove() {
        ISLList<Integer> linkedList1 = new SLList<Integer>();
        ISLList<Integer> linkedList2 = new SLList<Integer>();
        ISLList<Integer> linkedList3 = new SLList<Integer>();
                
        linkedList1.add(1);
        linkedList1.remove(1);

        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(3);
        linkedList2.remove(2);
        
        linkedList3.add(1);
        linkedList3.add(2);
        linkedList3.remove(2);
        
        assertNull(linkedList1.find(1));
        assertEquals(0, linkedList1.size());
        
        assertNull(linkedList2.find(2));
        assertEquals(2, linkedList2.size());
        
        assertNull(linkedList3.find(2));
        assertEquals(1, linkedList3.size());
    }

    /**
     * Test method for {@link com.dfunk.linkedlist.SLList#removeAll()}.
     */
    @Test
    public void testremoveAll() {
        fail("NOT YET IMPLEMENTED");        
    }
    
    /**
     * Test method for {@link com.dfunk.linkedlist.SLList#removeDuplicates()}.
     */
    @Test
    public void testRemoveDuplicates() {
        fail("NOT YET IMPLEMENTED");        
    }

    /**
     * Test method for {@link com.dfunk.linkedlist.SLList#find()}.
     */
    @Test
    public void testFind() {
        ISLList<Integer> linkedList1 = new SLList<Integer>();
        ISLList<Integer> linkedList2 = new SLList<Integer>();
        
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(3);
        
        assertNull(linkedList1.find(1));
        assertTrue(linkedList2.find(1).equals(1));
        assertTrue(linkedList2.find(2).equals(2));
        assertTrue(linkedList2.find(3).equals(3));
        assertNull(linkedList2.find(4));
    }
}
