package com.treative.EpidemicSimulation.DAO;

import com.treative.EpidemicSimulation.Model.simulationParameter;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
@RequiredArgsConstructor
public class simulationParameterDAOImpl implements simulationParameterDAO {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void addParameter(simulationParameter parameter) {
        String SQLParameter = "INSERT INTO simulation_parameter(n,p,i,r,m,ti,tm,ts) VALUES (?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(SQLParameter, parameter.getN(), parameter.getP(),
                parameter.getI(), parameter.getR(), parameter.getM(), parameter.getTi(),
                parameter.getTm(), parameter.getTs());
    }

    @Override
    public void deleteParameter(simulationParameter parameter) {
        String SQLParameter = "DELETE FROM simulation_parameter";
        jdbcTemplate.execute(SQLParameter);
    }
}