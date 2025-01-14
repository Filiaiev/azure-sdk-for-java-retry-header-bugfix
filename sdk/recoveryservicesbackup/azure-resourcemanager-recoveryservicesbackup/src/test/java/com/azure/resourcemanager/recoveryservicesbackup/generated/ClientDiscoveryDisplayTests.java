// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.ClientDiscoveryDisplay;
import org.junit.jupiter.api.Assertions;

public final class ClientDiscoveryDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClientDiscoveryDisplay model =
            BinaryData
                .fromString(
                    "{\"provider\":\"srp\",\"resource\":\"zidnsezcxtbzsgfy\",\"operation\":\"sne\",\"description\":\"dwzjeiach\"}")
                .toObject(ClientDiscoveryDisplay.class);
        Assertions.assertEquals("srp", model.provider());
        Assertions.assertEquals("zidnsezcxtbzsgfy", model.resource());
        Assertions.assertEquals("sne", model.operation());
        Assertions.assertEquals("dwzjeiach", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClientDiscoveryDisplay model =
            new ClientDiscoveryDisplay()
                .withProvider("srp")
                .withResource("zidnsezcxtbzsgfy")
                .withOperation("sne")
                .withDescription("dwzjeiach");
        model = BinaryData.fromObject(model).toObject(ClientDiscoveryDisplay.class);
        Assertions.assertEquals("srp", model.provider());
        Assertions.assertEquals("zidnsezcxtbzsgfy", model.resource());
        Assertions.assertEquals("sne", model.operation());
        Assertions.assertEquals("dwzjeiach", model.description());
    }
}
