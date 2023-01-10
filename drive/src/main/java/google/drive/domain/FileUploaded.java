package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String userid;
    private String filename;
    private String filesize;
    private String filetype;
    private String updatedate;

    public FileUploaded(Drive aggregate){
        super(aggregate);
    }
    public FileUploaded(){
        super();
    }
}
