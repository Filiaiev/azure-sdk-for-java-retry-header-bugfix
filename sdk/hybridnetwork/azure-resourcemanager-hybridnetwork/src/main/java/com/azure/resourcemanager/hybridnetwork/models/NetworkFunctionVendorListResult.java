// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionVendorInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The network function vendor list result. */
@Fluent
public final class NetworkFunctionVendorListResult {
    /*
     * A list of available network function vendors and skus.
     */
    @JsonProperty(value = "value")
    private List<NetworkFunctionVendorInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of NetworkFunctionVendorListResult class. */
    public NetworkFunctionVendorListResult() {
    }

    /**
     * Get the value property: A list of available network function vendors and skus.
     *
     * @return the value value.
     */
    public List<NetworkFunctionVendorInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of available network function vendors and skus.
     *
     * @param value the value value to set.
     * @return the NetworkFunctionVendorListResult object itself.
     */
    public NetworkFunctionVendorListResult withValue(List<NetworkFunctionVendorInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
