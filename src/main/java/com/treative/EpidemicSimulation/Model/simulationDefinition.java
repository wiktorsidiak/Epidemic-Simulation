package com.treative.EpidemicSimulation.Model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "simulation_definition")
@Data
public class simulationDefinition {
   @Column(name = "day")
   int day;
   @Column(name = "pi")
   int Pi;
   @Column(name = "pv")
   int Pv;
   @Column(name = "pm")
   int Pm;
   @Column(name = "pr")
   int Pr;
}
