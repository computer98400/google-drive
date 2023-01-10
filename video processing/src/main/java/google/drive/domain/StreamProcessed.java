package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StreamProcessed extends AbstractEvent {

    private Long id;
    private String videourl;
    private String processdate;

    public StreamProcessed(Video aggregate){
        super(aggregate);
    }
    public StreamProcessed(){
        super();
    }
}
