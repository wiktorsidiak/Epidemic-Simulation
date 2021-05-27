package com.treative.EpidemicSimulation.Mapper;

import com.treative.EpidemicSimulation.Model.simulationDefinition;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class simulationDefinitionMapper implements RowMapper<simulationDefinition> {

    @Override
    public simulationDefinition mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        simulationDefinition definition = new simulationDefinition();
        definition.setDay(resultSet.getInt("day"));
        definition.setPi(resultSet.getInt("pi"));
        definition.setPv(resultSet.getInt("pv"));
        definition.setPm(resultSet.getInt("pm"));
        definition.setPr(resultSet.getInt("pr"));
        return definition;
    }
}
