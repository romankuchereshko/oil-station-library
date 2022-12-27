package oil.station.domain.frame;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;
import oil.station.domain.value.Value;

@Data
@Builder(toBuilder = true)
public class Frame {

    private UUID frameId;

    private UUID wellId;

    private Value voltage;

    private Value current;

    private Value speed;

    private Value frequency;

    private Value temperature;

    private Value pressure;

    private Value liquidFlowRate;

    private LocalDateTime creationDateTime;

}