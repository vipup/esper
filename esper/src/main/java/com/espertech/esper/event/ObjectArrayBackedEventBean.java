/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.event;

import com.espertech.esper.client.EventBean;

/**
 * For events that are array of properties.
 */
public interface ObjectArrayBackedEventBean extends EventBean {
    /**
     * Returns property array.
     *
     * @return properties
     */
    public Object[] getProperties();

    public void setPropertyValues(Object[] objects);
}
