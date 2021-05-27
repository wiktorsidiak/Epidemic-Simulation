package com.treative.EpidemicSimulation.Model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "simulation_parameter")
@Data
public class simulationParameter {
    @Column(name = "n")
    String N;
    @Column(name = "p")
    int P;
    @Column(name = "i")
    int I;
    @Column(name = "r")
    int R;
    @Column(name = "m")
    int M;
    @Column(name = "ti")
    int Ti;
    @Column(name = "tm")
    int Tm;
    @Column(name = "ts")
    int Ts;

}
