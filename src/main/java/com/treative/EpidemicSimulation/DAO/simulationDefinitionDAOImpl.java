package com.treative.EpidemicSimulation.DAO;

import com.treative.EpidemicSimulation.Mapper.simulationDefinitionMapper;
import com.treative.EpidemicSimulation.Model.simulationDefinition;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
@RequiredArgsConstructor
public class simulationDefinitionDAOImpl implements  simulationDefinitionDAO{

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void createDefinition(simulationDefinition definition) {
        String SQLDefinition = "INSERT INTO simulation_definition(day, pi, pv, pm, pr) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(SQLDefinition, definition.getDay(), definition.getPi(),definition.getPv(),
                definition.getPm(),definition.getPr());
    }

    @Override
    public List<simulationDefinition> getDefinition() {
            String SQLSimulation = "SELECT * FROM simulation_definition";
            RowMapper<simulationDefinition> definitionMapper = new simulationDefinitionMapper();
            return jdbcTemplate.query(SQLSimulation, definitionMapper);
    }
}
