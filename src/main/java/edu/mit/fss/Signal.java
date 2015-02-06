/*
 * Copyright 2015 Paul T. Grogan
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.mit.fss;

/**
 * A signal interaction event.
 * 
 * @author Paul T. Grogan, ptgrogan@mit.edu
 * @version 0.2.0
 * @since 0.1.0
 */
public interface Signal extends SimInteraction {
	
	/**
	 * Gets the content of this signal.
	 *
	 * @return the content
	 */
	public String getContent();
	
	/**
	 * Gets the element sending this signal.
	 *
	 * @return the element
	 */
	public Element getElement();
	
	/**
	 * Gets the name of the element sending this signal.
	 *
	 * @return the element name
	 */
	public String getElementName();
	
	/**
	 * Gets the transmitter sending this signal.
	 *
	 * @return the transmitter
	 */
	public Transmitter getTransmitter();
	
	/**
	 * Gets the name of the transmitter sending this signal.
	 *
	 * @return the transmitter name
	 */
	public String getTransmitterName();
	
	/**
	 * Gets this signal's type.
	 *
	 * @return the signal type
	 */
	public String getType();
}