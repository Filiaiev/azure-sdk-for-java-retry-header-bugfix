// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.ComputeResourceInner;
import java.util.Map;

/** An immutable client-side representation of ComputeResource. */
public interface ComputeResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the location property: Specifies the location of the resource.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Contains resource tags defined as key/value pairs.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the sku property: The sku of the workspace.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the properties property: Compute properties.
     *
     * @return the properties value.
     */
    Compute properties();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearning.fluent.models.ComputeResourceInner object.
     *
     * @return the inner object.
     */
    ComputeResourceInner innerModel();

    /** The entirety of the ComputeResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ComputeResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the ComputeResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ComputeResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName Name of Azure Machine Learning workspace.
             * @return the next definition stage.
             */
            WithCreate withExistingWorkspace(String resourceGroupName, String workspaceName);
        }
        /**
         * The stage of the ComputeResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation,
                DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithSku,
                DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ComputeResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ComputeResource create(Context context);
        }
        /** The stage of the ComputeResource definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location Specifies the location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location Specifies the location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the ComputeResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Contains resource tags defined as key/value pairs..
             *
             * @param tags Contains resource tags defined as key/value pairs.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ComputeResource definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             *
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }
        /** The stage of the ComputeResource definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku of the workspace..
             *
             * @param sku The sku of the workspace.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the ComputeResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Compute properties.
             *
             * @param properties Compute properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(Compute properties);
        }
    }
    /**
     * Begins update for the ComputeResource resource.
     *
     * @return the stage of resource update.
     */
    ComputeResource.Update update();

    /** The template for ComputeResource update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ComputeResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ComputeResource apply(Context context);
    }
    /** The ComputeResource update stages. */
    interface UpdateStages {
        /** The stage of the ComputeResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of ClusterUpdate.
             *
             * @param properties Properties of ClusterUpdate.
             * @return the next definition stage.
             */
            Update withProperties(ScaleSettingsInformation properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ComputeResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ComputeResource refresh(Context context);

    /**
     * Get the details (e.g IP address, port etc) of all the compute nodes in the compute.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details (e.g IP address, port etc) of all the compute nodes in the compute as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<AmlComputeNodeInformation> listNodes();

    /**
     * Get the details (e.g IP address, port etc) of all the compute nodes in the compute.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details (e.g IP address, port etc) of all the compute nodes in the compute as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<AmlComputeNodeInformation> listNodes(Context context);

    /**
     * Gets secrets related to Machine Learning compute (storage keys, service credentials, etc).
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return secrets related to Machine Learning compute (storage keys, service credentials, etc).
     */
    ComputeSecrets listKeys();

    /**
     * Gets secrets related to Machine Learning compute (storage keys, service credentials, etc).
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return secrets related to Machine Learning compute (storage keys, service credentials, etc) along with {@link
     *     Response}.
     */
    Response<ComputeSecrets> listKeysWithResponse(Context context);

    /**
     * Posts a start action to a compute instance.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start();

    /**
     * Posts a start action to a compute instance.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(Context context);

    /**
     * Posts a stop action to a compute instance.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop();

    /**
     * Posts a stop action to a compute instance.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(Context context);

    /**
     * Posts a restart action to a compute instance.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart();

    /**
     * Posts a restart action to a compute instance.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(Context context);
}