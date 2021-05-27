package com.treative.EpidemicSimulation.Service;

import com.treative.EpidemicSimulation.Model.simulationDefinition;


import java.util.List;

public interface simulationDefinitionService {

    List<simulationDefinition> getDefinition();

    void deleteDefinition(simulationDefinition definition);
}
