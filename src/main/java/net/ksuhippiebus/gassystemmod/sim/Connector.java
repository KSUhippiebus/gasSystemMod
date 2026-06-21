package net.ksuhippiebus.gassystemmod.sim;

public class Connector {
    public float flowMult = 1;
    public float poweredFlowMult = 1;
    public float heatFlowMult = 1;
    public float poweredHeatFlowMult = 1;
    public boolean canFlowForward = true;
    public boolean canFlowBackward = true;
    public boolean canMoveHeat = true; // when gas moves
    public boolean canExchangeHeat = true; // without gas movement

    public Container containerA;
    public Container containerB;

    public Connector() {}

    public static Connector Pump() {
        Connector connector = new Connector();

        connector.canFlowBackward = false;
        connector.canExchangeHeat = false;

        connector.flowMult = 0;
        connector.poweredFlowMult = 3;

        return connector;
    }

    public static Connector HeatExchanger() {
        Connector connector = new Connector();

        connector.canFlowForward = false;
        connector.canFlowBackward = false;
        connector.canMoveHeat = false;
        connector.canExchangeHeat = true;

        connector.heatFlowMult = 3;

        return connector;
    }
}
