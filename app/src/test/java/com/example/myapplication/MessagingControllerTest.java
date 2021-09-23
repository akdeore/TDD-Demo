package com.example.myapplication;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MessagingControllerTest {
    MessagingController messagingController;
    Message message;
    @Before
    public void setUp(){
        messagingController = new MessagingController();
    }

    @Test
    public void returnRandomString(){
        message = new Message();
        message.setMessage("hello");
        message.setPhoneNumber("8888888888");

        String randomString = messagingController.getRandomString(message);
        Assert.assertEquals(message.getMessage(), randomString);
    }
}