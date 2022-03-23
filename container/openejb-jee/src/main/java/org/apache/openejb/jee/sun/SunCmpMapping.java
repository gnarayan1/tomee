/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.openejb.jee.sun;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "schema",
    "entityMapping"
})
public class SunCmpMapping {
    @XmlElement(required = true)
    protected String schema;
    @XmlElement(name = "entity-mapping", required = true)
    protected List<EntityMapping> entityMapping;

    public String getSchema() {
        return schema;
    }

    public void setSchema(final String value) {
        this.schema = value;
    }

    public List<EntityMapping> getEntityMapping() {
        if (entityMapping == null) {
            entityMapping = new ArrayList<EntityMapping>();
        }
        return this.entityMapping;
    }
}
