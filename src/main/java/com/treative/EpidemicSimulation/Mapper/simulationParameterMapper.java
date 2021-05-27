package com.treative.EpidemicSimulation.Mapper;

import com.treative.EpidemicSimulation.Model.simulationParameter;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class simulationParameterMapper implements RowMapper<simulationParameter> {

    @Override
    public simulationParameter mapRow(ResultSet resultSet, int rowNum) throws SQLException {
       simulationParameter parameter = new simulationParameter();
       parameter.setN(resultSet.getString("n"));
       parameter.setP(resultSet.getInt("p"));
       parameter.setI(resultSet.getInt("i"));
       parameter.setR(resultSet.getInt("r"));
       parameter.setM(resultSet.getInt("m"));
       parameter.setTi(resultSet.getInt("ti"));
       parameter.setTm(resultSet.getInt("tm"));
       parameter.setTs(resultSet.getInt("ts"));
        return parameter;
    }
}
