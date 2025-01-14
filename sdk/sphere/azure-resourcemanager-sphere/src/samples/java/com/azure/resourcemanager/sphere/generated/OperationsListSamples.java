// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/sphere/resource-manager/Microsoft.AzureSphere/preview/2022-09-01-preview/examples/GetOperations.json
     */
    /**
     * Sample code: Operations_List.
     *
     * @param manager Entry point to AzureSphereManager.
     */
    public static void operationsList(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
