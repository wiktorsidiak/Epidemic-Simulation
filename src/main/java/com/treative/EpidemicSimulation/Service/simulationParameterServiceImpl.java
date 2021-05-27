package com.treative.EpidemicSimulation.Service;

import com.treative.EpidemicSimulation.DAO.simulationDefinitionDAO;
import com.treative.EpidemicSimulation.DAO.simulationParameterDAO;
import com.treative.EpidemicSimulation.Model.simulationDefinition;
import com.treative.EpidemicSimulation.Model.simulationParameter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class simulationParameterServiceImpl implements simulationParameterService {

    private final simulationParameterDAO parameterDAO;
    private final simulationDefinitionDAO definitionDAO;

    @Override
    public void createParameter(simulationParameter parameter) {
        simulationDefinition definition = new simulationDefinition();
        definition.setDay(1);
        definition.setPi(parameter.getI());
        definition.setPv(parameter.getP() - parameter.getI());
        definition.setPm(0);
        definition.setPr(0);
        definitionDAO.createDefinition(definition);

        for (int i = 2; i <= parameter.getTs(); i++) {
            definition.setDay(i);
            definition.setPi(definition.getPi() * (parameter.getR()));
            if (definition.getPi() > parameter.getP()) {
                definition.setPi(parameter.getP() - definition.getPm() - definition.getPr());
            }
            definition.setPv((parameter.getP() - definition.getPi() - definition.getPr()- definition.getPm()));
            if (definition.getPv() < 0) {
                definition.setPv(0);
            }
            definitionDAO.createDefinition(definition);

            if (i % parameter.getTm() == 0) {
                definition.setPm(definition.getPm() + parameter.getM());
                if(definition.getPm() > definition.getPi()){
                    definition.setPm(definition.getPi()/2);
                }
            }
            int infect = 1;
            if (i % parameter.getTi() == 0) {
                if (definition.getPr() == 0) {
                    definition.setPr(parameter.getI() - definition.getPm());
                } else {
                    definition.setPr((definition.getPr() + ((parameter.getI() * (parameter.getR() * infect) - definition.getPm()))));
                    infect++;
                }
            }
            parameterDAO.addParameter(parameter);
        }
    }
    @Override
    public void deleteParameter(simulationParameter parameter) {
        parameterDAO.deleteParameter(parameter);
    }
}

