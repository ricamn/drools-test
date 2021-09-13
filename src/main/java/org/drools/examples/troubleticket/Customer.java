/*
 * Copyright 2010 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.examples.troubleticket;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String name;
    private String subscription;
    private String project;
    private Map<String, String> options;
    private Map<String, Map<String, String>> complexOptions;


    public Customer() {
    }

    public Customer(final String name,
                    final String project,
                    final String subscription) {
        super();
        this.name = name;
        this.project = project;
        this.subscription = subscription;

        this.options = new HashMap<>();

        this.complexOptions = new HashMap<>();
        final Map<String, String> complex = new HashMap<>();
        this.complexOptions.put("COMPLEX_OPTION", complex);
    }

    public String getName() {
        return this.name;
    }

    public String getSubscription() {
        return this.subscription;
    }

    public String getProject() {
        return this.project;
    }

    public String toString() {
        return "[Customer " + this.name + " : " + this.project + " : " + this.subscription + "]";
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    public Map<String, Map<String, String>> getComplexOptions() {
        return complexOptions;
    }

    public void setComplexOptions(Map<String, Map<String, String>> complexOptions) {
        this.complexOptions = complexOptions;
    }
}
