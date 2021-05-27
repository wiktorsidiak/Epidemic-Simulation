package com.treative.EpidemicSimulation.DAO;

import com.treative.EpidemicSimulation.Model.simulationDefinition;
import com.treative.EpidemicSimulation.Model.simulationParameter;

import java.util.List;

public interface simulationParameterDAO {

    void addParameter(simulationParameter parameter);

    void deleteParameter(simulationParameter parameter);
}
