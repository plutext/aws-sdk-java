/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * AvailabilityZone StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailabilityZoneStaxUnmarshaller implements Unmarshaller<AvailabilityZone, StaxUnmarshallerContext> {

    public AvailabilityZone unmarshall(StaxUnmarshallerContext context) throws Exception {
        AvailabilityZone availabilityZone = new AvailabilityZone();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return availabilityZone;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("zoneState", targetDepth)) {
                    availabilityZone.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("messageSet", targetDepth)) {
                    availabilityZone.withMessages(new ArrayList<AvailabilityZoneMessage>());
                    continue;
                }

                if (context.testExpression("messageSet/item", targetDepth)) {
                    availabilityZone.withMessages(AvailabilityZoneMessageStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("regionName", targetDepth)) {
                    availabilityZone.setRegionName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("zoneName", targetDepth)) {
                    availabilityZone.setZoneName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("zoneId", targetDepth)) {
                    availabilityZone.setZoneId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return availabilityZone;
                }
            }
        }
    }

    private static AvailabilityZoneStaxUnmarshaller instance;

    public static AvailabilityZoneStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AvailabilityZoneStaxUnmarshaller();
        return instance;
    }
}
