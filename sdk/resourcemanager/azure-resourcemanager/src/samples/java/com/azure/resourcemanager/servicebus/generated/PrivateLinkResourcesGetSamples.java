// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated;

import com.azure.core.util.Context;

/** Samples for PrivateLinkResources Get. */
public final class PrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/stable/2021-11-01/examples/NameSpaces/PrivateLinkResourcesGet.json
     */
    /**
     * Sample code: NameSpacePrivateLinkResourcesGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void nameSpacePrivateLinkResourcesGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .serviceBusNamespaces()
            .manager()
            .serviceClient()
            .getPrivateLinkResources()
            .getWithResponse("ArunMonocle", "sdk-Namespace-2924", Context.NONE);
    }
}