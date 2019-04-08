package com.oanhk.MyContact.service;

import com.oanhk.MyContact.entity.contact;
import com.oanhk.MyContact.repository.contactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class contactServiceImpl implements contactService {


    @Autowired
    private contactRepository contactRepository;


    @Override
    public Iterable<contact> findAll() {
        return contactRepository.findAll();
    }

    @Override
    public List<contact> search(String term) {
        return contactRepository.findByNameContaining(term);
    }

    @Override
    public Optional<contact> findOne(Integer id) {
        return contactRepository.findById(id);
    }

    @Override
    public void save(contact user) {
            contactRepository.save(user);
    }

    @Override
    public void delete(Integer id) {

    }
}
