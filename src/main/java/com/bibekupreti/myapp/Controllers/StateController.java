package com.bibekupreti.myapp.Controllers;


import com.bibekupreti.myapp.Models.State;
import com.bibekupreti.myapp.Services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {

    private StateService stateService;
    @Autowired
    public StateController(StateService stateService) {
        this.stateService = stateService;
    }


    @GetMapping("/state")
    public String getAllState(Model model){
        List<State> stateList = stateService.getAllState();
        model.addAttribute("state",stateList);
        return "state";

    }

    @PostMapping("/state/addState")
    public String addState(State state){
        stateService.addState(state);
        return "redirect:/state";
    }
    @RequestMapping("/state/findById")
    @ResponseBody
    public Optional<State> findById(Integer id){
        return stateService.getById(id);
    }

    @RequestMapping(value = "/state/update",method ={ RequestMethod.PUT,RequestMethod.GET})
    public String update(State state){
        stateService.addState(state);
        return "redirect:/state";
    }
    @RequestMapping(value = "/state/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String deleteState(int id){
        stateService.deleteState(id);
        return "redirect:/state";
    }


}
