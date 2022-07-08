// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkfunction.fluent.NetworkFunctionsClient;
import com.azure.resourcemanager.networkfunction.fluent.models.OperationInner;
import com.azure.resourcemanager.networkfunction.models.NetworkFunctions;
import com.azure.resourcemanager.networkfunction.models.Operation;

public final class NetworkFunctionsImpl implements NetworkFunctions {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkFunctionsImpl.class);

    private final NetworkFunctionsClient innerClient;

    private final com.azure.resourcemanager.networkfunction.AzureTrafficCollectorManager serviceManager;

    public NetworkFunctionsImpl(
        NetworkFunctionsClient innerClient,
        com.azure.resourcemanager.networkfunction.AzureTrafficCollectorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Operation> listOperations() {
        PagedIterable<OperationInner> inner = this.serviceClient().listOperations();
        return Utils.mapPage(inner, inner1 -> new OperationImpl(inner1, this.manager()));
    }

    public PagedIterable<Operation> listOperations(Context context) {
        PagedIterable<OperationInner> inner = this.serviceClient().listOperations(context);
        return Utils.mapPage(inner, inner1 -> new OperationImpl(inner1, this.manager()));
    }

    private NetworkFunctionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.networkfunction.AzureTrafficCollectorManager manager() {
        return this.serviceManager;
    }
}