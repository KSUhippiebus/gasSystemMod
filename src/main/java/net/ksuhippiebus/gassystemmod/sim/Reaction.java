package net.ksuhippiebus.gassystemmod.sim;

import java.util.List;

public record Reaction(
        List<GasType> inputs,
        List<GasType> outputs,
        Boolean needsSpark,
        float activationTemp,
        float activationPressure,
        float energyChange
) {
}
