/*
 * AbstractValue.java - This file is part of the Jakstab project.
 * Copyright 2008-2011 Johannes Kinder <kinder@cs.tu-darmstadt.de>
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, see <http://www.gnu.org/licenses/>.
 */
package org.jakstab.analysis;

import java.util.Set;

import org.jakstab.rtl.expressions.RTLNumber;

/**
 * @author Johannes Kinder
 */
public interface AbstractValue extends LatticeElement {

	/**
	 * If the abstract value can be concretized to a finite set of values,
	 * returns this set. Throws a runtime exception otherwise.
	 * 
	 * @return the set of concrete values corresponding to the abstract value.
	 */
	public Set<RTLNumber> concretize();
	
	
	/**
	 * Returns true if this abstract value represents only a single concrete 
	 * value.
	 */
	public boolean hasUniqueConcretization();
	
	@Override
	public AbstractValue join(LatticeElement l);
}