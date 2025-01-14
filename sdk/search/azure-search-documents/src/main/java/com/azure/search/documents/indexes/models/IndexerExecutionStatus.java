// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

/** Represents the status of an individual indexer execution. */
public enum IndexerExecutionStatus {
    /**
     * An indexer invocation has failed, but the failure may be transient. Indexer invocations will continue per
     * schedule.
     */
    TRANSIENT_FAILURE("transientFailure"),

    /** Indexer execution completed successfully. */
    SUCCESS("success"),

    /** Indexer execution is in progress. */
    IN_PROGRESS("inProgress"),

    /** Indexer has been reset. */
    RESET("reset");

    /** The actual serialized value for a IndexerExecutionStatus instance. */
    private final String value;

    IndexerExecutionStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IndexerExecutionStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IndexerExecutionStatus object, or null if unable to parse.
     */
    public static IndexerExecutionStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        IndexerExecutionStatus[] items = IndexerExecutionStatus.values();
        for (IndexerExecutionStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return this.value;
    }
}
