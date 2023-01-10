package google.drive.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="DashBoard_table")
@Data
public class DashBoard {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String fileid;
        private String filesize;
        private Boolean isindex;
        private Boolean uploaded;
        private String videourl;
        private Date uploadDate;


}
