// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourceconnector.fluent.models.ApplianceInner;
import java.util.Map;

/** An immutable client-side representation of Appliance. */
public interface Appliance {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the distro property: Represents a supported Fabric/Infra. (AKSEdge etc...).
     *
     * @return the distro value.
     */
    Distro distro();

    /**
     * Gets the infrastructureConfig property: Contains infrastructure information about the Appliance.
     *
     * @return the infrastructureConfig value.
     */
    AppliancePropertiesInfrastructureConfig infrastructureConfig();

    /**
     * Gets the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the publicKey property: Certificates pair used to download MSI certificate from HIS.
     *
     * @return the publicKey value.
     */
    String publicKey();

    /**
     * Gets the status property: Appliance’s health and state of connection to on-prem.
     *
     * @return the status value.
     */
    Status status();

    /**
     * Gets the version property: Version of the Appliance.
     *
     * @return the version value.
     */
    String version();

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
     * Gets the inner com.azure.resourcemanager.resourceconnector.fluent.models.ApplianceInner object.
     *
     * @return the inner object.
     */
    ApplianceInner innerModel();

    /** The entirety of the Appliance definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Appliance definition stages. */
    interface DefinitionStages {
        /** The first stage of the Appliance definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Appliance definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the Appliance definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Appliance definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithDistro,
                DefinitionStages.WithInfrastructureConfig,
                DefinitionStages.WithPublicKey,
                DefinitionStages.WithVersion {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Appliance create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Appliance create(Context context);
        }
        /** The stage of the Appliance definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Appliance definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }
        /** The stage of the Appliance definition allowing to specify distro. */
        interface WithDistro {
            /**
             * Specifies the distro property: Represents a supported Fabric/Infra. (AKSEdge etc...)..
             *
             * @param distro Represents a supported Fabric/Infra. (AKSEdge etc...).
             * @return the next definition stage.
             */
            WithCreate withDistro(Distro distro);
        }
        /** The stage of the Appliance definition allowing to specify infrastructureConfig. */
        interface WithInfrastructureConfig {
            /**
             * Specifies the infrastructureConfig property: Contains infrastructure information about the Appliance.
             *
             * @param infrastructureConfig Contains infrastructure information about the Appliance.
             * @return the next definition stage.
             */
            WithCreate withInfrastructureConfig(AppliancePropertiesInfrastructureConfig infrastructureConfig);
        }
        /** The stage of the Appliance definition allowing to specify publicKey. */
        interface WithPublicKey {
            /**
             * Specifies the publicKey property: Certificates pair used to download MSI certificate from HIS.
             *
             * @param publicKey Certificates pair used to download MSI certificate from HIS.
             * @return the next definition stage.
             */
            WithCreate withPublicKey(String publicKey);
        }
        /** The stage of the Appliance definition allowing to specify version. */
        interface WithVersion {
            /**
             * Specifies the version property: Version of the Appliance.
             *
             * @param version Version of the Appliance.
             * @return the next definition stage.
             */
            WithCreate withVersion(String version);
        }
    }
    /**
     * Begins update for the Appliance resource.
     *
     * @return the stage of resource update.
     */
    Appliance.Update update();

    /** The template for Appliance update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Appliance apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Appliance apply(Context context);
    }
    /** The Appliance update stages. */
    interface UpdateStages {
        /** The stage of the Appliance update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Appliance refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Appliance refresh(Context context);

    /**
     * Returns the cluster customer user credentials for the dedicated appliance.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Cluster Customer User Credential Results appliance.
     */
    ApplianceListClusterCustomerUserCredentialResults listClusterCustomerUserCredential();

    /**
     * Returns the cluster customer user credentials for the dedicated appliance.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Cluster Customer User Credential Results appliance along with {@link Response}.
     */
    Response<ApplianceListClusterCustomerUserCredentialResults> listClusterCustomerUserCredentialWithResponse(
        Context context);

    /**
     * Returns the cluster user credentials for the dedicated appliance.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Cluster User Credential appliance.
     */
    ApplianceListCredentialResults listClusterUserCredential();

    /**
     * Returns the cluster user credentials for the dedicated appliance.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Cluster User Credential appliance along with {@link Response}.
     */
    Response<ApplianceListCredentialResults> listClusterUserCredentialWithResponse(Context context);
}