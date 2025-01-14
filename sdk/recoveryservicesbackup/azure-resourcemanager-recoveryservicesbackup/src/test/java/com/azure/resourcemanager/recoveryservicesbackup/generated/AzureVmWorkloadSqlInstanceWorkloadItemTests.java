// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureVmWorkloadSqlInstanceWorkloadItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectory;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureVmWorkloadSqlInstanceWorkloadItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureVmWorkloadSqlInstanceWorkloadItem model =
            BinaryData
                .fromString(
                    "{\"workloadItemType\":\"SQLInstance\",\"dataDirectoryPaths\":[{\"type\":\"Invalid\",\"path\":\"zxqltgrdogypx\",\"logicalName\":\"vbfihwuhvctafsr\"}],\"parentName\":\"rblmli\",\"serverName\":\"xihspnxwq\",\"isAutoProtectable\":true,\"subinquireditemcount\":1320300577,\"subWorkloadItemCount\":523480750,\"backupManagementType\":\"klsbsbqqqagw\",\"workloadType\":\"xaomzisglrrc\",\"friendlyName\":\"zkhhltnjadhqo\",\"protectionState\":\"ProtectionFailed\"}")
                .toObject(AzureVmWorkloadSqlInstanceWorkloadItem.class);
        Assertions.assertEquals("klsbsbqqqagw", model.backupManagementType());
        Assertions.assertEquals("xaomzisglrrc", model.workloadType());
        Assertions.assertEquals("zkhhltnjadhqo", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTION_FAILED, model.protectionState());
        Assertions.assertEquals("rblmli", model.parentName());
        Assertions.assertEquals("xihspnxwq", model.serverName());
        Assertions.assertEquals(true, model.isAutoProtectable());
        Assertions.assertEquals(1320300577, model.subinquireditemcount());
        Assertions.assertEquals(523480750, model.subWorkloadItemCount());
        Assertions.assertEquals(SqlDataDirectoryType.INVALID, model.dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("zxqltgrdogypx", model.dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("vbfihwuhvctafsr", model.dataDirectoryPaths().get(0).logicalName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureVmWorkloadSqlInstanceWorkloadItem model =
            new AzureVmWorkloadSqlInstanceWorkloadItem()
                .withBackupManagementType("klsbsbqqqagw")
                .withWorkloadType("xaomzisglrrc")
                .withFriendlyName("zkhhltnjadhqo")
                .withProtectionState(ProtectionStatus.PROTECTION_FAILED)
                .withParentName("rblmli")
                .withServerName("xihspnxwq")
                .withIsAutoProtectable(true)
                .withSubinquireditemcount(1320300577)
                .withSubWorkloadItemCount(523480750)
                .withDataDirectoryPaths(
                    Arrays
                        .asList(
                            new SqlDataDirectory()
                                .withType(SqlDataDirectoryType.INVALID)
                                .withPath("zxqltgrdogypx")
                                .withLogicalName("vbfihwuhvctafsr")));
        model = BinaryData.fromObject(model).toObject(AzureVmWorkloadSqlInstanceWorkloadItem.class);
        Assertions.assertEquals("klsbsbqqqagw", model.backupManagementType());
        Assertions.assertEquals("xaomzisglrrc", model.workloadType());
        Assertions.assertEquals("zkhhltnjadhqo", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTION_FAILED, model.protectionState());
        Assertions.assertEquals("rblmli", model.parentName());
        Assertions.assertEquals("xihspnxwq", model.serverName());
        Assertions.assertEquals(true, model.isAutoProtectable());
        Assertions.assertEquals(1320300577, model.subinquireditemcount());
        Assertions.assertEquals(523480750, model.subWorkloadItemCount());
        Assertions.assertEquals(SqlDataDirectoryType.INVALID, model.dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("zxqltgrdogypx", model.dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("vbfihwuhvctafsr", model.dataDirectoryPaths().get(0).logicalName());
    }
}
