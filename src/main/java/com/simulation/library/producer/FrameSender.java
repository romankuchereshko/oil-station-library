package com.simulation.library.producer;

import java.util.Collection;

import com.simulation.library.domain.Frame;

public interface FrameSender {

    void send(Collection<Frame> frames, String topic);

}
