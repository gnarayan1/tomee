/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.superbiz.myfaces.domain.validation;

import org.superbiz.myfaces.domain.User;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DifferentNameValidator implements ConstraintValidator<DifferentName, User> {

    public void initialize(final DifferentName differentName) {
    }

    public boolean isValid(final User person, final ConstraintValidatorContext constraintValidatorContext) {
        return person == null || !(person.getFirstName() != null && person.getFirstName().equals(person.getLastName()));
    }
}
