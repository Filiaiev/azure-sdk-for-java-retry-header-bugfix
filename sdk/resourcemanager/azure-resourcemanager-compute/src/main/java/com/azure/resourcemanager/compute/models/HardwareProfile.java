// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the hardware settings for the virtual machine. */
@Fluent
public final class HardwareProfile {
    /*
     * Specifies the size of the virtual machine. The enum data type is currently deprecated and will be removed by
     * December 23rd 2023. The recommended way to get the list of available sizes is using these APIs: [List all
     * available virtual machine sizes in an availability
     * set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes), [List all available
     * virtual machine sizes in a region]( https://docs.microsoft.com/rest/api/compute/resourceskus/list), [List all
     * available virtual machine sizes for
     * resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes). For more information
     * about virtual machine sizes, see [Sizes for virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/sizes). The available VM sizes depend on region and
     * availability set.
     */
    @JsonProperty(value = "vmSize")
    private VirtualMachineSizeTypes vmSize;

    /*
     * Specifies the properties for customizing the size of the virtual machine. Minimum api-version: 2021-07-01. This
     * feature is still in preview mode and is not supported for VirtualMachineScaleSet. Please follow the instructions
     * in [VM Customization](https://aka.ms/vmcustomization) for more details.
     */
    @JsonProperty(value = "vmSizeProperties")
    private VMSizeProperties vmSizeProperties;

    /** Creates an instance of HardwareProfile class. */
    public HardwareProfile() {
    }

    /**
     * Get the vmSize property: Specifies the size of the virtual machine. The enum data type is currently deprecated
     * and will be removed by December 23rd 2023. The recommended way to get the list of available sizes is using these
     * APIs: [List all available virtual machine sizes in an availability
     * set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes), [List all available
     * virtual machine sizes in a region]( https://docs.microsoft.com/rest/api/compute/resourceskus/list), [List all
     * available virtual machine sizes for
     * resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes). For more information
     * about virtual machine sizes, see [Sizes for virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/sizes). The available VM sizes depend on region and
     * availability set.
     *
     * @return the vmSize value.
     */
    public VirtualMachineSizeTypes vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Specifies the size of the virtual machine. The enum data type is currently deprecated
     * and will be removed by December 23rd 2023. The recommended way to get the list of available sizes is using these
     * APIs: [List all available virtual machine sizes in an availability
     * set](https://docs.microsoft.com/rest/api/compute/availabilitysets/listavailablesizes), [List all available
     * virtual machine sizes in a region]( https://docs.microsoft.com/rest/api/compute/resourceskus/list), [List all
     * available virtual machine sizes for
     * resizing](https://docs.microsoft.com/rest/api/compute/virtualmachines/listavailablesizes). For more information
     * about virtual machine sizes, see [Sizes for virtual
     * machines](https://docs.microsoft.com/azure/virtual-machines/sizes). The available VM sizes depend on region and
     * availability set.
     *
     * @param vmSize the vmSize value to set.
     * @return the HardwareProfile object itself.
     */
    public HardwareProfile withVmSize(VirtualMachineSizeTypes vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the vmSizeProperties property: Specifies the properties for customizing the size of the virtual machine.
     * Minimum api-version: 2021-07-01. This feature is still in preview mode and is not supported for
     * VirtualMachineScaleSet. Please follow the instructions in [VM Customization](https://aka.ms/vmcustomization) for
     * more details.
     *
     * @return the vmSizeProperties value.
     */
    public VMSizeProperties vmSizeProperties() {
        return this.vmSizeProperties;
    }

    /**
     * Set the vmSizeProperties property: Specifies the properties for customizing the size of the virtual machine.
     * Minimum api-version: 2021-07-01. This feature is still in preview mode and is not supported for
     * VirtualMachineScaleSet. Please follow the instructions in [VM Customization](https://aka.ms/vmcustomization) for
     * more details.
     *
     * @param vmSizeProperties the vmSizeProperties value to set.
     * @return the HardwareProfile object itself.
     */
    public HardwareProfile withVmSizeProperties(VMSizeProperties vmSizeProperties) {
        this.vmSizeProperties = vmSizeProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vmSizeProperties() != null) {
            vmSizeProperties().validate();
        }
    }
}
