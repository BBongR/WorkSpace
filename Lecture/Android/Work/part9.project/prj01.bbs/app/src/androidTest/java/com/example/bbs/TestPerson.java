package com.example.bbs;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.example.bbs.http.HttpPerson;
import com.example.bbs.model.ModelPerson;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@FixMethodOrder(org.junit.runners.MethodSorters.NAME_ASCENDING) // 이름 순서대로
public class TestPerson {
    private static HttpPerson http = null;

    @BeforeClass
    public static void setup() {
        http = new HttpPerson();
    }

    @Test
    public void test01_curtime() throws Exception {

        long result = http.curtime();
        assertTrue(result > 0);

    }

    @Test
    public void test02_loginperson() throws Exception {

        long result = http.loginperson("id1", "pw1");
        assertTrue(result == 1);

        result = http.loginperson("iiid1", "pppw1");
        assertTrue(result == 0);

    }

    @Test
    public void test03_selectparam() throws Exception {

        List<ModelPerson> result = http.selectparam("name1");
        assertNotNull(result);
        assertTrue(result.size() > 0);

    }

    @Test
    public void test04_selectmodel() throws Exception {

        ModelPerson person = new ModelPerson("aaa", "aaa", "aaa", "aaa");

        List<ModelPerson> result = http.selectmodel(person);
        assertNotNull(result);
        assertTrue(result.size() > 0);

    }

    @Test
    public void test05_selectjson() throws Exception {

        ModelPerson person = new ModelPerson("aaa", "aaa", "aaa", "aaa");

        List<ModelPerson> result = http.selectjson(person);
        assertNotNull(result);
        assertTrue(result.size() > 0);

    }

    @Test
    public void test06_selectmap() throws Exception {

        ModelPerson person = new ModelPerson("aaa", "aaa", "aaa", "aaa");

        List<ModelPerson> result = http.selectmap(person, "asc");
        assertNotNull(result);
        assertTrue(result.size() > 0);

    }

    @Test
    public void test07_selectpaging() throws Exception {

        List<ModelPerson> result = http.selectpaging(0, 10);
        assertNotNull(result);
        assertTrue(result.size() > 0);

    }

    @Test
    public void test08_insertparam() throws Exception {

        boolean result = http.insertparam("aaa");
        assertTrue(result);

    }

    @Test
    public void test09_insertmodel() throws Exception {

        ModelPerson person = new ModelPerson("aaa", "aaa", "aaa", "aaa");

        boolean result = http.insertmodel(person);
        assertTrue(result);

    }

    @Test
    public void test10_insertjsonobject() throws Exception {

        ModelPerson person = new ModelPerson("aaa", "aaa", "aaa", "aaa");

        boolean result = http.insertjsonobject(person);
        assertTrue(result);

    }

    @Test
    public void test11_insertjsonarray() throws Exception {

        ModelPerson person = null;
        List<ModelPerson> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            person = new ModelPerson();
            person.setId("aaa"+i);
            person.setPw("aaa"+i);
            person.setName("aaa"+i);
            person.setEmail("aaa"+i);

            list.add(person);
        }

        boolean result = http.insertjsonarray(list);
        assertTrue(result);

    }
}
