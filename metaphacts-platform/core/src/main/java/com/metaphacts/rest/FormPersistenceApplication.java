/*
 * Copyright (C) 2015-2019, metaphacts GmbH
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, you can receive a copy
 * of the GNU Lesser General Public License from http://www.gnu.org/
 */

package com.metaphacts.rest;

import com.metaphacts.rest.endpoint.FormPersistenceLdpEndpoint;
import com.metaphacts.rest.endpoint.FormPersistenceSparqlEndpoint;

import org.glassfish.hk2.api.ServiceLocator;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;

/**
 * @author Johannes Trame <jt@metaphacts.com>
 */
@ApplicationPath("form-persistence")
public class FormPersistenceApplication extends AbstractPlatformApplication {

    @Inject
    public FormPersistenceApplication(ServiceLocator serviceLocator) {
        super(serviceLocator);
        register(FormPersistenceLdpEndpoint.class);
        register(FormPersistenceSparqlEndpoint.class);
    }

}