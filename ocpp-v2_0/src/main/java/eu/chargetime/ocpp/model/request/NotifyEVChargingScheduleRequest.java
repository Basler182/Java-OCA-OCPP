package eu.chargetime.ocpp.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import eu.chargetime.ocpp.model.RequestWithId;
import eu.chargetime.ocpp.model.dataTypes.ChargingScheduleType;
import eu.chargetime.ocpp.model.dataTypes.CustomDataType;
import eu.chargetime.ocpp.model.validation.RequiredValidator;
import eu.chargetime.ocpp.model.validation.Validator;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData",
        "timeBase",
        "chargingSchedule",
        "evseId"
})
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class NotifyEVChargingScheduleRequest extends RequestWithId {

    private transient Validator<Object> requiredValidator = new RequiredValidator();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;
    /**
     * Periods contained in the charging profile are relative to this point in time.
     *
     * (Required)
     *
     */
    @JsonProperty("timeBase")
    public Date timeBase;
    /**
     * Charging_ Schedule
     * urn:x-oca:ocpp:uid:2:233256
     * Charging schedule structure defines a list of charging periods, as used in: GetCompositeSchedule.conf and ChargingProfile.
     *
     * (Required)
     *
     */
    @JsonProperty("chargingSchedule")
    public ChargingScheduleType chargingSchedule;
    /**
     * The charging schedule contained in this notification applies to an EVSE. EvseId must be &gt; 0.
     *
     * (Required)
     *
     */
    @JsonProperty("evseId")
    public Integer evseId;

    public NotifyEVChargingScheduleRequest(Date timeBase, ChargingScheduleType chargingSchedule, Integer evseId) {
        requiredValidator.validate(timeBase);
        requiredValidator.validate(chargingSchedule);
        requiredValidator.validate(evseId);
        this.timeBase = timeBase;
        this.chargingSchedule = chargingSchedule;
        this.evseId = evseId;
    }

    public void setCustomData(CustomDataType customData) {
        this.customData = customData;
    }

    public void setTimeBase(Date timeBase) {
        requiredValidator.validate(timeBase);
        this.timeBase = timeBase;
    }

    public void setChargingSchedule(ChargingScheduleType chargingSchedule) {
        requiredValidator.validate(chargingSchedule);
        this.chargingSchedule = chargingSchedule;
    }

    public void setEvseId(Integer evseId) {
        requiredValidator.validate(evseId);
        this.evseId = evseId;
    }

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return requiredValidator.safeValidate(timeBase)
                &&requiredValidator.safeValidate(chargingSchedule)
                &&requiredValidator.safeValidate(evseId);
    }
}
