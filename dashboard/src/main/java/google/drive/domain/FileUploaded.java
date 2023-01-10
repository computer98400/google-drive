package google.drive.domain;

import google.drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String userid;
    private String filename;
    private String filesize;
    private String filetype;
    private String updatedate;
}
