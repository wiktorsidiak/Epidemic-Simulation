package com.treative.EpidemicSimulation.Controller;

import com.treative.EpidemicSimulation.Model.simulationParameter;
import com.treative.EpidemicSimulation.Service.simulationParameterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class addParameterController {

    private final simulationParameterService parameterService;

    @RequestMapping(value = {"/addParameter"}, method = RequestMethod.POST)
    public void addParameter(@RequestBody simulationParameter parameter) {
            parameterService.createParameter(parameter);
        }

    }

