package google.drive.infra;
import google.drive.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class DriveHateoasProcessor implements RepresentationModelProcessor<EntityModel<Drive>>  {

    @Override
    public EntityModel<Drive> process(EntityModel<Drive> model) {

        
        return model;
    }
    
}
