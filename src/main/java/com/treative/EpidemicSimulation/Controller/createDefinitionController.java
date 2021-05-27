package com.treative.EpidemicSimulation.Controller;

import com.treative.EpidemicSimulation.Model.simulationDefinition;
import com.treative.EpidemicSimulation.Service.simulationDefinitionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class createDefinitionController {

    private final simulationDefinitionService definitionService;

    @RequestMapping(value = {"/createDefinition"}, method = RequestMethod.POST)
    public void createDefinition(@RequestBody simulationDefinition definition){
        definitionService.createDefinition(definition);

    }
}
