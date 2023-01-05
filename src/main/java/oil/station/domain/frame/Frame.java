package oil.station.domain.frame;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Frame {

    private UUID id;

    private Long wellId;

    private Double voltage;

    private Double current;

    private Double speed;

    private Double frequency;

    private Double temperature;

    private Double pressure;

    private Double liquidFlowRate;

    private LocalDateTime creationDateTime;

    private boolean isCriticalValue;

}