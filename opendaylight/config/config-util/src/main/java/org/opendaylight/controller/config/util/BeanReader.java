/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.controller.config.util;

import javax.management.ObjectName;

/**
 * Created by mmarsale on 20.2.2015.
 */
public interface BeanReader {
    Object getAttributeCurrentValue(ObjectName on, String attributeName);
}