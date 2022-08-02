// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for RecoverableDatabases ListByServer. */
public final class RecoverableDatabasesListByServerSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/RecoverableDatabaseList.json
     */
    /**
     * Sample code: Get list of restorable dropped databases.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getListOfRestorableDroppedDatabases(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getRecoverableDatabases()
            .listByServer("recoverabledatabasetest-1234", "recoverabledatabasetest-7177", Context.NONE);
    }
}