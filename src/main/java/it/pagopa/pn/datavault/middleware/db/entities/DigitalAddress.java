package it.pagopa.pn.datavault.middleware.db.entities;

import lombok.Data;
import lombok.Getter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@DynamoDbBean
@Data
public class DigitalAddress {

    private static final String COL_VALUE = "value";
    private static final String COL_TYPE = "type";

    // eamil address
    @Getter(onMethod=@__({@DynamoDbAttribute(COL_VALUE)}))  private String value;

    // channel: EVINOTICE, PEC
    @Getter(onMethod=@__({@DynamoDbAttribute(COL_TYPE)}))  private String type;
}
