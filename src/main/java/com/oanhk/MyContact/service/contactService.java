package com.oanhk.MyContact.service;

import com.oanhk.MyContact.entity.contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface contactService {
    Iterable<contact> findAll();
    List<contact> search(String term);
    Optional<contact> findOne(Integer id);
    void save(contact user);
    void delete(Integer id);
}
