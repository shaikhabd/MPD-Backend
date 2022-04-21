package com.mpdb.demo.repo;

import com.mpdb.demo.models.Mpd;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MpdRepo extends MongoRepository<Mpd,String> {

}
