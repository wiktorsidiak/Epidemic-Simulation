package com.treative.EpidemicSimulation.Model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "simulation_definition")
@Data
public class simulationDefinition {
   @Column(name = "day")
   int day;
   @Column(name = "Pi")
   int Pi;
   @Column(name = "Pv")
   int Pv;
   @Column(name = "Pm")
   int Pm;
   @Column(name = "Pr")
   int Pr;
}
