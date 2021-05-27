package com.treative.EpidemicSimulation.Service;

import com.treative.EpidemicSimulation.DAO.simulationDefinitionDAO;
import com.treative.EpidemicSimulation.Model.simulationDefinition;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class simulationDefinitionServiceImpl implements simulationDefinitionService{

    private final simulationDefinitionDAO definitionDAO;

    @Override
    public List<simulationDefinition> getDefinition() {
        return definitionDAO.getDefinition();
    }

    @Override
    public void deleteDefinition(simulationDefinition definition) {
    definitionDAO.deleteDefinition(definition);
    }
}
