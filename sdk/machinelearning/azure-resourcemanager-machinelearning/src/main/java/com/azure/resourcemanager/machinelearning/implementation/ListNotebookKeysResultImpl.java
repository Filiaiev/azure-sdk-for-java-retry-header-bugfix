// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.resourcemanager.machinelearning.fluent.models.ListNotebookKeysResultInner;
import com.azure.resourcemanager.machinelearning.models.ListNotebookKeysResult;

public final class ListNotebookKeysResultImpl implements ListNotebookKeysResult {
    private ListNotebookKeysResultInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    ListNotebookKeysResultImpl(
        ListNotebookKeysResultInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String primaryAccessKey() {
        return this.innerModel().primaryAccessKey();
    }

    public String secondaryAccessKey() {
        return this.innerModel().secondaryAccessKey();
    }

    public ListNotebookKeysResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }
}