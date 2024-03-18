package it.pagopa.pn.datavault.mapper;

import it.pagopa.pn.datavault.generated.openapi.server.v1.dto.ConfidentialTimelineElementDto;
import it.pagopa.pn.datavault.middleware.db.entities.NotificationTimelineEntity;
import org.springframework.stereotype.Component;

@Component
public class NotificationTimelineEntityConfidentialTimelineElementDtoMapper  extends AddressesToDtoMapper
        implements BaseMapperInterface<ConfidentialTimelineElementDto, NotificationTimelineEntity> {


    private NotificationTimelineEntityConfidentialTimelineElementDtoMapper(){
        super();
    }

    @Override
    public NotificationTimelineEntity toEntity(ConfidentialTimelineElementDto dto) {
        final NotificationTimelineEntity target = new NotificationTimelineEntity();
        target.setTimelineElementId(dto.getTimelineElementId());
        target.setTaxId(dto.getTaxId());
        target.setDenomination(dto.getDenomination());

        if(dto.getDigitalAddress() != null){
            target.setDigitalAddress(toDigitalAddress(dto.getDigitalAddress()));
        }
        if(dto.getPhysicalAddress() != null){
            target.setPhysicalAddress(toPhysicalAddress(dto.getPhysicalAddress()));
        }
        if(dto.getNewPhysicalAddress() != null){
            target.setNewPhysicalAddress(toPhysicalAddress(dto.getNewPhysicalAddress()));
        }
        return target;
    }

    @Override
    public ConfidentialTimelineElementDto toDto(NotificationTimelineEntity entity) {
        final ConfidentialTimelineElementDto target = new ConfidentialTimelineElementDto();

        target.setTimelineElementId(entity.getTimelineElementId());
        target.setTaxId(entity.getTaxId());
        target.setDenomination(entity.getDenomination());

        if(entity.getDigitalAddress() != null){
            target.setDigitalAddress(toDigitalAddressDto(entity.getDigitalAddress()));
        }
        if(entity.getPhysicalAddress() != null){
            target.setPhysicalAddress(toAnalogDomicile(entity.getPhysicalAddress()));
        }
        if(entity.getNewPhysicalAddress() != null){
            target.setNewPhysicalAddress(toAnalogDomicile(entity.getNewPhysicalAddress()));
        }
        return target;
    }
}
