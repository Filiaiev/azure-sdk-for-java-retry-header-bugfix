// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.selfhelp.fluent.models.RestartTroubleshooterResponseInner;
import com.azure.resourcemanager.selfhelp.fluent.models.TroubleshooterResourceInner;
import com.azure.resourcemanager.selfhelp.models.ContinueRequestBody;
import com.azure.resourcemanager.selfhelp.models.TroubleshootersContinueMethodResponse;
import com.azure.resourcemanager.selfhelp.models.TroubleshootersEndResponse;
import com.azure.resourcemanager.selfhelp.models.TroubleshootersRestartResponse;

/** An instance of this class provides access to all the operations defined in TroubleshootersClient. */
public interface TroubleshootersClient {
    /**
     * Creates the specific troubleshooter action under a resource or subscription using the ‘solutionId’ and
     * ‘properties.parameters’ as the trigger. &lt;br/&gt; Troubleshooters are step-by-step interactive guidance that
     * scope the problem by collecting additional inputs from you in each stage while troubleshooting an Azure issue.
     * You will be guided down decision tree style workflow and the best possible solution will be presented at the end
     * of the workflow. &lt;br/&gt; Create API creates the Troubleshooter API using ‘parameters’ and ‘solutionId’
     * &lt;br/&gt; After creating the Troubleshooter instance, the following APIs can be used:&lt;br/&gt; CONTINUE API:
     * to move to the next step in the flow &lt;br/&gt;GET API: to identify the next step after executing the CONTINUE
     * API. &lt;br/&gt;&lt;br/&gt; &lt;b&gt;Note:&lt;/b&gt; ‘requiredParameters’ from solutions response must be passed
     * via ‘properties. parameters’ in the request body of Troubleshooters API.
     *
     * @param scope This is an extension resource provider and only resource level extension is supported at the moment.
     * @param troubleshooterName Troubleshooter resource Name.
     * @param createTroubleshooterRequestBody The required request body for this Troubleshooter resource creation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return troubleshooter response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TroubleshooterResourceInner> createWithResponse(
        String scope,
        String troubleshooterName,
        TroubleshooterResourceInner createTroubleshooterRequestBody,
        Context context);

    /**
     * Creates the specific troubleshooter action under a resource or subscription using the ‘solutionId’ and
     * ‘properties.parameters’ as the trigger. &lt;br/&gt; Troubleshooters are step-by-step interactive guidance that
     * scope the problem by collecting additional inputs from you in each stage while troubleshooting an Azure issue.
     * You will be guided down decision tree style workflow and the best possible solution will be presented at the end
     * of the workflow. &lt;br/&gt; Create API creates the Troubleshooter API using ‘parameters’ and ‘solutionId’
     * &lt;br/&gt; After creating the Troubleshooter instance, the following APIs can be used:&lt;br/&gt; CONTINUE API:
     * to move to the next step in the flow &lt;br/&gt;GET API: to identify the next step after executing the CONTINUE
     * API. &lt;br/&gt;&lt;br/&gt; &lt;b&gt;Note:&lt;/b&gt; ‘requiredParameters’ from solutions response must be passed
     * via ‘properties. parameters’ in the request body of Troubleshooters API.
     *
     * @param scope This is an extension resource provider and only resource level extension is supported at the moment.
     * @param troubleshooterName Troubleshooter resource Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return troubleshooter response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TroubleshooterResourceInner create(String scope, String troubleshooterName);

    /**
     * Gets troubleshooter instance result which includes the step status/result of the troubleshooter resource name
     * that is being executed.&lt;br/&gt; Get API is used to retrieve the result of a Troubleshooter instance, which
     * includes the status and result of each step in the Troubleshooter workflow. This API requires the Troubleshooter
     * resource name that was created using the Create API.
     *
     * @param scope This is an extension resource provider and only resource level extension is supported at the moment.
     * @param troubleshooterName Troubleshooter resource Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return troubleshooter instance result which includes the step status/result of the troubleshooter resource name
     *     that is being executed.&lt;br/&gt; Get API is used to retrieve the result of a Troubleshooter instance, which
     *     includes the status and result of each step in the Troubleshooter workflow along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TroubleshooterResourceInner> getWithResponse(String scope, String troubleshooterName, Context context);

    /**
     * Gets troubleshooter instance result which includes the step status/result of the troubleshooter resource name
     * that is being executed.&lt;br/&gt; Get API is used to retrieve the result of a Troubleshooter instance, which
     * includes the status and result of each step in the Troubleshooter workflow. This API requires the Troubleshooter
     * resource name that was created using the Create API.
     *
     * @param scope This is an extension resource provider and only resource level extension is supported at the moment.
     * @param troubleshooterName Troubleshooter resource Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return troubleshooter instance result which includes the step status/result of the troubleshooter resource name
     *     that is being executed.&lt;br/&gt; Get API is used to retrieve the result of a Troubleshooter instance, which
     *     includes the status and result of each step in the Troubleshooter workflow.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TroubleshooterResourceInner get(String scope, String troubleshooterName);

    /**
     * Uses ‘stepId’ and ‘responses’ as the trigger to continue the troubleshooting steps for the respective
     * troubleshooter resource name. &lt;br/&gt;Continue API is used to provide inputs that are required for the
     * specific troubleshooter to progress into the next step in the process. This API is used after the Troubleshooter
     * has been created using the Create API.
     *
     * @param scope This is an extension resource provider and only resource level extension is supported at the moment.
     * @param troubleshooterName Troubleshooter resource Name.
     * @param continueRequestBody The required request body for going to next step in Troubleshooter resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TroubleshootersContinueMethodResponse continueMethodWithResponse(
        String scope, String troubleshooterName, ContinueRequestBody continueRequestBody, Context context);

    /**
     * Uses ‘stepId’ and ‘responses’ as the trigger to continue the troubleshooting steps for the respective
     * troubleshooter resource name. &lt;br/&gt;Continue API is used to provide inputs that are required for the
     * specific troubleshooter to progress into the next step in the process. This API is used after the Troubleshooter
     * has been created using the Create API.
     *
     * @param scope This is an extension resource provider and only resource level extension is supported at the moment.
     * @param troubleshooterName Troubleshooter resource Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void continueMethod(String scope, String troubleshooterName);

    /**
     * Ends the troubleshooter action.
     *
     * @param scope This is an extension resource provider and only resource level extension is supported at the moment.
     * @param troubleshooterName Troubleshooter resource Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TroubleshootersEndResponse endWithResponse(String scope, String troubleshooterName, Context context);

    /**
     * Ends the troubleshooter action.
     *
     * @param scope This is an extension resource provider and only resource level extension is supported at the moment.
     * @param troubleshooterName Troubleshooter resource Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void end(String scope, String troubleshooterName);

    /**
     * Restarts the troubleshooter API using applicable troubleshooter resource name as the input.&lt;br/&gt; It returns
     * new resource name which should be used in subsequent request. The old resource name is obsolete after this API is
     * invoked.
     *
     * @param scope This is an extension resource provider and only resource level extension is supported at the moment.
     * @param troubleshooterName Troubleshooter resource Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return troubleshooter restart response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TroubleshootersRestartResponse restartWithResponse(String scope, String troubleshooterName, Context context);

    /**
     * Restarts the troubleshooter API using applicable troubleshooter resource name as the input.&lt;br/&gt; It returns
     * new resource name which should be used in subsequent request. The old resource name is obsolete after this API is
     * invoked.
     *
     * @param scope This is an extension resource provider and only resource level extension is supported at the moment.
     * @param troubleshooterName Troubleshooter resource Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return troubleshooter restart response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RestartTroubleshooterResponseInner restart(String scope, String troubleshooterName);
}
