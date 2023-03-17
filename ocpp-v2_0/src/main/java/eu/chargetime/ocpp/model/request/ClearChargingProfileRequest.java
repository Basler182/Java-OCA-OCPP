package eu.chargetime.ocpp.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import eu.chargetime.ocpp.model.RequestWithId;
import eu.chargetime.ocpp.model.dataTypes.ClearChargingProfileType;
import eu.chargetime.ocpp.model.dataTypes.CustomDataType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData",
        "chargingProfileId",
        "chargingProfileCriteria"
})
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
public class ClearChargingProfileRequest extends RequestWithId {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;
    /**
     * The Id of the charging profile to clear.
     *
     *
     */
    @JsonProperty("chargingProfileId")
    public Integer chargingProfileId;
    /**
     * Charging_ Profile
     * urn:x-oca:ocpp:uid:2:233255
     * A ChargingProfile consists of a ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
     *
     *
     */
    @JsonProperty("chargingProfileCriteria")
    public ClearChargingProfileType chargingProfileCriteria;

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return true;
    }
}
