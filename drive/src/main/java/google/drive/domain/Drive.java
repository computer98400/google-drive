package google.drive.domain;

import google.drive.domain.FileUploaded;
import google.drive.DriveApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Drive_table")
@Data

public class Drive  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String userid;
    
    
    
    
    
    private String filename;
    
    
    
    
    
    private String filesize;
    
    
    
    
    
    private String filetype;
    
    
    
    
    
    private String updatedate;

    @PostPersist
    public void onPostPersist(){


        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();

    }

    public static DriveRepository repository(){
        DriveRepository driveRepository = DriveApplication.applicationContext.getBean(DriveRepository.class);
        return driveRepository;
    }






}
