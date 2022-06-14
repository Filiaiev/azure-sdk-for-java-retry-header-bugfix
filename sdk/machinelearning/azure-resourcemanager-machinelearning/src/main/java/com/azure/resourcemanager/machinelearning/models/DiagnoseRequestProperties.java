// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The DiagnoseRequestProperties model. */
@Fluent
public final class DiagnoseRequestProperties {
    /*
     * Setting for diagnosing user defined routing
     */
    @JsonProperty(value = "udr")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> udr;

    /*
     * Setting for diagnosing network security group
     */
    @JsonProperty(value = "nsg")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> nsg;

    /*
     * Setting for diagnosing resource lock
     */
    @JsonProperty(value = "resourceLock")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> resourceLock;

    /*
     * Setting for diagnosing dns resolution
     */
    @JsonProperty(value = "dnsResolution")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> dnsResolution;

    /*
     * Setting for diagnosing dependent storage account
     */
    @JsonProperty(value = "storageAccount")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> storageAccount;

    /*
     * Setting for diagnosing dependent key vault
     */
    @JsonProperty(value = "keyVault")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> keyVault;

    /*
     * Setting for diagnosing dependent container registry
     */
    @JsonProperty(value = "containerRegistry")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> containerRegistry;

    /*
     * Setting for diagnosing dependent application insights
     */
    @JsonProperty(value = "applicationInsights")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> applicationInsights;

    /*
     * Setting for diagnosing unclassified category of problems
     */
    @JsonProperty(value = "others")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> others;

    /**
     * Get the udr property: Setting for diagnosing user defined routing.
     *
     * @return the udr value.
     */
    public Map<String, Object> udr() {
        return this.udr;
    }

    /**
     * Set the udr property: Setting for diagnosing user defined routing.
     *
     * @param udr the udr value to set.
     * @return the DiagnoseRequestProperties object itself.
     */
    public DiagnoseRequestProperties withUdr(Map<String, Object> udr) {
        this.udr = udr;
        return this;
    }

    /**
     * Get the nsg property: Setting for diagnosing network security group.
     *
     * @return the nsg value.
     */
    public Map<String, Object> nsg() {
        return this.nsg;
    }

    /**
     * Set the nsg property: Setting for diagnosing network security group.
     *
     * @param nsg the nsg value to set.
     * @return the DiagnoseRequestProperties object itself.
     */
    public DiagnoseRequestProperties withNsg(Map<String, Object> nsg) {
        this.nsg = nsg;
        return this;
    }

    /**
     * Get the resourceLock property: Setting for diagnosing resource lock.
     *
     * @return the resourceLock value.
     */
    public Map<String, Object> resourceLock() {
        return this.resourceLock;
    }

    /**
     * Set the resourceLock property: Setting for diagnosing resource lock.
     *
     * @param resourceLock the resourceLock value to set.
     * @return the DiagnoseRequestProperties object itself.
     */
    public DiagnoseRequestProperties withResourceLock(Map<String, Object> resourceLock) {
        this.resourceLock = resourceLock;
        return this;
    }

    /**
     * Get the dnsResolution property: Setting for diagnosing dns resolution.
     *
     * @return the dnsResolution value.
     */
    public Map<String, Object> dnsResolution() {
        return this.dnsResolution;
    }

    /**
     * Set the dnsResolution property: Setting for diagnosing dns resolution.
     *
     * @param dnsResolution the dnsResolution value to set.
     * @return the DiagnoseRequestProperties object itself.
     */
    public DiagnoseRequestProperties withDnsResolution(Map<String, Object> dnsResolution) {
        this.dnsResolution = dnsResolution;
        return this;
    }

    /**
     * Get the storageAccount property: Setting for diagnosing dependent storage account.
     *
     * @return the storageAccount value.
     */
    public Map<String, Object> storageAccount() {
        return this.storageAccount;
    }

    /**
     * Set the storageAccount property: Setting for diagnosing dependent storage account.
     *
     * @param storageAccount the storageAccount value to set.
     * @return the DiagnoseRequestProperties object itself.
     */
    public DiagnoseRequestProperties withStorageAccount(Map<String, Object> storageAccount) {
        this.storageAccount = storageAccount;
        return this;
    }

    /**
     * Get the keyVault property: Setting for diagnosing dependent key vault.
     *
     * @return the keyVault value.
     */
    public Map<String, Object> keyVault() {
        return this.keyVault;
    }

    /**
     * Set the keyVault property: Setting for diagnosing dependent key vault.
     *
     * @param keyVault the keyVault value to set.
     * @return the DiagnoseRequestProperties object itself.
     */
    public DiagnoseRequestProperties withKeyVault(Map<String, Object> keyVault) {
        this.keyVault = keyVault;
        return this;
    }

    /**
     * Get the containerRegistry property: Setting for diagnosing dependent container registry.
     *
     * @return the containerRegistry value.
     */
    public Map<String, Object> containerRegistry() {
        return this.containerRegistry;
    }

    /**
     * Set the containerRegistry property: Setting for diagnosing dependent container registry.
     *
     * @param containerRegistry the containerRegistry value to set.
     * @return the DiagnoseRequestProperties object itself.
     */
    public DiagnoseRequestProperties withContainerRegistry(Map<String, Object> containerRegistry) {
        this.containerRegistry = containerRegistry;
        return this;
    }

    /**
     * Get the applicationInsights property: Setting for diagnosing dependent application insights.
     *
     * @return the applicationInsights value.
     */
    public Map<String, Object> applicationInsights() {
        return this.applicationInsights;
    }

    /**
     * Set the applicationInsights property: Setting for diagnosing dependent application insights.
     *
     * @param applicationInsights the applicationInsights value to set.
     * @return the DiagnoseRequestProperties object itself.
     */
    public DiagnoseRequestProperties withApplicationInsights(Map<String, Object> applicationInsights) {
        this.applicationInsights = applicationInsights;
        return this;
    }

    /**
     * Get the others property: Setting for diagnosing unclassified category of problems.
     *
     * @return the others value.
     */
    public Map<String, Object> others() {
        return this.others;
    }

    /**
     * Set the others property: Setting for diagnosing unclassified category of problems.
     *
     * @param others the others value to set.
     * @return the DiagnoseRequestProperties object itself.
     */
    public DiagnoseRequestProperties withOthers(Map<String, Object> others) {
        this.others = others;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}