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
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.openejb.cdi;

import junit.framework.TestCase;
import org.apache.openejb.jee.Beans;
import org.apache.openejb.jee.SessionBean;
import org.apache.openejb.jee.SingletonBean;
import org.apache.openejb.junit.ApplicationComposer;
import org.apache.openejb.testing.Module;
import org.junit.Test;
import org.junit.runner.RunWith;

import jakarta.ejb.EJB;
import jakarta.ejb.Singleton;
import jakarta.inject.Inject;

/**
 * @version $Rev$ $Date$
 */
@RunWith(ApplicationComposer.class)
public class InjectionTest extends TestCase {

    @EJB
    private Orange orange;

    @Test
    public void test() throws Exception {

        assertNotNull(orange);
        assertNotNull(orange.getBlue());

    }

    @Module
    public SessionBean getEjbs() {
        return new SingletonBean(Orange.class);
    }

    @Module
    public Beans getBeans() {
        final Beans beans = new Beans();
        beans.addManagedClass(Blue.class);
        beans.addManagedClass(Green.class);
        return beans;
    }

    @Singleton
    public static class Orange {

        private Blue blue;

        @Inject
        public void setBlue(final Blue blue) {
            this.blue = blue;
        }

        public Blue getBlue() {
            return blue;
        }
    }

    public static class Blue {

        private Green green;

        public Blue() {
            "".length();
        }

        public Green getGreen() {
            return green;
        }

        @Inject
        public void setGreen(final Green green) {
            this.green = green;
        }
    }

    public static class Green {

        public Green() {
            "".length();
        }
    }
}
