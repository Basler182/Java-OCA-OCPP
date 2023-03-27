package eu.chargetime.ocpp.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import eu.chargetime.ocpp.model.RequestWithId;
import eu.chargetime.ocpp.model.dataTypes.CustomDataType;
import eu.chargetime.ocpp.model.validation.OCPP2PrimDatatypes;
import eu.chargetime.ocpp.model.validation.Validator;
import eu.chargetime.ocpp.model.validation.ValidatorBuilder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData",
        "checksum"
})
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class UnpublishFirmwareRequest extends RequestWithId {

    private transient Validator checksumValidator =
            new ValidatorBuilder()
                    .addRule(OCPP2PrimDatatypes.identifierString())
                    .addRule(OCPP2PrimDatatypes.string32())
                    .build();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;
    /**
     * The MD5 checksum over the entire firmware file as a hexadecimal string of length 32.
     *
     * (Required)
     *
     */
    @JsonProperty("checksum")
    public String checksum;

    public UnpublishFirmwareRequest(String checksum) {
        checksumValidator.validate(checksum);
        this.checksum = checksum;
    }

    public void setCustomData(CustomDataType customData) {
        this.customData = customData;
    }

    public void setChecksum(String checksum) {
        checksumValidator.validate(checksum);
        this.checksum = checksum;
    }

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return checksumValidator.safeValidate(checksum);
    }
}
