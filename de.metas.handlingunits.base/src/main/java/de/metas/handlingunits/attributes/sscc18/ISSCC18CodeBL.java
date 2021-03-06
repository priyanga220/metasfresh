package de.metas.handlingunits.attributes.sscc18;

/*
 * #%L
 * de.metas.handlingunits.base
 * %%
 * Copyright (C) 2015 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */


import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.adempiere.util.ISingletonService;

public interface ISSCC18CodeBL extends ISingletonService
{
	/**
	 * @param sscc18
	 * @return true if the check digit is correct, false otherwise
	 */
	boolean isCheckDigitValid(SSCC18 sscc18);

	/**
	 * Generates a new SSCC18 code for given serialNumber
	 *
	 * @param ctx
	 * @param serialNumber
	 * @return generated SSCC18; never return null
	 * @throws AdempiereException if serialNumber or ManufacturerCode is not valid
	 */
	SSCC18 generate(Properties ctx, int serialNumber);

	/**
	 * Converts given {@link SSCC18} code to String representation
	 *
	 * @param sscc18
	 * @param humanReadable
	 * @return SSCC18 string representation
	 */
	String toString(SSCC18 sscc18, boolean humanReadable);

	/**
	 * From the right to left, start with odd position, assign the odd/even position to each digit. Sum all digits in odd position and multiply the result by 3. Sum all digits in even position. Sum
	 * the results of step 3 and step 4. Divide the result of step 4 by 10. The check digit is the number which adds the remainder to 10.
	 *
	 * @see <a href="http://mdn.morovia.com/kb/Serial-Shipping-Container-Code-SSCC18-10601.html">SSCC18 - Check Digit Calculation</a>
	 *
	 * @param stringSSCC18ToVerify
	 * @return
	 */
	int computeCheckDigit(String stringSSCC18ToVerify);

	/**
	 * Validate the components of SSCC18
	 *
	 * throws exception if it's not valid
	 *
	 * @param sscc18ToValidate
	 */
	void validate(SSCC18 sscc18ToValidate);
}
