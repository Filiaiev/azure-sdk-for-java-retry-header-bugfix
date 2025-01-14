// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AmlFilesystems. */
public interface AmlFilesystems {
    /**
     * Returns all AML file systems the user has access to under a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list AML file systems as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AmlFilesystem> list();

    /**
     * Returns all AML file systems the user has access to under a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list AML file systems as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AmlFilesystem> list(Context context);

    /**
     * Returns all AML file systems the user has access to under a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list AML file systems as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AmlFilesystem> listByResourceGroup(String resourceGroupName);

    /**
     * Returns all AML file systems the user has access to under a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list AML file systems as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AmlFilesystem> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Schedules an AML file system for deletion.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param amlFilesystemName Name for the AML file system. Allows alphanumerics, underscores, and hyphens. Start and
     *     end with alphanumeric.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String amlFilesystemName);

    /**
     * Schedules an AML file system for deletion.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param amlFilesystemName Name for the AML file system. Allows alphanumerics, underscores, and hyphens. Start and
     *     end with alphanumeric.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String amlFilesystemName, Context context);

    /**
     * Returns an AML file system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param amlFilesystemName Name for the AML file system. Allows alphanumerics, underscores, and hyphens. Start and
     *     end with alphanumeric.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AML file system instance along with {@link Response}.
     */
    Response<AmlFilesystem> getByResourceGroupWithResponse(
        String resourceGroupName, String amlFilesystemName, Context context);

    /**
     * Returns an AML file system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param amlFilesystemName Name for the AML file system. Allows alphanumerics, underscores, and hyphens. Start and
     *     end with alphanumeric.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AML file system instance.
     */
    AmlFilesystem getByResourceGroup(String resourceGroupName, String amlFilesystemName);

    /**
     * Archive data from the AML file system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param amlFilesystemName Name for the AML file system. Allows alphanumerics, underscores, and hyphens. Start and
     *     end with alphanumeric.
     * @param archiveInfo Information about the archive operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> archiveWithResponse(
        String resourceGroupName, String amlFilesystemName, AmlFilesystemArchiveInfo archiveInfo, Context context);

    /**
     * Archive data from the AML file system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param amlFilesystemName Name for the AML file system. Allows alphanumerics, underscores, and hyphens. Start and
     *     end with alphanumeric.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void archive(String resourceGroupName, String amlFilesystemName);

    /**
     * Cancel archiving data from the AML file system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param amlFilesystemName Name for the AML file system. Allows alphanumerics, underscores, and hyphens. Start and
     *     end with alphanumeric.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> cancelArchiveWithResponse(String resourceGroupName, String amlFilesystemName, Context context);

    /**
     * Cancel archiving data from the AML file system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param amlFilesystemName Name for the AML file system. Allows alphanumerics, underscores, and hyphens. Start and
     *     end with alphanumeric.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancelArchive(String resourceGroupName, String amlFilesystemName);

    /**
     * Returns an AML file system.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AML file system instance along with {@link Response}.
     */
    AmlFilesystem getById(String id);

    /**
     * Returns an AML file system.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an AML file system instance along with {@link Response}.
     */
    Response<AmlFilesystem> getByIdWithResponse(String id, Context context);

    /**
     * Schedules an AML file system for deletion.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Schedules an AML file system for deletion.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AmlFilesystem resource.
     *
     * @param name resource name.
     * @return the first stage of the new AmlFilesystem definition.
     */
    AmlFilesystem.DefinitionStages.Blank define(String name);
}
