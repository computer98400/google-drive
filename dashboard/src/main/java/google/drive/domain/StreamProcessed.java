package google.drive.domain;

import google.drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class StreamProcessed extends AbstractEvent {

    private Long id;
    private String videourl;
    private String processdate;
}
