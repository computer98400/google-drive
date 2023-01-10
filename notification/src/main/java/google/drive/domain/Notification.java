package google.drive.domain;

import google.drive.domain.Notified;
import google.drive.NotificationApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Notification_table")
@Data

public class Notification  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        Notified notified = new Notified(this);
        notified.publishAfterCommit();

    }

    public static NotificationRepository repository(){
        NotificationRepository notificationRepository = NotificationApplication.applicationContext.getBean(NotificationRepository.class);
        return notificationRepository;
    }




    public static void notifyToUser(StreamProcessed streamProcessed){

        /** Example 1:  new item 
        Notification notification = new Notification();
        repository().save(notification);

        */

        /** Example 2:  finding and process
        
        repository().findById(streamProcessed.get???()).ifPresent(notification->{
            
            notification // do something
            repository().save(notification);


         });
        */

        
    }
    public static void notifyToUser(FileUploaded fileUploaded){

        /** Example 1:  new item 
        Notification notification = new Notification();
        repository().save(notification);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(notification->{
            
            notification // do something
            repository().save(notification);


         });
        */

        
    }


}
