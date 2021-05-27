package com.treative.EpidemicSimulation.Model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "simulation_parameter")
@Data
public class simulationParameter {
    @Column(name = "N")
    String N;
    @Column(name = "P")
    int P;
    @Column(name = "I")
    int I;
    @Column(name = "R")
    int R;
    @Column(name = "M")
    int M;
    @Column(name = "Ti")
    int Ti;
    @Column(name = "Tm")
    int Tm;
    @Column(name = "Ts")
    int Ts;

}
