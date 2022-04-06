package giphy.pikachu.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import giphy.pikachu.Models.DataObject;
import giphy.pikachu.Repositories.DataRepository;

@Service
public class DataService {

    @Autowired
    DataRepository dataRepo;
    
    public int addToDb(DataObject data){
        int errorCode = dataRepo.insertIntoTable(data);
        return errorCode;
    }
}
