// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Removes elisions. For example, "l'avion" (the plane) will be converted to "avion" (plane). This token filter is
 * implemented using Apache Lucene.
 */
@Fluent
public final class ElisionTokenFilter extends TokenFilter {

    /*
     * The set of articles to remove.
     */
    private List<String> articles;

    /**
     * Creates an instance of ElisionTokenFilter class.
     *
     * @param name the name value to set.
     */
    public ElisionTokenFilter(String name) {
        super(name);
    }

    /**
     * Get the articles property: The set of articles to remove.
     *
     * @return the articles value.
     */
    public List<String> getArticles() {
        return this.articles;
    }

    /**
     * Set the articles property: The set of articles to remove.
     *
     * @param articles the articles value to set.
     * @return the ElisionTokenFilter object itself.
     */
    public ElisionTokenFilter setArticles(List<String> articles) {
        this.articles = articles;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", "#Microsoft.Azure.Search.ElisionTokenFilter");
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeArrayField("articles", this.articles, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ElisionTokenFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ElisionTokenFilter if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the ElisionTokenFilter.
     */
    public static ElisionTokenFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    List<String> articles = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();
                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!"#Microsoft.Azure.Search.ElisionTokenFilter".equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.ElisionTokenFilter'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("articles".equals(fieldName)) {
                            articles = reader.readArray(reader1 -> reader1.getString());
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound) {
                        ElisionTokenFilter deserializedElisionTokenFilter = new ElisionTokenFilter(name);
                        deserializedElisionTokenFilter.articles = articles;
                        return deserializedElisionTokenFilter;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }
                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }

    /**
     * Set the articles property: The set of articles to remove.
     *
     * @param articles the articles value to set.
     * @return the ElisionTokenFilter object itself.
     */
    public ElisionTokenFilter setArticles(String... articles) {
        this.articles = (articles == null) ? null : java.util.Arrays.asList(articles);
        return this;
    }
}
