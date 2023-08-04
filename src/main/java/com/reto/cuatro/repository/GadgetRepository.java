package com.reto.cuatro.repository;

import com.reto.cuatro.entity.Gadget;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GadgetRepository extends MongoRepository<Gadget,Integer> {
}
