/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itstep.java.web.controller;

import java.util.ArrayList;
import java.util.List;
import org.itstep.java.web.model.Good;
import org.itstep.java.web.service.GoodService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;

/**
 *
 * @author zeus
 */
public class GoodControllerTest {
    
    class TestableGoodController extends GoodController {

        public void setGoodService(GoodService goodService) {
            this.goodService = goodService;
        }
        
    }
    
    public GoodControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of all method, of class GoodController.
     */
    @Test
    public void testAll() {
        System.out.println("all");
        Integer id = 1;
        Model model = new BindingAwareModelMap();
        TestableGoodController instance = new TestableGoodController();
        instance.setGoodService(new GoodService() {

            @Override
            public List<Good> all() {
                return new ArrayList<>();
            }

            @Override
            public List<Good> all(Integer categoryId) {
                return new ArrayList<>();
            }
        });
        String expResult = "all";
        String result = instance.all(id, model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of test method, of class GoodController.
     */
    @Test
    public void testTest() {
        System.out.println("test");
        BindingAwareModelMap model = new BindingAwareModelMap();
        TestableGoodController instance = new TestableGoodController();
        
        instance.setGoodService(new GoodService() {

            @Override
            public List<Good> all() {
                return new ArrayList<>();
            }

            @Override
            public List<Good> all(Integer categoryId) {
                return new ArrayList<>();
            }
        });
        
        
        String expResult = "test";
        String result = instance.test(6f, 2f, model);
        assertEquals(expResult, result);
       
        assertEquals(3f, model.get("result"));
        
        instance.test(14f, 2f, model);
        assertEquals(7f, model.get("result"));
        
        instance.test(15f, 2f, model);
        assertEquals(7.5f, model.get("result"));
        
        instance.test(15f, 0f, model);
        assertTrue(Float.isInfinite((Float)model.get("result")));
    }
    
}
