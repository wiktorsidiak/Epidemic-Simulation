package com.treative.EpidemicSimulation.Service;

import com.treative.EpidemicSimulation.DAO.simulationDefinitionDAO;
import com.treative.EpidemicSimulation.Model.simulationDefinition;
import com.treative.EpidemicSimulation.Model.simulationParameter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class simulationDefinitionServiceImpl implements simulationDefinitionService{

    private final simulationDefinitionDAO definitionDAO;
    private simulationParameter parameter;

    @Override
    public void createDefinition(simulationDefinition definition) {;

        definition.setDay(1);
        definition.setPi(parameter.getI());
        definition.setPv(parameter.getP() - parameter.getI());
        definition.setPm(0);
        definition.setPr(0);
        definitionDAO.createDefinition(definition);

        for (int i = 2; i <= parameter.getTs(); i++){
           definition.setDay(i);
           definition.setPi(parameter.getI() * parameter.getR());
           definition.setPv(parameter.getP() - definition.getPi());

           if(i%parameter.getTm() == 0){
               definition.setPm(definition.getPm() + parameter.getM());
           }
           if (i%parameter.getTi() == 0){
               int infect = 1;
               if(definition.getPr() == 0) {
                   definition.setPr(parameter.getI()  - definition.getPm());
               }else{
                   definition.setPr((definition.getPr() + ((parameter.getI() * (parameter.getR() * infect) - definition.getPm()))));
               }
           }
         if (definition.getPi() > parameter.getP()){
             definition.setPi(parameter.getP());
         }else if(definition.getPi() > definition.getPr()){
             definition.setPr(parameter.getP());
         }else if(definition.getPr() > parameter.getP()){
             definition.setPr(parameter.getP());
             definition.setPv(0);
             definition.setPi(0);
         }
            definitionDAO.createDefinition(definition);
        }
    }

    @Override
    public List<simulationDefinition> getDefinition() {
        return definitionDAO.getDefinition();
    }
}
