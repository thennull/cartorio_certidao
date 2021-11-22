package com.linux.webservices.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommonApiInterface <T>{
   
   List<T> fetchAll();
   
   T fetchOne(String name);
   
   T saveOne(T t);
}
