package de.metas.handlingunits.attribute.strategy;

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


import java.math.BigDecimal;

import org.compiere.model.I_C_UOM;
import org.compiere.model.I_M_Product;

import de.metas.handlingunits.IHUContext;
import de.metas.handlingunits.attribute.storage.IAttributeStorage;
import de.metas.handlingunits.storage.IHUStorage;

/**
 * Provides necessary data from to the transfer strategies when re-propagating values post-transfer to the other storage.
 *
 * @author al
 */
public interface IHUAttributeTransferRequest
{
	/**
	 * @return {@link IHUContext} in which the transfer is happening
	 */
	IHUContext getHUContext();

	/**
	 * @return product used in transfer between {@link IHUStorage}s
	 */
	I_M_Product getM_Product();

	/**
	 * @return qty to be transferred between {@link IHUStorage}s
	 */
	BigDecimal getQty();

	/**
	 * @return UOM used in transfer between {@link IHUStorage}s
	 */
	I_C_UOM getC_UOM();

	/**
	 * @return {@link IAttributeStorage} from which the attributes are transferred
	 */
	IAttributeStorage getAttributesFrom();

	/**
	 * @return {@link IAttributeStorage} to which the attributes are transferred
	 */
	IAttributeStorage getAttributesTo();

	/**
	 * @return {@link IHUStorage} from which the attributes are transferred
	 */
	IHUStorage getHUStorageFrom();

	/**
	 * @return {@link IHUStorage} to which the attributes are transferred
	 */
	IHUStorage getHUStorageTo();

	/**
	 * @return qty already unloaded (at the moment of the attribute transfer, the trxLines are not processed, so the ProductStorage changes are not persisted yet)
	 */
	BigDecimal getQtyUnloaded();

	/**
	 *
	 * @return true if this request is about transfering attributes between virtual HUs.
	 */
	boolean isVHUTransfer();
}
