package it.pagopa.pn.datavault.mapper;

import it.pagopa.pn.datavault.generated.openapi.server.v1.dto.AnalogDomicile;
import it.pagopa.pn.datavault.generated.openapi.server.v1.dto.DigitalAddressDto;
import it.pagopa.pn.datavault.middleware.db.entities.DigitalAddress;
import it.pagopa.pn.datavault.middleware.db.entities.PhysicalAddress;

public abstract class AddressesToDtoMapper {

    protected PhysicalAddress toPhysicalAddress(AnalogDomicile analogDomicile)
    {
        PhysicalAddress physicalAddress = null;
        if( analogDomicile != null ) {
            physicalAddress = new PhysicalAddress();
            physicalAddress.setAddress(analogDomicile.getAddress());
            physicalAddress.setAddressDetails(analogDomicile.getAddressDetails());
            physicalAddress.setAt(analogDomicile.getAt());
            physicalAddress.setCap(analogDomicile.getCap());
            physicalAddress.setMunicipality(analogDomicile.getMunicipality());
            physicalAddress.setMunicipalityDetails(analogDomicile.getMunicipalityDetails());
            physicalAddress.setProvince(analogDomicile.getProvince());
            physicalAddress.setState(analogDomicile.getState());
        }
        return physicalAddress;
    }

    protected AnalogDomicile toAnalogDomicile(PhysicalAddress physicalAddress)
    {
        AnalogDomicile analogDomicile = null;
        if( physicalAddress != null ) {
            analogDomicile = new AnalogDomicile();
            analogDomicile.setAddress(physicalAddress.getAddress());
            analogDomicile.setAddressDetails(physicalAddress.getAddressDetails());
            analogDomicile.setAt(physicalAddress.getAt());
            analogDomicile.setCap(physicalAddress.getCap());
            analogDomicile.setMunicipality(physicalAddress.getMunicipality());
            analogDomicile.setMunicipalityDetails(physicalAddress.getMunicipalityDetails());
            analogDomicile.setProvince(physicalAddress.getProvince());
            analogDomicile.setState(physicalAddress.getState());
        }
        return analogDomicile;
    }

    protected DigitalAddress toDigitalAddress(DigitalAddressDto dto)
    {
        DigitalAddress digitalAddress = null;
        if( dto != null ) {
            digitalAddress = new DigitalAddress();
            digitalAddress.setValue(dto.getValue());
            digitalAddress.setType(dto.getType());
        }
        return digitalAddress;
    }

    protected DigitalAddressDto toDigitalAddressDto(DigitalAddress digitalAddress)
    {
        DigitalAddressDto dto = null;
        if( digitalAddress != null ) {
            dto = new DigitalAddressDto();
            dto.setValue(digitalAddress.getValue());
            dto.setType(digitalAddress.getType());
        }
        return dto;
    }

}
