package com.happy.how;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmileRepository extends MongoRepository<Smile, Long>{

}
