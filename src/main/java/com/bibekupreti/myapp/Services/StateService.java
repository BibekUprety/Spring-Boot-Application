package com.bibekupreti.myapp.Services;

import com.bibekupreti.myapp.Dao.StateDao;
import com.bibekupreti.myapp.Models.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    private StateDao stateDao;
    @Autowired
    public StateService(StateDao stateDao) {
        this.stateDao = stateDao;
    }

//    get all the State
    public List<State> getAllState(){
        return stateDao.findAll();
    }

//    to add the State
    public void addState(State state){
         stateDao.save(state);
    }
//    get by id
    public Optional<State> getById(Integer id){
        return stateDao.findById(id);
    }
//    delete the state
    public void deleteState(int id){
        stateDao.deleteById(id);
    }
}
