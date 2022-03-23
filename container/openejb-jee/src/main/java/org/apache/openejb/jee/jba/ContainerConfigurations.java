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

package org.apache.openejb.jee.jba;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "containerConfiguration"
})
@XmlRootElement(name = "container-configurations")
public class ContainerConfigurations {

    @XmlElement(name = "container-configuration")
    protected List<ContainerConfiguration> containerConfiguration;

    /**
     * Gets the value of the containerConfiguration property.
     *
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerConfiguration property.
     *
     *
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerConfiguration().add(newItem);
     * </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerConfiguration }
     */
    public List<ContainerConfiguration> getContainerConfiguration() {
        if (containerConfiguration == null) {
            containerConfiguration = new ArrayList<ContainerConfiguration>();
        }
        return this.containerConfiguration;
    }

}
