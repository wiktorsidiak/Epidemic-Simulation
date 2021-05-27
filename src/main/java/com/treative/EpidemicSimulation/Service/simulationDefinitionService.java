package com.treative.EpidemicSimulation.Service;

import com.treative.EpidemicSimulation.Model.simulationDefinition;


import java.util.List;

public interface simulationDefinitionService {

    void createDefinition(simulationDefinition definition);

    List<simulationDefinition> getDefinition();
}
