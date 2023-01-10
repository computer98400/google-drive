package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String userid;
    private String filename;
    private String filesize;
    private String filetype;
    private String updatedate;
}


