/* 
 * Copyright 2013-2020 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.02 at 02:29:48 PM CET
//
package org.modelio.bpmnxml.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for MessageVisibleKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageVisibleKind">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="initiating"/>
 * &lt;enumeration value="non_initiating"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@objid ("745ed2ce-53d8-4ade-8809-a01c259c5f45")
@XmlType(name = "MessageVisibleKind", namespace = "http://www.omg.org/spec/BPMN/20100524/DI")
@XmlEnum
public enum MessageVisibleKind {
    @objid ("d04c4d09-4278-4d19-8f28-0d62b847e5e7")
    @XmlEnumValue("initiating")
    INITIATING("initiating"),
    @objid ("d4965b3e-c436-4c91-8743-dfcc89dcf465")
    @XmlEnumValue("non_initiating")
    NON_INITIATING("non_initiating");

    @objid ("cffee82a-21f9-45a1-bd42-db0c3c3d5ac2")
    private final String value;

    @objid ("82cafa47-267d-45da-9b11-f67c0615ba0a")
     MessageVisibleKind(String v) {
        this.value = v;
    }

    @objid ("7d5f5705-ccb2-471f-b877-d517366d6ff0")
    public String value() {
        return this.value;
    }

    @objid ("1237e4c1-5b28-4a61-9144-f7f671d13616")
    public static MessageVisibleKind fromValue(String v) {
        for (MessageVisibleKind c: MessageVisibleKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
        
    }

}
