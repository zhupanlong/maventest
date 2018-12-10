package com.chatRobot.service;

public interface IService<T> {

    public T selectByPrimaryKey(String id);

}