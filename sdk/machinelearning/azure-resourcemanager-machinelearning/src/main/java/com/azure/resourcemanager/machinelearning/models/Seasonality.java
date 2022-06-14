// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Forecasting seasonality. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "mode",
    defaultImpl = Seasonality.class)
@JsonTypeName("Seasonality")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Auto", value = AutoSeasonality.class),
    @JsonSubTypes.Type(name = "Custom", value = CustomSeasonality.class)
})
@Immutable
public class Seasonality {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}