package com.treative.EpidemicSimulation.Controller;

import com.treative.EpidemicSimulation.Model.simulationDefinition;
import com.treative.EpidemicSimulation.Service.simulationDefinitionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class getDefinitionController {

    private final simulationDefinitionService definitionService;
    private simulationDefinition definition;

    @RequestMapping(value = {"/definition"}, method = RequestMethod.GET)
    public List<simulationDefinition> getDefinition(){
        return definitionService.getDefinition();
    }
}
