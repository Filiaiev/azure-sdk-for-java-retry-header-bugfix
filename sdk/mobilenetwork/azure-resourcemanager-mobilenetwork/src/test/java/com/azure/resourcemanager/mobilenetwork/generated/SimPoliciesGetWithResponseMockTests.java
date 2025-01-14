// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.SimPolicy;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SimPoliciesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Canceled\",\"siteProvisioningState\":{\"qkbiwet\":\"Deleting\",\"zycyqiqyhg\":\"Deleting\",\"etzlexbsfledynoj\":\"Adding\",\"iuwfbzkkdtnhqsy\":\"Failed\"},\"ueAmbr\":{\"uplink\":\"ljselp\",\"downlink\":\"pbafvafhlbylc\"},\"defaultSlice\":{\"id\":\"bevxrhyzd\"},\"rfspIndex\":1616798113,\"registrationTimer\":2025630449,\"sliceConfigurations\":[{\"slice\":{\"id\":\"pl\"},\"defaultDataNetwork\":{\"id\":\"dbmairrhvhfnr\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"wnpqigtuujwouhd\"},\"sessionAmbr\":{\"uplink\":\"wsigrbjbxsj\",\"downlink\":\"bvitvqkjya\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"nu\"},\"sessionAmbr\":{\"uplink\":\"tggmuwdchozfnkfe\",\"downlink\":\"lv\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"noakiz\"},\"sessionAmbr\":{\"uplink\":\"oaiknaqlnuwig\",\"downlink\":\"yxl\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"kwph\"},\"sessionAmbr\":{\"uplink\":\"xzcwxhmpejt\",\"downlink\":\"ke\"},\"allowedServices\":[]}]}]},\"location\":\"onwivkcqhrxhxkn\",\"tags\":{\"yqjf\":\"rmmkyupiju\",\"jascowvfdjkpd\":\"akfqfrkemyildud\",\"zvyfijdkzuqnwsi\":\"phlkksnm\",\"ah\":\"huqol\"},\"id\":\"uqwqulsutrjbhxyk\",\"name\":\"hyqezvqq\",\"type\":\"g\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MobileNetworkManager manager =
            MobileNetworkManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SimPolicy response =
            manager
                .simPolicies()
                .getWithResponse("rsxkr", "lbjazejww", "iyoypsuhbrnnhj", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("onwivkcqhrxhxkn", response.location());
        Assertions.assertEquals("rmmkyupiju", response.tags().get("yqjf"));
        Assertions.assertEquals("ljselp", response.ueAmbr().uplink());
        Assertions.assertEquals("pbafvafhlbylc", response.ueAmbr().downlink());
        Assertions.assertEquals("bevxrhyzd", response.defaultSlice().id());
        Assertions.assertEquals(1616798113, response.rfspIndex());
        Assertions.assertEquals(2025630449, response.registrationTimer());
        Assertions.assertEquals("pl", response.sliceConfigurations().get(0).slice().id());
        Assertions.assertEquals("dbmairrhvhfnr", response.sliceConfigurations().get(0).defaultDataNetwork().id());
        Assertions
            .assertEquals(
                "wnpqigtuujwouhd",
                response.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).dataNetwork().id());
        Assertions
            .assertEquals(
                "wsigrbjbxsj",
                response.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).sessionAmbr().uplink());
        Assertions
            .assertEquals(
                "bvitvqkjya",
                response.sliceConfigurations().get(0).dataNetworkConfigurations().get(0).sessionAmbr().downlink());
    }
}
