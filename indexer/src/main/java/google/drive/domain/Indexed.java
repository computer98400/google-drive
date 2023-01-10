package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String indexdate;

    public Indexed(Index aggregate){
        super(aggregate);
    }
    public Indexed(){
        super();
    }
}
