package com.treative.EpidemicSimulation.Service;

import com.treative.EpidemicSimulation.DAO.simulationParameterDAO;
import com.treative.EpidemicSimulation.Model.simulationParameter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class simulationParameterServiceImpl implements simulationParameterService {

    private final simulationParameterDAO parameterDAO;

    @Override
    public void createParameter(simulationParameter parameter) {
        parameterDAO.addParameter(parameter);
    }
}
