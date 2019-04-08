package com.oanhk.MyContact.repository;

import com.oanhk.MyContact.entity.contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface contactRepository extends CrudRepository<contact,Integer> {
    List<contact> findByNameContaining(String term);


}
