package com.LeydiGuiral.Leydi_Guiral_VerbosHttp.Repository;

import com.LeydiGuiral.Leydi_Guiral_VerbosHttp.Model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<GroceryItem, String> {

}
