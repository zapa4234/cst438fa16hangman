package edu.csumb.cst438fa16hangman;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.HashSet;
import org.junit.Test;

public class HashSetTest {
    @Test
    public void testInitiallyEmpty() {
	HashSet<String> hset = new HashSet<String>();
	assertTrue(hset.isEmpty());
    }

    @Test
    public void testInitiallyEmptyIterator() {
	HashSet<String> hset = new HashSet<String>();
	assertFalse(hset.iterator().hasNext());
    }

    @Test
    public void testFirstInSingletonSet() {
	HashSet<String> hset = new HashSet<String>();
	hset.add("one");
	String first = hset.iterator().next();
	assertTrue(first.equals("one"));
    }

    @Test
    public void testFirstInSingletonSet_withAssertEquals() {
	HashSet<String> hset = new HashSet<String>();
	hset.add("one");
	String first = hset.iterator().next();
	assertEquals("one", first);
    }

    @Test
    public void testFirstInSingletonSet_withAssertThat() {
	HashSet<String> hset = new HashSet<String>();
	hset.add("one");
	String first = hset.iterator().next();
	assertThat("one", equalTo(first));
    }

    @Test
    public void testFirstBelongs() {
	HashSet<String> hset = new HashSet<String>();
	hset.add("1st");
	hset.add("2nd");
	String first = hset.iterator().next();
	assertThat(first, anyOf(is("1st"), is("2nd")));
    }
}
