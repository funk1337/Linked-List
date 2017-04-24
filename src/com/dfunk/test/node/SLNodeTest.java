/**
 * 
 */
package com.dfunk.test.node;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dfunk.node.SLNode;

/**
 * @author dfunk
 *
 */
public class SLNodeTest {

    /**
     * Test method for {@link com.dfunk.node.SLNode#SLNode()}.
     */
    @Test
    public void testSLNode() {
        SLNode<Integer> node = new SLNode<Integer>();        

        assertNotEquals(null, node);
        assertEquals(null, node.item());
        assertEquals(null, node.next());       
    }

    /**
     * Test method for {@link com.dfunk.node.SLNode#item()}.
     */
    @Test
    public void testGetSetData() {
        SLNode<Integer> node = new SLNode<Integer>();        

        assertNotEquals(null, node);
        
        node.item(1);

        assertTrue(node.item().equals(1));
    }

    /**
     * Test method for {@link com.dfunk.node.SLNode#next()}.
     */
    @Test
    public void testGetSetNext() {
        SLNode<Integer> node = new SLNode<Integer>();
        SLNode<Integer> nextNode = new SLNode<Integer>();
        
        node.item(1);
        nextNode.item(2);
        node.next(nextNode);
        
        assertSame(nextNode, node.next());
        assertTrue(node.item().equals(1));
        assertTrue(node.next().item().equals(2));
        assertEquals(null, node.next().next());
    }
}
