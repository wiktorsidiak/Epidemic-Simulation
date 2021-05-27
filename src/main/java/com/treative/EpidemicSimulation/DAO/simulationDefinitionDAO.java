package com.treative.EpidemicSimulation.DAO;

import com.treative.EpidemicSimulation.Model.simulationDefinition;

import java.util.List;

public interface simulationDefinitionDAO {

    void createDefinition(simulationDefinition definition);

    List<simulationDefinition> getDefinition();
}
