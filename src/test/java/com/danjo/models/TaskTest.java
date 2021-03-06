package com.danjo.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;


public class TaskTest {
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateAnInstanceOfTask() throws Exception {
        Task t = new Task();
        assertThat(t, instanceOf(Task.class));
        assertTrue(t.getCreatedAt().getTime() > 0);
        assertTrue(t.getUpdatedAt().getTime() > 0);
    }

    @Test
    public void shouldGetAndSetIdOnTask() throws Exception {
        Task t = new Task();
        t.setId(3);
        assertEquals(3, t.getId());
    }

    @Test
    public void shouldGetAndSetNameOnTask() throws Exception {
        Task t = new Task();
        t.setName("Get Milk");
        assertEquals("Get Milk", t.getName());
    }

    @Test
    public void shouldGetAndSetCategoryOnTask() throws Exception {
        Task t = new Task();
        t.setCategory("Home");
        assertEquals("Home", t.getCategory());
    }

    @Test
    public void shouldGetAndSetDueOnTask() throws Exception {
        Task t = new Task();
        t.setDue(format.parse("2016-09-14"));
        assertEquals(format.parse("2016-09-14"), t.getDue());
    }

    @Test
    public void shouldGetAndSetIsCompleteOnTask() throws Exception {
        Task t = new Task();
        t.setIsComplete(true);
        assertTrue(t.getIsComplete());
    }

    @Test
    public void shouldGetAndSetCreatedAtOnTask() throws Exception {
        Task t = new Task();
        t.setCreatedAt(format.parse("2016-09-14"));
        assertEquals(format.parse("2016-09-14"), t.getCreatedAt());
    }

    @Test
    public void shouldGetAndSetUpdatedAtOnTask() throws Exception {
        Task t = new Task();
        t.setUpdatedAt(format.parse("2016-09-14"));
        assertEquals(format.parse("2016-09-14"), t.getUpdatedAt());
    }

    @Test
    public void shouldUpdateTheTimeOnTask() throws Exception {
        Task t = new Task();
        t.setUpdatedAt(null);
        t.updateTime();
        assertTrue(t.getUpdatedAt().getTime() > 0);
    }
}