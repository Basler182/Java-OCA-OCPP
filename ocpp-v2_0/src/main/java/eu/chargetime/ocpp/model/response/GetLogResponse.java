package eu.chargetime.ocpp.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import eu.chargetime.ocpp.model.Confirmation;
import eu.chargetime.ocpp.model.dataTypes.CustomDataType;
import eu.chargetime.ocpp.model.dataTypes.StatusInfoType;
import eu.chargetime.ocpp.model.dataTypes.enums.LogStatusEnumType;
import eu.chargetime.ocpp.model.validation.OCPP2PrimDatatypes;
import eu.chargetime.ocpp.model.validation.RequiredValidator;
import eu.chargetime.ocpp.model.validation.Validator;
import eu.chargetime.ocpp.model.validation.ValidatorBuilder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData",
        "status",
        "statusInfo",
        "filename"
})
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class GetLogResponse extends Confirmation {

    private transient Validator<Object> requiredValidator = new RequiredValidator();

    private transient Validator filenameValidator =
            new ValidatorBuilder()
                    .addRule(OCPP2PrimDatatypes.string255())
                    .build();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;
    /**
     * This field indicates whether the Charging Station was able to accept the request.
     *
     * (Required)
     *
     */
    @JsonProperty("status")
    public LogStatusEnumType status;
    /**
     * Element providing more information about the status.
     *
     *
     */
    @JsonProperty("statusInfo")
    public StatusInfoType statusInfo;
    /**
     * This contains the name of the log file that will be uploaded. This field is not present when no logging information is available.
     *
     *
     */
    @JsonProperty("filename")
    public String filename;

    public GetLogResponse(LogStatusEnumType status) {
        requiredValidator.validate(status);
        this.status = status;
    }

    public void setCustomData(CustomDataType customData) {
        this.customData = customData;
    }

    public void setStatus(LogStatusEnumType status) {
        requiredValidator.validate(status);
        this.status = status;
    }

    public void setStatusInfo(StatusInfoType statusInfo) {
        this.statusInfo = statusInfo;
    }

    public void setFilename(String filename) {
        filenameValidator.validate(filename);
        this.filename = filename;
    }

    @Override
    public boolean validate() {
        return false;
    }
}
