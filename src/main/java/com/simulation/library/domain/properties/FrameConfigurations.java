package com.simulation.library.domain.properties;

import com.simulation.library.domain.Value;

public interface FrameConfigurations {

    Value getVoltage();

    Value getCurrent();

    Value getSpeed();

    Value getFrequency();

    Value getTemperature();

    Value getPressure();

    Value getLiquidFlowRate();

}
