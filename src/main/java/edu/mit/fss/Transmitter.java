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
 * The {@link Transmitter} interface is based on the Radio Communications 
 * Protocol (RCP) in IEEE Std. 1278 for Distributed Interactive Simulation 
 * (DIS). A transmitter is the logical model of signal transmission and 
 * must provide accurate type and state information to receivers.
 * 
 * @author Paul T. Grogan, ptgrogan@mit.edu
 * @version 0.2.0
 * @since 0.1.0
 */
public interface Transmitter extends SimObject {
	
	/**
	 * Gets the owner element of this transmitter.
	 *
	 * @return the element
	 */
	public Element getElement();
	
	/**
	 * Gets the name of the owner element of this transmitter.
	 *
	 * @return the element name
	 */
	public String getElementName();
	
	/**
	 * Gets this transmitter's state string which is expected to 
	 * be dynamic (i.e. can change) during operations.
	 *
	 * @return the state
	 */
	public String getTransmitterState();
	
	/**
	 * Gets this transmitter's type string which is expected to
	 * remain static (i.e. not change) during operations.
	 *
	 * @return the type
	 */
	public String getTransmitterType();
}
