package google.drive.domain;

import google.drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Indexed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String indexdate;
}
