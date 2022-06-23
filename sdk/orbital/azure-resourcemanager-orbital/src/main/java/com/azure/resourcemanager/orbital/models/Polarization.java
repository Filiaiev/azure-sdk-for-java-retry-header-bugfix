// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Polarization. */
public final class Polarization extends ExpandableStringEnum<Polarization> {
    /** Static value RHCP for Polarization. */
    public static final Polarization RHCP = fromString("RHCP");

    /** Static value LHCP for Polarization. */
    public static final Polarization LHCP = fromString("LHCP");

    /** Static value linearVertical for Polarization. */
    public static final Polarization LINEAR_VERTICAL = fromString("linearVertical");

    /** Static value linearHorizontal for Polarization. */
    public static final Polarization LINEAR_HORIZONTAL = fromString("linearHorizontal");

    /**
     * Creates or finds a Polarization from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Polarization.
     */
    @JsonCreator
    public static Polarization fromString(String name) {
        return fromString(name, Polarization.class);
    }

    /**
     * Gets known Polarization values.
     *
     * @return known Polarization values.
     */
    public static Collection<Polarization> values() {
        return values(Polarization.class);
    }
}